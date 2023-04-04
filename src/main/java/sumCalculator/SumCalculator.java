package sumCalculator;

public class SumCalculator {
    public int sumCalculator(int number)
    {
        int rez = 0;
        if (number == 0) {
            throw new IllegalArgumentException();
        }
        else {
            for (int i = 1; i <= number; i++)
                rez += i;
        }
        return rez;
    }

}
