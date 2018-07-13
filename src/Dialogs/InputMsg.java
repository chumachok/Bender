package Dialogs;

import java.util.Scanner;

public class InputMsg implements Input
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
