package huaweijishi;

import java.util.Scanner;


public class HJ11_ReverseInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(s);
        System.out.println(stringBuffer.reverse());
    }
}
