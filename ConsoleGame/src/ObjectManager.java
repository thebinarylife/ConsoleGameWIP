import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ObjectManager
{
	private Map<Room, ArrayList<GameObject>> objects;
	
	public ObjectManager()
	{
		objects = new HashMap<>();
	} 	

	public GameObject getObject(Room room, String objectName)
	{
		ArrayList<GameObject> objects = this.objects.get(room);
		for(GameObject o : objects)
			if(o.getName().equalsIgnoreCase(objectName))
				return o;
		
		return null;
	}
}
