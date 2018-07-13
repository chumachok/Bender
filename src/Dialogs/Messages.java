package Dialogs;

import Characteristic.AllStats;

public interface Messages
{
    void showText(String text);
    void showInt(int value);
    String getStringValue();
    int getIntValue();
    void showStringArray(String[] textarray);
    void showIntArray(int[] intarray);
    void showPersonStats(AllStats fullperson);

}
