import java.util.*;
//When instantiating an inventory, make sure to associate name with assigned player?
public class Inventory
{
	private ArrayList<Item> inventory = new ArrayList<Item>();
	
	public Inventory()
	{
		inventory = new ArrayList<Item>();
	}
	public void displayInventory()
	{
		System.out.println("Player Inventory:");
		System.out.println("========");
		for(int i = 0; i < inventory.size(); i++)
		{
			System.out.print(inventory.get(i).getName() + "\n");
		}
		System.out.println("========");
	}
	public void addItem(Item aItem)
	{
		inventory.add(aItem);
	}
	public void inspectItem(int index)
	{
		System.out.println(inventory.get(index).toString());
	}
	public void discard(Item aItem)
	{
		inventory.remove(aItem);
	}
	
}
