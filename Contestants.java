/*
     @author Alexie Ilagan 
*/
public class Contestant
{
    public Contestant(String n, String c,int a)
    {
          //initializes name, country and age 
         name= n; 
         country = c; 
         age = a; 
         talents = new String[3];
    }
    public Contestant(String n, String c)
    {
          //initializes name and country 
         name= n; 
         country = c; 
         talents = new String[3];
         age = 18;
    }
    public String getName()
    {
          //returns name of participant 
         return name; 
    }
    public String getCountry()
    {
          //returns country participant is representing 
         return country; 
    }
    public void addTalent(String t)//finish 
    {
         //if array is not fully filled(at least 1 string not initialized)
          //add parameter to list 
         int y,check;
         check=0; 
         for(y=0; y<talents.length; y++)
          {
               if(talents[y]==null && check==0)
               {
                    talents[y]=t; 
                    check=1; 
               }
          }
    }
    public boolean canCompete(String t)
    {
          //checks if parameter matches defined talents of participant 
         int y; 
         boolean value; 
         value=false; 
         for(y=0; y<talents.length; y++)
          {
               if(talents[y] != null && talents[y].equals(t))
               {
                    value=true; 
               }
          }
         return value; 
    }
    public boolean canCompete(String t, int maxAge)
    {
          //true if matches defined talents of participant 
              //also if participant is at most maxAge 
         int y; 
         boolean value; 
         value=false; 
         for(y=0; y<talents.length;y++)
          {
               if(talents[y] != null && talents[y].equals(t))
               {
                    if(age<=maxAge)
                    {
                         value=true;
                    }
               }
          }
         return value; 
    }
    public boolean canCompete(int minAge)
    {
          //returns true if participant is at least equal to minAge 
         boolean value=false;
         if(age >= minAge)
          {
              value=true; 
          }
         
         return value; 
    }
    public String toString()
    {
          //returns concatenation of name, country and age  
         return name + ", " + country + ", " + age; 
    }
    private String name; 
    private String country; 
    private String[] talents; 
    private int age;  
}
