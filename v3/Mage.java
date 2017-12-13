public class Mage extends Protagonist {
    
    public Mage (String name ){
        super(name);
        hp = 100;
            
    }
	
    public final static double DEFENSE_STAT = 55; 
    public final static double ATTACK_RATING = 0.3;

    //toString
    public String toString() {
	super.toString();
	return "You are a Mage.";
    }
}
