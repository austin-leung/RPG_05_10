public class Protagonist extends Character{
    
    //change these constants to set default defense and attack of protagonist
    public final static int DEFENSE_STAT = 40; 
    public final static double ATTACK_RATING = 0.4;
   
   /* attempt at #3, instantiating a Protagonist
	*public static void main(String[] args) {
	*   Protagonist test = new Protagonist();
	*}
	* resulting errors:
    *Protagonist.java:1: error: Protagonist is not abstract and does not override abstract method normalize() in Protagonist
	*public class Protagonist extends Character{
	*		^
	*Protagonist.java:8: error: constructor Protagonist in class Protagonist cannot be applied to given types;
    *      Protagonist test = new Protagonist();
	*/
	
    //fields
    protected String name;
    protected int hp;
    protected int strength;
    protected int defense;
    protected double attackRating;

    //methods

    //toString
    
    /* Error when Protagonist class is not abstract:
     *Protagonist.java:1: error: Protagonist is not abstract and does not 
     *override abstract method toString() in Protagonist
     *public class Protagonist extends Character{
     * ^
     *1 error
     */

    /* Error when Mage subclass omits toString():
     *Mage.java:1: error: Mage is not abstract and does not override 
     *abstract method toString() in Protagonist
     *public class Mage extends Protagonist {
     *  ^
     *1 error
     */

   
    public abstract String toString();
	
    /*constructor
     *   takes String input to name the Protagonist
     *   initializes all attributes (eg, 125, 100, 40, 0.4)
     */
    public Protagonist(String nametbd) {
    	name = nametbd;
    	hp = 125;
    	strength = 100;
    	defense = DEFENSE_STAT;
    	attackRating = ATTACK_RATING;
    }
    
    /* isAlive  returns boolean indicating living or dead
     */
    public boolean isAlive() {
	return hp > 0; // true if living
    }
    
    public int getDefense() {
	return defense;
    }
    public String getName() {
    	return name;
    }
    
    /*lowerHP   takes an int parameter, decreases life attribute by that amount
     */
    public void lowerHP(int damage) {
    	hp -= damage;
    }
   
    /*attack
     *   takes a Monster as a parameter
     *   calculates damage using this formula: damage = (strength * attack rating) - monster defense
     *   damage should be an integer value
     */
    public int attack(Monster monster){
	int damage = (int)(strength * attackRating - monster.getDefense());
	monster.lowerHP(damage);
	return damage;
    }
    
    /*specialize
     *  prepares the Protagonist to perform a special attack
     *  decreases defense attribute
     *  increases attack attribute
     */
    public abstract void specialize();
    
    /*normalize
     *  prepares the Protagonist to perform a normal attack
     *   resets defense attribute
     *   resets attack attribute
     */
    public abstract void normalize();
}
