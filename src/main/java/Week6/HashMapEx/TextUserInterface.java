package Week6.HashMapEx;

import java.util.Scanner;

public class TextUserInterface {
    Scanner reader;
    Dictionary dictionary;
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    public void start(){
        System.out.println("Statement:");
        System.out.println("   quit - quit the next user interface");
        System.out.println();
        System.out.print("Statement: ");
        String statement = reader.nextLine();
        while(!statement.equals("quit")){
            if(statement.equals("quit")){
                System.out.println("Cheers!");
            } else if (statement.equals("add")) {
                System.out.print("In Finnish: ");
                String word = reader.nextLine();

                System.out.print("Translation: ");
                String value = reader.nextLine();

                dictionary.add(word, value);
            } else if (statement.equals("translate")) {
                System.out.print("Give a word: ");
                String word = reader.nextLine();


                System.out.println("Translation: " + dictionary.translate(word));
            } else {
                System.out.println("Unknown statement");
                System.out.println();
            }
            System.out.println();
            System.out.print("Statement: ");
            statement = reader.nextLine();
        }
        System.out.println("Cheers!");
    }
}
