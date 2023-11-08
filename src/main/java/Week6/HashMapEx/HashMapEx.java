package Week6.HashMapEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("matti", "mage");
        names.put("mikael", "mixu");
        names.put("arto","arppa");
        System.out.println(names.get("mikael"));

        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);


        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
        System.out.println(mattisNote.howMuchIsTheDebt("Joel"));

        mattisNote.setLoan("Arto", 10.5);
        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));

        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        System.out.println(dictionary.amountOfWords());


        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.amountOfWords());


        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));

        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }

        Dictionary dictionary1 = new Dictionary();
        Scanner reader = new Scanner(System.in);

        TextUserInterface ui = new TextUserInterface(reader, dictionary1);
        ui.start();
    }
}
