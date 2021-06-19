//Ria Dhulekar 
//Practice Java project for OOP
//from https://www.youtube.com/watch?v=U3Ibvu0htNs&t=133s

package emailapp;

public class emailApp {
    public static void main(String [] args){
        Email eml = new Email ("John", "Smith");
        System.out.println(eml.showInfo());
    }

}