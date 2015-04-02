package nyc.c4q.annalinewyork;

import java.util.Scanner;


public class uniqueCharacters {

    public static void main(String[] args) {

        System.out.println("Give me some characters");
        Scanner scanner = new Scanner(System.in);
        String userinput = scanner.next().toLowerCase();
        //ask user to input letters, and make all input letters is lowercase.
        System.out.println(uniqueC(userinput));

    }

    public static String uniqueC(String words) {

        String inputletters = "";

        for (int i = 0; i < words.length(); i++) {
            if (!inputletters.contains(Character.toString(words.charAt(i)))){
                inputletters = inputletters + words.charAt(i);
        /*
        assume user input is "aabbcc"
        i =0, so first letter is "a", check if userinput NOT contains "a". need to transfer Character "a" to String "a",
        words.charAt(i): now i =0, 0 is "a".
        now I find the if statement is TRUE, userinput doesn't have "a",
        then we put this "a" into a empty box "string inputletters" to hold it.

        now i=1, so second letter is another "a", check it and find out the if statement is FALSE, since we have a "a" before,
        so for loop stops here. and now i = 2, third letter is "b"........
        */
            }
        }
        return inputletters;
    }
}









