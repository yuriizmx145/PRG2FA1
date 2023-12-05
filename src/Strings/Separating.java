package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Separating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Uzivatel zada nazev pisnicky, autora, rok vydani
        //vse ulozime do jednotlivych retezcu
        String input ="Dream on;Aerosmith;(1973)";
        String songName;
        String author;
        String yearOfRelease;
        //ukazka - split
        String[] splitSong = input.split(";");
        System.out.println(Arrays.toString(splitSong));
        songName = splitSong[0];
        author = splitSong[1];
        yearOfRelease = splitSong[2];
        System.out.println("Song " + songName + " composed by " +
                author + " in " + yearOfRelease);
        String greetings = "Hello beautiful world";
        String[] words = greetings.split(" ");
        System.out.println(Arrays.toString(words));

        //Ukazka substring
        String word = "Hello";
        String subWord = word.substring(0,4);
        //interval: vsechny znaky na indexu <0, 4)
        System.out.println(word + " -> " + subWord);
        String spanishSuffix = word.substring(1,3);
        System.out.println(spanishSuffix + " Camino");

        //Vezmi string ve kterem je cislo a pricti k nemu 42
        String number = "450";
        System.out.println(number + 42);
        int actualNumber = Integer.parseInt(number);
        System.out.println("number is: " + actualNumber);
        System.out.println("Soucet je: " + (actualNumber + 42));
    }
}
