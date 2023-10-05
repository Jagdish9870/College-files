import java.util.Scanner;

public class findACharacterVowelOrCons {
    public static void main(String[] args) {

        Scanner f= new Scanner(System.in);
        System.out.println("Enter a character");
       char ch=f.next().charAt(0);
       // char ch='i';
               if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                System.out.println("character is vowel");
               }
               else System.out.println("character is consonant");
        f.close();
    }
    
}
