package newPractEN;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        GetterSetter1 obj = new GetterSetter1();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        obj.setName(name);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        obj.setAge(age);

        System.out.print("Enter Address: ");
        String address = sc1.nextLine();
        obj.setAddress(address);

        System.out.print("Enter Contact no: ");
        int contact = sc.nextInt();
        obj.setContactNo(contact);

        System.out.print("Enter DOB: ");
        int dob = sc.nextInt();
        obj.setDob(dob);

        System.out.println("My name is " + obj.getName());
        System.out.println("I'm " + obj.getAge());
        System.out.println("I live in " + obj.getAddress());
        System.out.println("My contact info is " + obj.getContactNo());
        System.out.println("I was born on " + obj.getDob());

    }

}
