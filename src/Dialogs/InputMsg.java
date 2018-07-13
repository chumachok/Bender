package Dialogs;

import Characteristic.AllStats;

import java.util.Scanner;

public class InputMsg implements Messages
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

    @Override
    public void showStringArray(String[] textarray) {}

    @Override
    public void showIntArray(int[] intarray) {}

    @Override
    public void showPersonStats(AllStats fullperson) {}

    @Override
    public void showText(String text) {}

    @Override
    public void showInt(int value) {}
}
