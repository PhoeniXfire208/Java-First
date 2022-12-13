import java.util.Scanner;

public class Comb
{
    public int kol_comb_x2; //кол-во комбинаций по 2 слова, где 1 эл > 2 эл более чем в 2 раза
    private int kol;

    Scanner in = new Scanner(System.in);

    Comb(int kol)
    {
        kol_comb_x2 = 0;

        int[] mask = new int[kol];

        for(int m = 0;m < kol; m++)
        {
            mask[m] = in.nextInt();
        }
        for (int i = 0; i < kol; i++)
        {
            for (int j = 0; j < kol; j++)
            {
                if (mask[i] * 2 < mask[j])
                {
                    kol_comb_x2++;
                    //System.out.println(mask[i] + " да " + mask[j]);
                }
                else
                {
                    //System.out.println(mask[i] + " нет " + mask[j]);
                }
            }
        }
    }
}
