package huaweijishi;

import java.util.Scanner;

public class HJ46_jiezifuchuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String s = scanner.nextLine();
            String  i = scanner.nextLine();
            System.out.println(s.substring(0, Integer.valueOf(i)));
        }
    }
}
