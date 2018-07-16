package Dialogs;

import Characteristic.AllStats;
import Weapons.AllImprovements;

public interface Output
{
    void showText(String text);
    void showInt(int value);
    void showStringArray(String[] textarray);
    void showIntArray(int[] intarray);
    void showPersonStats(AllStats fullperson);
    void showStrengthImpr (AllImprovements textarray);
}
