public class Monster extends Character {

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
	
	//toString
	public String toString() {
		super.toString();
		System.out.println("Here is a Monster");
	}
}
