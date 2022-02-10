public abstract class Employee {
    private String name;
    private String code;
    private int age;
    private char role;
    
    public Employee(String name, String code, int age, char role){
        this.name = name;
        this.code = code;
        this.age = age;
        this.role = role;
    }
    
    abstract void doWork();
    
    protected void demoMethod(){
        System.out.println("Estan volviendo mis superpoderes");
    }
    public String getName(){
        return this.name;
    }
    public String setName(String name){
        this.name = name;
        return this.name;
    }
}