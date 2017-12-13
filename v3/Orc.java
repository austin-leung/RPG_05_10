public class Orc extends Monster {

    public Orc() {
	super();
	hp = 180;
	defense = 10;
	attackRating = 3;
    }

    //toString
    public String toString() {
	super.toString();
	return "Here is an Orc!";
    }
    
}
