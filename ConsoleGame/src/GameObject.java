import java.util.ArrayList;

public class GameObject {
	private String name;
	
	public GameObject(String name, ArrayList<Command> commands)
	{
		this.name = name;
		
	}
	
//	public boolean execute(String cmd, String args[])
//	{
//		
//	}
	
	public String getName()
	{
		return name;
	}
	
}
