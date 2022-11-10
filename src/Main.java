import java.util.*;
import java.util.Scanner;
import java.math.*;

    public class Main
    {
        public static long factorial(int n)
        {
            long fact = 1;
            for (int i = 2; i <= n; i++)
                fact = fact * i;
            return fact;
        }

        public static void First(String str)
        {
            StringBuilder sb = new StringBuilder();
            String str3 = new String();
            str3 = str;

            //разбиваем строку на несколько слов
            String[] mas = str.split(" ");

            for (int i = mas.length - 1; i >= 0; i--)
            {
                sb.append(mas[i] + " ");
            }

            System.out.println("\nКомбинации");

            System.out.println(sb.toString().trim());
            System.out.println(str3);

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

                long stat = factorial(count) / factorial(count - 3);

                System.out.println("Существует " + stat + " различных комбинаций по 3 слова");
            }
            else
            {
                System.out.println("Вы ввели менее 3-х слов");
            }
        }

        public static void Third(int g1,int g2)
        {
            int[] mask = new int[2];
            mask[0] = g1;
            mask[1] = g2;
            int k = 0;

            System.out.println("");

            for (int i = 0; i <= 1; i++)
            {
                for (int j = 0; j <= 1; j++)
                {
                    if (mask[i] * 2 < mask[j])
                    {
                        k++;
                        System.out.println(mask[i]+" да "+mask[j]);
                    }
                    else
                    {
                        System.out.println(mask[i]+" нет "+mask[j]);
                    }
                }
            }

            System.out.println("Кол-во нужных комбинаций");
            System.out.println(k);
        }

        public static void Fourth(String words__)
        {
            int c = 0;

            int length = words__.length();

            String vowels = "аяуюоеёэиыАЯУЮОЕЁЭИЫ";
            for (int check = 0; check < length; ++check)
            {
                char a = words__.charAt(check);
                if ((a >= 'а' && a <= 'я') || (a >= 'А' && a <= 'Я')) {
                    //vowels.indexOf(a) выдаёт номер гласной буквы в String vowels
                    if (vowels.indexOf(a) != -1)
                    {
                        //v++;
                    }
                    //if (vowels.indexOf(a) == -1)
                    else
                    {
                        c++;
                    }
                }
            }
            System.out.println("Согласных букв: " + c );
        }

        public static void main(String[] args)
        {
            System.out.println("(14)\na.выпишите всевозможные комбинации, состоящие из двух слов заданного предложения;\n" +
                    "\n" +
                    "b.определите количество возможных комбинаций из каждых трех слов заданного предложения;\n" +
                    "\n" +
                    "c.дан одномерный числовой массив, определить число\n всевозможных комбинаций из\n двух элементов данного массива таким образом чтобы\n первый элемент в паре был\n меньше второго более чем в два раза;\n" +
                    "\n" +
                    "d.найдите число согласных букв в предложении.\n");

            Scanner in = new Scanner(System.in);

            System.out.println("Выберите задачу (по букве)");
            String x = in.nextLine();
            System.out.println("");

            switch (x)
            {
                case "a":
                    System.out.println("Введите 2 слова через пробел");
                    String str = in.nextLine();
                    First(str);

                    break;

                case "b":
                    System.out.println("Введите слова одной строкой через пробел(Минимум 3 слова)");
                    String words_ = in.nextLine();
                    Second(words_);

                    break;

                case "c":


                    System.out.println("Введите 2 элемента (цифры или числа)");

                    int g1 = in.nextInt();
                    int g2 = in.nextInt();

                    Third(g1,g2);
                   break;

                case "d":
                    System.out.println("Введите предложение");

                    String words__ = in.nextLine();

                    Fourth(words__);

                    break;
            }
        }
    }

