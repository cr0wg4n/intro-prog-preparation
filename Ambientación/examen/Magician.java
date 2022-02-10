public class Magician extends Character implements Skills{
    
    static Weapon sword = new Sword(12,1);
    
    public Magician(String name, int life) {
        super(name,life,sword);
    }

    @Override 
    public void fight(Character target){
        System.out.println("Grito de ira");
        int damage = this.randomizeDamage(weapon);
        weapon.causeDamage(target, damage);
        System.out.println("Daño realizado: "+damage);
    }
    @Override
    public void dormir(int time){
        System.out.println("Dormir: "+time+" minutos");
    }
}