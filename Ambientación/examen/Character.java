public abstract class Character {
    public String name;
    public int life;
    public Weapon weapon;
    public Character (String name, int life, Weapon weapon){
        this.life = life;
        this.name = name;
        this.weapon = weapon;
    }
    
    public boolean receiveDamage(int damage) {
        this.life = this.life - damage;
        return this.isAlive();
    }
    
    public boolean isAlive() {
        if (this.life <= 0) {
            return false;
        }
        return true;
    }
    public int randomizeDamage(Weapon weapon){
        int damage = weapon.damage;
        return (int) (Math.random() * damage);
    }
    public abstract void fight(Character target);
    public void showLife(){
        System.out.println(this.name+"  >>>  "+this.life);
    }
    public String toString(){
        return "name: "+this.name+" life: "+this.life;
    }
}
