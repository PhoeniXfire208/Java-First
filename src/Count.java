public class Count
{
    private int count;
    public long kol_comb3; //кол-во комбинаций из 3-х слов

    Count(int count)
    {
        kol_comb3 = 0;
        kol_comb3 = factorial(count) / factorial(count - 3);
    }

    long factorial(int count)
    {
        long fact = 1;
        for (int i = 2; i <= count; i++)
            fact = fact * i;
        return fact;
    }
}
