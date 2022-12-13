import java.util.Scanner;
public class Menu
{
    public static void First(String str)
    {
        Sentence first = new Sentence(str);
    }

    public static void Second(String words_)
    {
        int count = 0;

        if (words_.length() != 0)
        {
            count++;
            for (int i = 0; i < words_.length(); i++)
            {
                //определяет, сколько слов предложении
                if (words_.charAt(i) == ' ')
                {
                    count++;
                }
            }
        }
        if (count >= 3)
        {
            System.out.println("Вы ввели " + count + " слов");

            Count second = new Count(count);

            System.out.println("Существует " + second.kol_comb3 + " различных комбинаций по 3 слова");
        }
        else
        {
            System.out.println("Вы ввели менее 3-х слов");
        }
    }

    public static void Third(int kol)
    {
        System.out.println("Введите числа");

        Comb third = new Comb(kol);

        System.out.println("Кол-во нужных комбинаций");
        System.out.println(third.kol_comb_x2);
    }

    public static void Fourth(String words__)
    {
        Letters third = new Letters(words__);

        System.out.println("Согласных букв: " + third.consonants);
    }

    Menu()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите задачу (по букве)");
        String x = in.nextLine();
        System.out.println("");

        switch (x)
        {
            case "a":
                System.out.println("Введите слова через пробел");
                String str = in.nextLine();
                First(str);

                break;

            case "b":
                System.out.println("Введите слова одной строкой через пробел(Минимум 3 слова)");
                String words_ = in.nextLine();
                Second(words_);

                break;

            case "c":
                System.out.println("Введите кол-во чисел");
                int kol = in.nextInt();
                Third(kol);

                break;

            case "d":
                System.out.println("Введите предложение");
                String words__ = in.nextLine();
                Fourth(words__);

                break;
            default:
                System.out.println("Такой задачи не существует");
        }
    }
}
