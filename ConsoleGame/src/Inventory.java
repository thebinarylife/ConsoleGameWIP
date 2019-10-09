
public class Inventory
{
	private Player player;
	private GameObject[] inv;
	
	public Inventory(Player player)
	{
		this.player = player;
		inv = new GameObject[12];
	}
	
	public GameObject[] getInventory()
	{
		return inv;
	}
	
	public boolean isFilled(int space)
	{
		if(inv[space] == null)
			return false;
		
		return true;
	}
	
	public boolean addItem(GameObject object)
	{
		int i;
		for(i = 0; i < 12; i++)
		{
			if(inv[i] == null)
				break;
		}
		
		if(inv[i] == null)
		{
			inv[i] = object;
			return true;
		}
		else
			return false;
	}
	
	public void setItem(int i, GameObject object)
	{
		inv[i] = object;
	}

}
