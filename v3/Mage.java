public class Mage extends Protagonist {
    
    public Mage (String name ){
        super(name);
        hp = 100;
            
    }
	
    public final static int DEFENSE_STAT = 55; 
    public final static double ATTACK_RATING = 0.3;

    //toString
    public String toString() {
	return "You are a Mage.";
    }

    public void specialize() {
	defense -= 10;
	attackRating += 10;
    }

    public void normalize() {
	defense = DEFENSE_STAT;
	attackRating = ATTACK_RATING;
    }
}

