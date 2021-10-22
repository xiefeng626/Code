package huaweijishi;

import java.util.Scanner;

public class HJ106_zifunixu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(s);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);
    }
}
