import java.util.*;
public class Pageant
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int y, tempAge,a; 
        String tempName, tempCountry; 
        //declare 5 contestant objects
        Contestant[] queens = new Contestant[5]; 
        //loop asking input of name country and age of beauty queen contestants 
        for(y=0; y<queens.length;y++)
        {
            System.out.println("Input contestant name: "); 
            tempName= sc.nextLine();
            System.out.println("Input contestant country: "); 
            tempCountry= sc.nextLine();
            System.out.println("Input contestant age: "); 
            tempAge=sc.nextInt(); 
            sc.nextLine(); 
            queens[y]= new Contestant(tempName,tempCountry,tempAge); 
            
        }
        //ask user to input 2 talents-used for 1st contestant 
        //check if user can compete in singing 
        //display result of checking 
            //true only if first contestant is at least 25 years old 
        //array and scanner clean up 
        sc.close(); 
        queens=null; 
    }
}
