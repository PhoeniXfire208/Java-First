import java.util.*;
import java.util.Scanner;
import java.math.*;


public class Main {
    public static long factorialUsingForLoop(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }


    public static void main(String[] args) {
        System.out.println("(14)a.выпишите всевозможные комбинации, состоящие из двух слов заданного предложения;\n" +
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

        switch (x) {
            case "a":
                StringBuilder sb = new StringBuilder();
                String str2 = new String();
                String str3 = new String();

                System.out.println("Введите строку");
                String str = in.nextLine();
                str3 = str;

                String[] mas = str.split(" ");

                for (int i = mas.length - 1; i >= 0; i--) {
                    sb.append(mas[i] + " ");
                }
                System.out.println("\nКомбинации");

                System.out.println(sb.toString().trim());
                System.out.println(str3);
                break;
            case "b":
                System.out.println("Введите слова одной строкой через пробел(Минимум 3 слова)");
                String input = in.nextLine();
                int count = 0;

                if (input.length() != 0) {
                    count++;
                    for (int i = 0; i < input.length(); i++) {
                        if (input.charAt(i) == ' ') {
                            count++;
                        }
                    }
                }
                if (count >= 3) {
                    System.out.println("Вы ввели " + count + " слов");

                    long stat = factorialUsingForLoop(count) / factorialUsingForLoop(count - 3);
                    System.out.println("Существует " + stat + " различных комбинаций по 3 слова");
                } else {
                    System.out.println("Вы ввели менее 3-х слов");
                }

                break;

            case "c":

                int[] mask = new int[2];
                int k = 0;

                System.out.println("Введите 2 элемента");

                mask[0] = in.nextInt();
                mask[1] = in.nextInt();

                System.out.println("");

                for (int i = 0; i <= 1; i++) {
                    for (int j = 0; j <= 1; j++) {
                        if (mask[i] * 2 >= mask[j]) {
                            //System.out.print("Не подходит ");
                        } else {
                            k++;
                            //System.out.print("Подходит ");
                        }
                        //System.out.println(mask[i]+" "+mask[j]);

                    }
                }
                System.out.println("Кол-во нужных комбинаций");
                System.out.println(k);
                break;

            case "d":
                System.out.println("Введите предложение");

                String words = in.nextLine();
                int c = 0;
                int v = 0;
                int length = words.length();
                String vowels = "аяуюоеёэиыАЯУЮОЕЁЭИЫ>";
                //System.out.println(length);

                for (int check = 0; check < length; ++check)
                    {
                        char a = words.charAt(check);
                        if ((a >= 'а' && a <= 'я') || (a >= 'А' && a <= 'Я')) {
                            if (vowels.indexOf(a) != -1)
                                v++;
                            else
                                c++;
                        }
                    }
                    System.out.println("Согласных букв: " + c );
                    break;

                }

        }
    }

