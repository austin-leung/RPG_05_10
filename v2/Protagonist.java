public class Protagonist {
    
    //change these constants to set default defense and attack of protagonist
    public final static int DEFENSE_STAT = 40; 
    public final static double ATTACK_RATING = 0.4;
   
    //fields
    protected String name;
    protected int hp;
    protected int strength;
    private int defense;
    private double attackRating;

    //methods

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
    public void specialize() {
    	defense -= 5;
    	attackRating += 5;
    }
    
    /*normalize
     *  prepares the Protagonist to perform a normal attack
     *   resets defense attribute
     *   resets attack attribute
     */
    public void normalize() {
	defense = DEFENSE_STAT;
	attackRating = ATTACK_RATING;
    }
}
