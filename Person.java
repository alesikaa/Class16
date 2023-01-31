package Class16;

import Class13.StringRecap;

public class Person {
    private double bankBalance=125000;
    String address="Street 123";
    String name="John Snow";
    private void printPhonePassword(){
        System.out.println("pass123");
    }
    void printSSN(){
        System.out.println("23456757");
    }
     public void printTikTokAccount(){
        System.out.println("user123");
    }

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
    }
}
