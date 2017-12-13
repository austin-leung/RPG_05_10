public class Elf extends Protagonist {

    public Elf(String name) {
	super(name);
	hp = 450;
    }

    // override default values
    public final static double ATTACK_RATING = 0.75;
    public final static int DEFENSE_STAT = 20;

    //toString
    public String toString() {
	return "You are an Elf.";
    }

    public void specialize() {
	defense -= 5;
	attackRating += 5;
    }

    public void normalize() {
	defense = DEFENSE_STAT;
	attackRating = ATTACK_RATING;
    }
}
