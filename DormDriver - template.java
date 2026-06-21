import java.util.*;

public class DormDriver
{
    public void display(Room room)
	{
		/* display all the guests in the room */
		int y; 
		Person[] guests=room.getGuests();

		if(guests!=null)
		{
			for(y=0; y<guests.length;y++)
			{
				System.out.println(guests[y]);
			}
		}
	}
	
	public void displayDorms(Dormitory[] dorms)
	{
		int i;
		for (i = 0; i < dorms.length; i++)
		{
			System.out.println("Dormitory: " + dorms[i].getName());
			
			Room[] rooms = dorms[i].getRooms();
			
			System.out.println("Total Rooms: " + rooms.length);
			
			int notFull = 0;
			
			for(int j = 0; j < rooms.length; j++)
			{
				if(!rooms[j].isFull())
				{
					notFull++;
			}
	}
		System.out.println("Rooms not full: " + notFull);
			
		for(int j = 0; j < rooms.length; j++)
		
		{
			System.out.println("Room " + rooms[j].getRoomNum());
			display(rooms[j]);
	}
			   
		}
	}
	
	
	public static void main(String[] args)
	{
		Dormitory[] dorms = new Dormitory[2];
		
		dorms[0] = new Dormitory("LS Dorm", 3);
		dorms[1] = new Dormitory("STC Dorm", 5, 4);

		ArrayList<Person> guests = new ArrayList<Person>();
		guests.add(new Person("Andrew", "Filipino"));
		guests.add(new Person("Miguel", "Filipino"));
		guests.add(new Person("Henry", "American"));
		guests.add(new Person("Ray", "Filipino"));
		guests.add(new Person("Bernie", "Filipino"));
		guests.add(new Person("Michael", "Singaporean"));
		guests.add(new Person("Victor", "Filipino"));
		guests.add(new Person("Dennis", "Filipino"));
		guests.add(new Person("Jaime", "Filipino"));

		DormDriver driver = new DormDriver();
		
		/* Have all Filipinos be in the same room, as
		   long as they fit.  Following first come, first
		   served, those who do not fit will be assigned 
		   to the next room. Use the first dormitory for 
		   the Filipinos.  For the other nationalities, 
		   they will be assigned to the second dormitory in
		   separate rooms. Provide your code.
		*/

		
		driver.displayDorms(dorms);
 		   

		/* Provide code to transfer Ray to STC Dorm, and
			he wants to be assigned to a currently unoccupied
			room. */
		
		// TODO: Transfer Ray to STC Dorm
		System.out.println("\n\nTransfering Ray");
	
		
		
		/* Provide code to transfer Michael to the same room 
		   as Miguel */
		System.out.println("\n\nTransfering Michael");   
		
	
		

		// TODO: Transfer Michael to Miguel's room
		driver.displayDorms(dorms);



		   
		guests = null;
		dorms = null;
		System.gc();
	}
}
