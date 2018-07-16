package Weapons;

import Characteristic.AllStats;

public interface HealthModifiers
{
    AllStats eyes (AllStats playerStats); // UP to: Strength+0 / Stamina-400 / Armor+0 / Health+100 / intelligence+200
    AllStats neck (AllStats playerStats); // UP to: Strength+50 / Stamina-1000 / Armor+100 / Health+600 / intelligence-200
    AllStats body (AllStats playerStats); // UP to: Strength+400 / Stamina-1000 / Armor+100 / Health+1000 / intelligence-200
    AllStats back (AllStats playerStats); // UP to: Strength+400 / Stamina-1000 / Armor+100 / Health+1000 / intelligence-200
    AllStats arms (AllStats playerStats); // UP to: Strength+500 / Stamina-1000 / Armor+100 / Health+1000 / intelligence-200
    AllStats legss(AllStats playerStats); // UP to: Strength+400 / Stamina-1000 / Armor+100 / Health+1000 / intelligence-200
}
