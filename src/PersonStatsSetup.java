import java.util.Random;
import java.util.Scanner;

public class PersonStatsSetup
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner enter = new Scanner(System.in);

        int Happyness = 0;
        int Luck = 0;
        int Wealth = 0;
        int Healh = 0;
        int Intelligence = 0;
        int Age;

        System.out.println("Input age:");
        Age = enter.nextInt();
        int counter = 0;

        while (counter <= Age)
        {
            Happyness += random.nextInt(100);
            Luck += random.nextInt(100);
            Wealth += random.nextInt(100);
            Healh += random.nextInt(100);
            Intelligence += random.nextInt(100);
            counter++;
        }

        System.out.println("In your " + Age + " you are extremely cool gyu");
        System.out.println("Happyness: " + Happyness);
        System.out.println("Luck: " + Luck);
        System.out.println("Wealth: " + Wealth);
        System.out.println("Health: " + Healh);
        System.out.println("Intelligence: " + Intelligence);
    }
}
