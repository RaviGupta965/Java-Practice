import java.util.Scanner;
public class scanner_prac {
    public static void main(String[] args) {
        // Scanner definition
        Scanner scn = new Scanner(System.in);

        // input is a string(one word)
        // read by next() method
        String str1 = scn.nextLine();

        // print string
        System.out.println("Entered String str1: " + str1);

        // input is a string(complete Sentence)
        // read by nextLine() method
        String str2 = scn.nextLine();

        // print string
        System.out.println("Entered String str2: " + str2);

        // input is an integer
        // read by nextInt() method
        int x = scn.nextInt();

        // print integer
        System.out.println("Entered Integer: " + x);

        // input is a floatingValue
        // read by nextFloat() method
        float f = scn.nextFloat();

        // print floating value
        System.out.println("Entered FloatValue: " + f);
    }
}
