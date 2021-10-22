package huaweijishi;

import java.util.Scanner;

public class HJ86_bitnumber {
    public static void main(String[] args) {

        String sss="123456789";
        System.out.println(sss.substring(1,3));

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int i = scanner.nextInt();
            String s = Integer.toBinaryString(i);
            char[] chars = s.toCharArray();
            int max=0,n=0;
            for (int j = 0; j < chars.length; j++) {
                if(chars[j]=='1'){
                    n++;
                    max=n>max? n:max;
                }else{
                    n=0;
                }

            }
            System.out.println(max);
        }
    }
}
