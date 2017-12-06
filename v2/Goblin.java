public class Goblin extends Monster {

    public Goblin() {
	super();
	hp = 60;
	strength += 20;
    }    

    //toString
    public String toString() {
	super.toString();
	return "Here is a Goblin!";
    }
}
