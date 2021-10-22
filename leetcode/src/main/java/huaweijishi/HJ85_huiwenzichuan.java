package huaweijishi;

import java.util.*;

public class HJ85_huiwenzichuan {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            for(int j=s.length();j>i;j--){
                if(s.substring(i,j).equals(new StringBuilder(s.substring(i,j)).reverse().toString())){
                    max = j-i>max?j-i:max;
                }
            }
        }
        System.out.println(max);
    }
}

