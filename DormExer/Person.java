public class Person
{
    //person's name
    private String name;

    //person's nationality
    private String nationality;

    public Person(String name, String nationality)
    {
        this.name = name;
        this.nationality = nationality;
    }

    //returns person's name
    public String getName()
    {
        return name;
    }

    //returns person's nationality
    public String getNationality()
    {
        return nationality;
    }

    //displays person's information
    public String toString()
    {
        return name + " - " + nationality;
    }
}
