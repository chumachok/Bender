import java.util.Scanner;

public class Bender
{
    public static void main(String[] args)
    {
        Scanner Enter = new Scanner(System.in);
        Fry PhilipFry = new Fry("Interstellar");
        Fry PFry = new Fry ("Terminator");

//        System.out.println("Insert a movie name: ");
//        String movie = Enter.nextLine();
//
//        PhilipFry.setName(movie);
        PhilipFry.outPut();
        PFry.outPut();
    }


}
