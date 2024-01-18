package basicstats;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BasicStatsTest {
  private static double EPS = 1e-9;

  @Test
  public void testCentralTendency() {
    double[] numbers = {2, 2, 3, 3, 3, 4, 4};
    double mean = BasicStats.mean(numbers);
    assertEquals(3, mean, EPS);
    double median = BasicStats.median(numbers);
    assertEquals(3, median, EPS);
    double mode = BasicStats.mode(numbers);
    assertEquals(3, mode, EPS);
  }
}
