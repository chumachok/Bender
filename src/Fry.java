import java.sql.SQLOutput;

public class Fry
{
    public Fry (String name)
    {
        movieName = name;
    }

    private String movieName;

    public void setName (String name)
    {
        movieName = name;
    }

    public String getName ()
    {
        return movieName;
    }

    public void outPut ()
    {
        System.out.printf("You favorite film: %s", getName());
        System.out.println();
    }

}
