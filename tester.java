
public class tester 
{
	public static void main(String[] args){ new tester().run(); }
	
	public void run()
	{
		//Instantiating some armor objects
		Helmet hood = new Helmet("Cloaked Hood",5.0,"Cloth");
		Chestplate gilded = new Chestplate("Lions Mane",25.0,"Goldsnite");
		Leggings elven = new Leggings("Mythril",12.0,"Elven Ore");
		Greaves lightning = new Greaves("Quicksilver",5.0,"Litanium");
		Greaves leather = new Greaves("Leather Sandals",1.0,"Leather");
		
		//Creating me
		Player colin = new Player("Colin");
		
		//Troubleshooting
		colin.equipArmor(leather);
		//System.out.println(colin.currentArmor[3].getName());
		colin.equipArmor(elven);
		//System.out.println(colin.currentArmor[2].getName());
		colin.equipArmor(gilded);
		colin.displayCurrentArmor();
		System.out.println(colin.getArmorRating());
		colin.addToInventory(elven);
		colin.addToInventory(leather);
		colin.displayInventory();
		colin.inspect(0);
		
	}
}
