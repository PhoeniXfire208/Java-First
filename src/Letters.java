public class Letters
{
    private String words__;
    public int consonants; //кол-во согласных букв в предложении

    Letters(String words__)
    {
        int length = words__.length();

        String vowels = "бвгджйзклмнпрстфхцчшщБВГДЖЙЗКЛМНПРСТФХЦЧШЩ";

        for (int i = 0; i < length; ++i)
        {
            //определяет сколько символов в предложении
            char a = words__.charAt(i);
            //Проверяет буквы в таблице символов
            if ((a >= 'а' && a <= 'я') || (a >= 'А' && a <= 'Я'))
            {
                //vowels.indexOf(a) выдаёт номер согласной буквы в String vowels
                if (vowels.indexOf(a) != -1)
                {
                    consonants++;
                }
                //System.out.println(vowels.indexOf(a));
            }
        }
    }
}
