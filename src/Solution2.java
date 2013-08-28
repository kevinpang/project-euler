
public class Solution2 implements Solution {
  @Override
  public void run() {
    long fib1 = 1;
    long fib2 = 2;
    long sum = 2;
    while (fib2 < 4000000) {
      long temp = fib1;
      fib1 = fib2;
      fib2 += temp;
      if (fib2 % 2 == 0) {
        sum += fib2;
      }
    }
    System.out.println(sum);
  }
}
