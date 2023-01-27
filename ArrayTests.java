import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }


  @Test 
	public void testAverageWithoutLowest1() {
    double[] input1 = {9.0,8.0,7.0,6.0};
    double output = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(8.0, output,0);
  }
  @Test 
	public void testAverageWithoutLowest2() {
    double[] input1 = {6,6,6,7,8};
    double output = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(6.75, output,0);
  }
}
