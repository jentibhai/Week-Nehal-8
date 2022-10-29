package week8nehal;

import java.util.Scanner;

public class P3VowelConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Alphabet :");
        String Enter = sc.next().toLowerCase();

        boolean uppercase = Enter.charAt(0) >=5 && Enter.charAt(0)<=10;
        boolean lowercase = Enter.charAt(0) >=10 && Enter.charAt(0)<=20;
        boolean vowel =Enter.equals("a")||Enter.equals("u");

        if (Enter.length()>1) {
            System.out.println("Print an Error message :");


        }else if (vowel){
            System.out.println("Letter is a Vowel");
        }else{
            System.out.println("Letter is a Consonant");
        }


    }
}
