package PracticalEncapsulation;

import java.util.Scanner;

public class test {
        public static void main(String[] args) {
            GetterSetter obj = new GetterSetter();
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter Your Name");
            String name = scan.nextLine();
            obj.setName(name);

            System.out.println("My name is " + obj.getName());
        }
}