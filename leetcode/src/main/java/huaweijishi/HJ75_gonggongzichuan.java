package huaweijishi;

import java.util.Scanner;

public class HJ75_gonggongzichuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ss1 = scanner.nextLine();
        String ss2 = scanner.nextLine();
        String s1 = ss1.length()>ss2.length()? ss2:ss1;
        String s2 = ss2.length()<ss1.length()? ss1:ss2;
        int n=0;

        for (int i = 0; i < s1.length(); i++) {
            for (int j = s1.length(); j >i ; j--) {
                if(s2.contains(s1.substring(i,j))){
                    n=j-i>n?j-i:n;
                    continue;
                }
            }
        }
        System.out.println(n);


    }
}

