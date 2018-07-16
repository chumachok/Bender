package Weapons;

import Characteristic.AllStats;

public interface StaminaModifiers
{
    AllStats firstLevelTrainings (AllStats playerStats); // UP to: Strength+400 / Stamina+800 / Armor+100 / Health+100 / intelligence+100
    AllStats secondLevelTrainings (AllStats playerStats); // UP to: Strength+500 / Stamina+900 / Armor+100 / Health+200 / intelligence+200
    AllStats thirdLevelTrainings (AllStats playerStats); // UP to: Strength+600 / Stamina+1000 / Armor+100 / Health+300 / intelligence+300
    AllStats firstLevelRelax (AllStats playerStats); // UP to: Strength+100 / Stamina+2000 / Armor-200 / Health+400 / intelligence-500
    AllStats secondLevelRelax (AllStats playerStats); // UP to: Strength+0 / Stamina+3000 / Armor-200 / Health+0 / intelligence-600
    AllStats thirdLevelRelax(AllStats playerStats); // UP to: Strength-500 / Stamina+4000 / Armor-200 / Health-400 / intelligence-700
}
