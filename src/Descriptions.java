import java.util.Scanner;

public class Descriptions
{


    public static String insert_text ()
    {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        return text;
    }

    public static void display_text (String text)
    {
        System.out.println(text);
    }


}
