package Weapons;

import Characteristic.AllStats;

public interface IntelligenceModifiers
{
    AllStats cleanUpAWorkplace (AllStats playerStats); // UP to: Strength-300 / Stamina-500 / Armor+0 / Health-200 / intelligence+500
    AllStats readABook (AllStats playerStats); // UP to: Strength-300 / Stamina-0 / Armor+0 / Health-0 / intelligence+1000
    AllStats washABody (AllStats playerStats); // UP to: Strength-300 / Stamina-400 / Armor-10 / Health+500 / intelligence+400
    AllStats haveATimeToDream (AllStats playerStats); // UP to: Strength-300 / Stamina+200 / Armor-0 / Health+100 / intelligence+700
    AllStats fixSomething (AllStats playerStats); // UP to: Strength-500 / Stamina-400 / Armor-0 / Health+0 / intelligence+800
    AllStats talkWithAWizeMan(AllStats playerStats); // UP to: Strength-100 / Stamina-700 / Armor-0 / Health-0 / intelligence+1500
}
