package EmailAdministration;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private int mailboxCapacity =100;
    private String alternateEmail;
    private String email;
    private int defaultPasswordLength = 10;
    private String emailSuffix = "company.com";

    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("Email created: " + this.firstname + " " + this.lastname);
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        this.password = randomPasswordGenerator(defaultPasswordLength);
        System.out.println("Password: " + this.password);
        email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "."+ emailSuffix;
        System.out.println("New email is: " + email);
    }

    private String setDepartment() {
        System.out.println("Department codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter the department:\n");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1) {
            return "sales";
        }
        else if (deptChoice == 2) {
            return "dev";
        }
        else if (deptChoice == 3) {
            return "acc";
        }
        else  {
            return "";
        }
    }

    private String randomPasswordGenerator(int length){
        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%^&*()";
        char[] password = new char[length];
        for (int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String showInfo(){
        return "Firstname" + firstname + "\n Email: " + email + "\nMailbox capacity "+ mailboxCapacity + "MB";
    }
}
