package StaticVariable;

public class Main {
    public static void main(String[] args){
        StaticVariable variable1 = new StaticVariable();
        StaticVariable variable2 = new StaticVariable();
        StaticVariable variable3 = new StaticVariable();
        StaticVariable variable4 = new StaticVariable();
        StaticVariable variable5 = new StaticVariable();

        variable1.increment();
        variable2.increment();
        variable3.increment();
        variable4.increment();
        variable5.increment();

        System.out.println("Variable1 count is " + variable1.count);
        System.out.println("Variable2 count is " + variable2.count);
        System.out.println("Variable3 count is " + variable3.count);
        System.out.println("Variable4 count is " + variable4.count);
        System.out.println("Variable5 count is " + variable5.count);
    }
}
