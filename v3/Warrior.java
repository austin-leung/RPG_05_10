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
	super.toString();
	return "You are a Warrior.";
    }
}

