public class Monster extends Character{
    
    static Weapon sword = new Axe(14,1);
    
    public Monster(String name, int life) {
        super(name,life,sword);
    }

    @Override 
    public void fight(Character target){
        System.out.println("Gruñido!");
        int damage = this.randomizeDamage(weapon);
        weapon.causeDamage(target, damage);
        System.out.println("Daño realizado: "+damage);
    }
}