import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

public class Runner {
  public static void main(String[] args) {
    Stopwatch stopwatch = new Stopwatch();
    int solutionNumber = 1;
    while (true) {
      try {
        Class<?> c = Class.forName("Solution" + solutionNumber);
        Object solution = c.newInstance();
        System.out.println("Running solution " + solutionNumber + "...");
        stopwatch.start();
        ((Solution) solution).run();
        stopwatch.stop();
        System.out.println("Solution " + solutionNumber + " finished in "
            + stopwatch.elapsed(TimeUnit.MILLISECONDS) + "ms");
        stopwatch.reset();
        solutionNumber++;
      } catch (ClassNotFoundException e) {
        break;
      } catch (InstantiationException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
    }
  }
}
