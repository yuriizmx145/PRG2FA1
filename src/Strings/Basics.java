package Strings;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
//        char input = 'A';
//        input = '9';
//        System.out.println(input + 1);
//        input = '\n';//odradkovani
//        System.out.println("Hello" + input + "World");
//        input = '\t';//tabulator
//        System.out.println("Hello" + input + "World");
//        //porovnavani?
//        char a = 'a';
//        char A = 'A';
//        if (a == A){
//            System.out.println("They're same");
//        }
//
//        String hello = "Hello!";
//        Scanner sc = new Scanner(System.in);
//        String ehlo = sc.nextLine();
//        System.out.println("Zadal jsi " + ehlo);
//        //problem s "Hello!\ESC"
//        //! U stringu se nepouzivaji ==
//        if (hello == ehlo){
//            System.out.println("They're same (==)");
//        }
//        //pouziva se
//        if (hello.equals(ehlo)){
//            System.out.println("They're same (equals)");
//        }

        String showcase = "Obsah \t\t str\ningu\n\n\n\n\n:)";
        System.out.println(showcase);
        String more = showcase + "Hello";
        System.out.println(more);
        //Case sensitive
        boolean isSame ="hello".equals("HeLlO");
        String helloTest = "hello";
        helloTest.equals("Neco dlasiho");//rovna se
        String upperHello = helloTest.toUpperCase();
        //po zavolani se puvodni nezmeni
        System.out.println(helloTest);
        System.out.println(upperHello);
        System.out.println("Pismeno na 2: " + helloTest.charAt(2));
        System.out.println("Kde je 'l'? " + helloTest.indexOf('l'));
        System.out.println("Kde je 'l'? " + helloTest.lastIndexOf('l'));
    }
}
