public class Room
{
	public Room(int roomNum, int maxCapacity)
	{
              //Provide code 
			  //provide number
			this.NUM=roomNum; 
			  //provide maximum capacity 
			this.MAX=maxCapacity;
	}
	
	public boolean addGuest(Person guest)
	{ 
              //Provide code 
			int y; 
			  //check if capacity is full 
			if()
			{
				for(y=0;y<6;y++)
				{
					
				}
			}
			else
			{
				for(y=0; y<6;y++)
			}
			  //check for null
			  //add guest to room 
	}
	
	public boolean isFull()
	{
              //Provide code 
		return this.MAX==this.getMaxCapacity(); 
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public int getMaxCapacity()
	{
		return MAX;
	}

	public int getRoomNum()
	{
		return NUM;
	}
	
	public Person[] getGuests()
	{
		return guests;
	}
	
	public int getNumOccupants()
	{
		return size;
	}
	
	public void removeGuest(int index)
	{
              //Provide code 
			  index--;
	}
	
	private final int MAX; //max number of guests
	private final int NUM; //room number
	private Person[] guests;  //do not change to ArrayList
	private int size; //current number of guests in room
}
