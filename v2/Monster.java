public class Monster {
    
    //fields
    private int hp;
    private int strength;
    private int defense;
    private double attackRating;

    //methods

    /* constructor
     *   initializes all attributes
     *   sets strength to random number in the range [20, 65)
     */
    public Monster() {
	hp = 150;
        strength = (int)(Math.random() * 45) + 20;
	defense = 20;
	attackRating = 1;
    }

    /* isAlive 
     * returns boolean indicating living or dead
     */
    public boolean isAlive() {
	return hp > 0; // true if living
    }

    public int getDefense() {
	return defense;
    }

    /* lowerHP  takes an int parameter, decreases life attribute by that amount
     */
    public void lowerHP(int damage) {
	hp -= damage;
    }

    /* attack
     *   takes a Monster as a parameter
     *   calculates damage using this formula: damage = (strength * attack rating) - monster defense
     *   damage should be an integer value
     */
    public int attack(Protagonist protagonist){
	int damage = (int)(strength * attackRating - protagonist.getDefense());
	protagonist.lowerHP(damage);
	return damage;
    }
    
}
