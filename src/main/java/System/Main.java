package System;

public class Main {
    public static void main(String[] args){
        SystemFactory systemFactory = new SystemFactory();
        OS system = SystemFactory.getOS("Linux");

    }
}