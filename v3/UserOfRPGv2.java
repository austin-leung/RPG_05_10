/*public class UserOfRPGv2 {


    public static void main (String[] args) {

	Character[] agents;

	Protagonist p0 = new Warrior("Warrior Person");
	Protagonist p1 = new Elf("Elf Person");
	Protagonist p2 = new Mage("Mage Person");
	Monster m0 = new Orc();
	Monster m1 = new Goblin();
	Monster m2 = new Dragon();

	agents = {p0, p1, p2, m0, m1, m2};

	public void printArray(Character[] agentArray) {
	    for (Character charac : agentArray) {
		System.out.println(charac);
	    }
	}
	
	printArray(agents);
	
    }

    }*/

public class UserOfRPGv2 {

    
	public static void main(String[] args){
		 Character[] agents = {
		 	new Protagonist("Protagonist"),
		 	new Mage("Shin"),
			new Warrior("Bamba"),
			new Elf("Bobby"),

			new Goblin(),
			new Orc(),
			new Dragon()};
	

		 		for(int count = 0;count < agents.length; count += 1)
			System.out.println(agents[count]);

	}
}
