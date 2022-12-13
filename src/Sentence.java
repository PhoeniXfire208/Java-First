public class Sentence
{
    public int kol_words;

    public Sentence(String str)
    {
        //разбиваем строку на несколько слов
        String[] mas = str.split(" ");
        kol_words=mas.length;

        System.out.println("Вы ввели " + kol_words + " слов");
        System.out.println("\nКомбинации");

        for (int i = mas.length - 1; i >= 0; i--)
        {
            for (int j = mas.length - 1; j >= 0; j--)
            {
                System.out.print(mas[i] + " " + mas[j]+ "\n");
            }
        }
    }
}
