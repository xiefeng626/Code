package huaweijishi;

import java.util.Scanner;
public class HJ87_mimaqiangdu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            int length = s.length();
            int source = 0;
            if (length <= 4) source += 5;
            if (5 <= length && length <= 7) source += 10;
            if (length >= 8) source += 25;

            //判断字母
            char[] chars = s.toCharArray();
            int numNum = 0;
            int samllNum = 0;
            int bigNum = 0;
            int xxNum = 0;
            for (int i = 0; i < chars.length; i++) {
                int n = chars[i];
                if (n >= 48 && n <= 57) numNum++;
                if (n >= 65 && n <= 90) bigNum++;
                if (n >= 97 && n <= 122) samllNum++;
                if ((n >= 32 && n <= 47) || (n > 57 && n < 65) || (n > 90 && n < 97) || (n > 122 && n <= 126)) xxNum++;
            }

            if (bigNum == 0 || samllNum == 0) source += 10;
            if (bigNum != 0 && samllNum != 0) source += 20;
            if (numNum == 1) source += 10;
            if (numNum > 1) source += 20;
            if (xxNum == 1) source += 10;
            if (xxNum > 1) source += 25;
            if (numNum != 0 && bigNum != 0 && samllNum != 0 && xxNum != 0)
                source += 5;
            else if (numNum > 0 && samllNum + bigNum > 0 && xxNum > 0) source += 3;
            else if (numNum > 0 && samllNum + bigNum > 0) source += 2;

            System.out.println(source);

            if (source >= 90) System.out.println("VERY_SECURE");
            else if (source >= 80) System.out.println("SECURE");
            else if (source >= 70) System.out.println("VERY_STRONG");
            else if (source >= 60) System.out.println("STRONG");
            else if (source >= 50) System.out.println("AVERAGE");
            else if (source >= 25) System.out.println("WEAK");
            else if (source >= 0) System.out.println("VERY_WEAK");

        }
    }
}
