//Ria Dhulekar 
//Practice Java project for OOP
//inspired by https://www.youtube.com/watch?v=U3Ibvu0htNs&t=133s

package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String email;
    private String alternateEmail;
    private String companyName = "Duck&Goose";
    private String companySuffix = "duck&goosecompany.com";

    //Constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        
        //Call a method asking for the department and return the department 
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        

        System.out.println("\n" + firstName.toUpperCase() + " " + lastName.toUpperCase() + "'s Information");
        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        //System.out.println("Your password is: " + this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department +"." + companySuffix;
        
    }
    //Ask for the department
    private String setDepartment() {
        System.out.print("\nDepartment Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n4 for Marketing\n5 for HR\n0 for none\nEnter your department code: ");
        Scanner in = new Scanner (System.in);
        int depChoice = in.nextInt();
        in.close();
        if (depChoice ==1){ return "sales";}
        else if (depChoice == 2){ return "dev";}
        else if (depChoice == 3){ return "acct";}
        else if (depChoice == 4){return "mrktg";}
        else if (depChoice == 5){ return "hr";}
        else { return "";}
    }

    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password = new char[length];
        for (int i =0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
        }
    

    //Set the mailbox capacity 
    public void seteMailboxCapacity (int capacity){
        this.mailboxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //Change the password 
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity() { return mailboxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getPassword() { return password;}

    public String showInfo() {
        return "Name: "+ firstName + " " + lastName + 
                "\nCompany email: " + email + 
                "\nPassword: " + this.password +
                "\nMailbox capacity: " + mailboxCapacity + "mb"+ 
                "\n\nWELCOME TO " + companyName + ", " + firstName + " " + lastName;
                
    }
}