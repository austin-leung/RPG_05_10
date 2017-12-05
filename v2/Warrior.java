public class Warrior extends Protagonist {

    //change these constants to set default defense and attack of protagonist
    public final static int DEFENSE_STAT = 20;
    public final static double ATTACK_RATING = 0.6;


    public Warrior(String nametbd) {
	super(nametbd);
	hp = 150;
	strength = 120;
    }

}
