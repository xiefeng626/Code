package huaweijishi;

import java.util.Scanner;

public class Hj100_dengchashulie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int s = scanner.nextInt();
            System.out.println((3*s+1)*s/2);
        }
    }
}
