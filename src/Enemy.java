public abstract class Enemy {
    private String name;
    private int damage;
    private int health;

public String getName(){
    return this.name;
}
public void setName(String name){
    this.name=name;

}
public int getDamage(){
        return this.damage;
}
public void setDamage(int damage){
        this.damage=damage;

    }
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        this.health=health;

    }
    public void showUp() {
        System.out.printf("[%s] is showing up. Damage is [%d] Health is [%d]%n", getName(), getDamage(), getHealth());
    }

    public abstract int attack() ;

    public abstract void takeDamage(int value) ;
}

