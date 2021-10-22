package huaweijishi;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//public class HJ10_zifugeshu {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        String str="";
//        int max=0;
//        for (int i = 0; i < s.length(); i++) {
//            if(!str.contains(s.substring(i,i+1))){
//                max++;
//                str+=s.substring(i,i+1);
//            }
//        }
//        System.out.println(max);
//    }
//}


public class HJ10_zifugeshu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
//        //总共有128个字符。字需要用128位
//        BitSet bitSet = new BitSet(128);
//        for (char c : line.toCharArray()) {
//            //判断字符c是否已出现
//            if (!bitSet.get(c)) {
//                //未出现就设置为已出现
//                bitSet.set(c);
//            }
//        }
//        //统计有多少字符已出现过
//        System.out.println(bitSet.cardinality());

        HashSet<Character> characters = new HashSet<>();
        for(char c:line.toCharArray()){
            characters.add(c);
        }
        System.out.println(characters.size());

    }
}
