
package finalclassesandmethods;

//final class prevents inheritance
public final class fireMonster extends Monster{
    
    //creates a constant
    final String type = "fire";

    public fireMonster(int strength, int health) {
        super(strength, health);
    }
    

    
}
