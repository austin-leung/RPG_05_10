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
	super.toString();
	return "You are an Elf.";
    }
    
}
