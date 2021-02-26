package factorypattern;

/**
 *
 * @author Michael
 */
public abstract class EnemyShip {

    private String name;
    private double damage;
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the amtDamage
     */
    public double getDamage() {
        return damage;
    }

    /**
     * @param amtDamage the amtDamage to set
     */
    public void setDamage(double amtDamage) {
        this.damage = amtDamage;
    }
    
    public void followHeroShip() {
        System.out.println(getName() + " is following the hero");
    }
    
    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }
    
    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + getDamage());
    }    
}
