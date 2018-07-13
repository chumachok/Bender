package Dialogs;

import java.util.Scanner;

public abstract class InputMsg implements Messages
{
    Scanner scanner = new Scanner(System.in);

    @Override
    public String getStringValue() {
        String stringValue = scanner.nextLine();
        return stringValue;
    }

    @Override
    public int getIntValue() {
        int intValue = scanner.nextInt();
        return intValue;
    }
}
