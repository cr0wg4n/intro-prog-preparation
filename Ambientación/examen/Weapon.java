public class Weapon{
    public int damage;
    public Weapon(int damage){
        this.damage=damage;
    }
    
    public boolean causeDamage(Character character, int damage) {
        return character.receiveDamage(damage);
    }
}