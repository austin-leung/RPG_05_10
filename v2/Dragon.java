public class Dragon extends Monster {

    public Dragon() {
	super();
	hp = 1000;
	attackRating = 4;
    }

    //toString
    public String toString() {
	super.toString();
	return "Here is a Dragon!";
    }
    
}
