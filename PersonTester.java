package Class16;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
       // System.out.println(person.bankBalance); private
        System.out.println(person.address);
        System.out.println(person.name);
        person.printTikTokAccount();
        Scanner scanner=new Scanner(System.in);
        scanner.next();

    }
}
