public class Tester extends Employee{
    public Tester(String name, String code, int age, char role) {
        super(name, code, age, role);
    }
    
    void doWork(){
        System.out.println("I test lines of code");
    }
}