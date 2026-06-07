/*
    @author Aki Nicole
*/

public class SingingCheck
{
    public static void main(String[] args)
    {
        boolean qualified;

        qualified = queens[0].canCompete("singing")
                    && queens[0].canCompete(25);

        System.out.println(qualified);
    }
}
