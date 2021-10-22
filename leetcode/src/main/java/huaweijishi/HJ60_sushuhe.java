package huaweijishi;

import java.util.ArrayList;
import java.util.Scanner;

public class HJ60_sushuhe {
  public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
      ArrayList<Integer> integers = new ArrayList<>();
      while(scanner.hasNext()) {
          int s = scanner.nextInt();
          //找到所有不大于该数字的素数
          outer:
          for (int i = 2; i <= s; i++) {
              for (int j = 2; j < i; j++) {
                  if (i % j == 0) continue outer;
              }
              integers.add(i);
          }

          for (int i = 0; i < integers.size(); i++) {
              System.out.println(integers.get(i));
          }
      }
  }
}
