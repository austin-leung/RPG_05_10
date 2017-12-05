public class Character {
    
    //fields
    protected String name;
    protected int hp;
    protected int strength;
    protected int defense;
    protected double attackRating;

    //methods

    /* isAlive  returns boolean indicating living or dead
     */
    public boolean isAlive() {
	return hp > 0; // true if living
    }
    
    public int getDefense() {
	return defense;
    }
    
    /*lowerHP   takes an int parameter, decreases life attribute by that amount
     */
    public void lowerHP(int damage) {
    	hp -= damage;
    }

    /*attack
     *   takes a Character as a parameter
     *   calculates damage using this formula: damage = (strength * attack rating) - other character's defense
     *   damage should be an integer value
     */
    public int attack(Character character){
	int damage = (int)(strength * attackRating - character.getDefense());
	character.lowerHP(damage);
	return damage;
    }

}

