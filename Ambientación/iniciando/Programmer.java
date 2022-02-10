public class Programmer extends Employee implements Magician, Lazzy {
    public Programmer(String name, String code, int age, char role) {
        super(name, code, age, role);
        System.out.println("My magic number is "+this.MAGIC_CONSTANT);
        this.demoMethod();
    }
    @Override
    public void doWork(){
        System.out.println("I write lines of code");
    }
    @Override
    public void doMagicSpells(){
        System.out.println("Magic Spells");
    }
    @Override
    public void doLazzy(){
        System.out.println("Doing Lazzy");
    }
    public static void imCrazzy(){
        // método estatico no puede referenciar a super ni this
        System.out.println("Doing Crazzy");
    }
}