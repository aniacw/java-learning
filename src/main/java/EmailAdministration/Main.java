package EmailAdministration;

public class Main {
    public static void main(String[] args){
        Email email1 = new Email("John", "Smith");
        email1.setAlternateEmail("js@gmail.com");
        System.out.println(email1.getAlternateEmail());

    }
}
