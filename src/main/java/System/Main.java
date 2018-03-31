package System;

public class Main {
    public static void main(String[] args){

        OS system = SystemFactory.getOS("Linux");
        System.out.println(system);

    }
}