import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room
{
	private String name;
	private List<GameObject> objects;
	private Map<Direction, Room> connectingRooms;
	
	public Room(String name, List<GameObject> objects)
	{
		this.name = name;
		this.objects = objects;
		this.connectingRooms = new HashMap<>();
	}
	
	public String getName()
	{
		return name;
	}
	
	public List<GameObject> getObjects()
	{
		return objects;
	}
	
	public Room getRoom(Direction direction)
	{
		return connectingRooms.get(direction);
	}

}
