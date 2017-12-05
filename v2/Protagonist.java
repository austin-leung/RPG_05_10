public class Protagonist extends Character {
    
    //change these constants to set default defense and attack of protagonist
    public final static int DEFENSE_STAT = 40; 
    public final static double ATTACK_RATING = 0.4;

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
    
    public String getName() {
    	return name;
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
