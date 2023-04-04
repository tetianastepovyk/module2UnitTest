package sumCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        //Given
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testThatSumOfNumberOneWorksCorrect() {
        //When
        int actual = sumCalculator.sumCalculator(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumOfNumberThreeWorksCorrect() {
        //When
        int actual = sumCalculator.sumCalculator(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testThatSumOfNumberZeroWorksCorrect() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sumCalculator(0));
    }
}