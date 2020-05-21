
package finalclassesandmethods;


public class Monster {
    int strength;
    int health;

    public Monster(int strength, int health) {
        this.strength = strength;
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public int getHealth() {
        return health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    //final method prevents people overriding in a subclass
    public final void minusHealth(int health) {
        this.health = this.health-health;
    }
    
    
    
}
