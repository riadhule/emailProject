//Ria Dhulekar 
//Practice Java project for OOP
//inspired by https://www.youtube.com/watch?v=U3Ibvu0htNs&t=133s

package emailapp;
import java.util.Scanner;

public class emailApp {
    public static void main(String [] args){
        System.out.println("Enter first name: ");
        Scanner in = new Scanner (System.in);
        String firstname = in.next();
        System.out.println("Enter last name: ");
        String lastname = in.next();
        
        Email eml = new Email (firstname, lastname);
        System.out.println(eml.showInfo());
        in.close();

    }

}