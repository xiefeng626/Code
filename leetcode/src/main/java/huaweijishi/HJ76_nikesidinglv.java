package huaweijishi;

import java.math.BigInteger;
import java.util.Scanner;

public class HJ76_nikesidinglv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int m = scanner.nextInt();
            long startNum = ((m * (m - 1)) / 2 + 1) * 2 - 1;
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < m; i++) {
                stringBuilder.append(startNum + i * 2);
                if(i<m-1){
                    stringBuilder.append("+");
                }
            }
            System.out.println(stringBuilder);
        }
    }
}
