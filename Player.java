public class Player 
{
	private String name;
	private String legend_status;
	private boolean isAlive = true;
	private double hp = 100;
	private Inventory inventory;
	public Armor[] currentArmor = new Armor[4];
	private Weapon currentWeapon;
	private int mana = 10;
	
	public Player()
	{
		name = "Gary";
		inventory = new Inventory();
	}
	public Player(String name)
	{
		this.name = name;
		inventory = new Inventory();
	}
	public String getName()
	{
		return name;
	}
	public String getLegendStatus()
	{
		return legend_status;
	}
	public boolean getIsAlive()
	{
		if(hp > 0)
		{
			return true;
		}
		return false;
	}
	public double getHp()
	{
		return hp;
	}
	public void setHp(double hp)
	{
		this.hp = hp;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void displayInventory()
	{
		inventory.displayInventory();
	}
	public void addToInventory(Item aItem)
	{
		inventory.addItem(aItem);
	}
	public void inspect(int index)
	{
		inventory.inspectItem(index);
	}
	public void displayCurrentArmor()
	{
		for(int i = 0; i < currentArmor.length;i++)
		{
			if(currentArmor[i] == null)
			{
				System.out.println("No Armor Equipped.");
			}
			else
			{
				System.out.println(currentArmor[i].getName());
			}
		}
	}
	public void checkArmor(Armor[] currentArmor,int index)
	{
		if(currentArmor[index] == null)
		{
			
		}
		else if(currentArmor[index] != null)
		{
			inventory.addItem(currentArmor[index]);
			currentArmor[index] = null;
		}
		
	}
	public double getArmorRating()
	{
		double armorRating = 0;
		for(int i = 0; i < currentArmor.length; i++)
		{
			if(currentArmor[i] == null)
			{
				
			}
			else 
			{
				armorRating += currentArmor[i].getProtectionStat();
			}
		}
		return armorRating;
	}
	public void equipArmor(Armor armor)
	{
		if(armor.getType() == "HELMET")
		{
			checkArmor(currentArmor,0);
			currentArmor[0] = armor;
		}
		else if(armor.getType() == "CHESTPLATE")
		{
			checkArmor(currentArmor,1);
			currentArmor[1] = armor;
		}
		else if (armor.getType() == "LEGGINGS")
		{
			checkArmor(currentArmor,2);
			currentArmor[2] = armor;
		}
		else if (armor.getType() == "GREAVES")
		{
			checkArmor(currentArmor,3);
			currentArmor[3] = armor;
		}
	}
	
	
}
