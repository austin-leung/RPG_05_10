public class Warrior extends Protagonist {

    public Warrior(String name) {
	super(name);
	hp = 200;
	strength += 50;
    }    
    
    //override default value
    public final static double ATTACK_RATING = 0.75;

    //toString
    public String toString() {
	return "You are a Warrior.";
    }

        public void specialize() {
	defense -= 7;
	attackRating += 7;
    }

    public void normalize() {
	defense = DEFENSE_STAT;
	attackRating = ATTACK_RATING;
    }
}

