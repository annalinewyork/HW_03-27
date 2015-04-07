package nyc.c4q.annalinewyork;

import java.util.Scanner;

/**
 * Class for Encoding and Decoding CaesarCiphers
 */
public class CaesarCipher {

    public static String decode(String enc, int offset) {
        return encode(enc, 26 - offset);
    }

    public static String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

    public static boolean codeBreaker(String cipher1, String cipher2) {

        String decode1 = decode(cipher1, 2);
        String decode2 = decode(cipher2, 3);

        return decode1.equals(decode2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to encode");

        String input1 = sc.nextLine();
        String encoded1 = CaesarCipher.encode(input1, 2);
        System.out.println(encoded1);

        String input2 = sc.nextLine();
        String encoded2 = CaesarCipher.encode(input2, 3);
        System.out.println(encoded2);


        System.out.println(codeBreaker(input1, input2));


    }
}

