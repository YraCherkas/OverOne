package by.ycherkas.homeWorkOfString;


import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        String text = "У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо — песнь заводит,\n" +
                "Налево — сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит;\n" +
                "Там на неведомых дорожках\n" +
                "Следы невиданных зверей;";

        //Task 1
//        String[] words = text.split(" ");
//        for (String word : words) {
//            String wordWithoutSpace = word.trim();
//            System.out.println(wordWithoutSpace);
//        }

        // task 2
//        String e = text.replace( 'ё', 'е').replace( 'а', 'я');
//        System.out.println(e);

        // Task 3
//        String s5 = "И днём и ночью";
//        int ind = text.indexOf(s5);
//        String s1 = text.substring(0 , ind-1).trim();
//        String s2 = text.substring(ind+s5.length()).trim();
//        System.out.println(text.join("",s1 + '\n', s2));

        //Task3ver2
//        int num1 = text.indexOf('И');
//        int num2 = text.indexOf('ю');
//        String s1 = text.substring(0 , num1);
//        String s2 = text.substring(num2+1);
//        System.out.println(s1.trim() + '\n' + s2.trim());

//        System.out.println(outBefore + '\n');
//        System.out.println(outAfter);
//        System.out.println(numberU+1);


        // task 4
//        System.out.println(text.toLowerCase());

        //task 5
//        System.out.println(text.toUpperCase());

        //Task6
//        String[] strings = text.split("\n");
//        for (String str: strings) {
//            String fish = "Русалка на ветвях сидит;";
//            if (fish.equals(str)) {
//                System.out.println(fish.equals(str));
//            }
//        }

        //Task 7
//        String result = " ";
//        for (int i = 0; i < text.length(); i++) {
//            result = text.charAt(i) + result;
//
//        }
//        System.out.println(result.trim());

        //task7ver2
//        StringBuffer stringBuffer = new StringBuffer(text);
//        System.out.println(stringBuffer.reverse());

        //Task8
        String t1 = "У лукоморья дуб зелёный;";
        String t2 = "Златая цепь на дубе том:";
        String t3 = "И днём и ночью кот учёный";
        String t4 = "Всё ходит по цепи кругом;";
        String t5 = "Идёт направо — песнь заводит,";
        String t6 = "Налево — сказку говорит.";
        String t7 = "Там чудеса: там леший бродит,";
        String t8 = "Русалка на ветвях сидит;";
        String t9 = "Там на неведомых дорожках";
        String t10 = "Следы невиданных зверей;";

        boolean str = t1.equals(t2);
        boolean str2 = t3.equals(t4);
        boolean str3 = t5.equals(t6);
        boolean str4 = t7.equals(t8);
        boolean str5 = t9.equals(t10);

        System.out.println("str= " + str);
        System.out.println("str2= " + str2);
        System.out.println("str3= " + str3);
        System.out.println("str4= " + str4);
        System.out.println("str5= " + str5);
        System.out.println("Сравнение 1-й и 2-й ссылок = " +(t1==t2));
        System.out.println("Сравнение 3-й и 4-й ссылок = " + (t3==t4));
        System.out.println("Сравнение 5-й и 6-й ссылок = " + (t5==t6));
        System.out.println("Сравнение 7-й и 8-й ссылок = " + (t7==t8));
        System.out.println("Сравнение 9-й и 10-й ссылок = " + (t9==t10));

    }
}
