package Weapons;

import Characteristic.AllStats;

import java.util.Random;

public class CreateIntelligenceModifier implements IntelligenceModifiers
{
    @Override
    public AllStats cleanUpAWorkplace(AllStats playerStats) {
        AllStats cleanUpAWorkplace = new AllStats();
        Random random = new Random();

        cleanUpAWorkplace.Strength -= random.nextInt(300);
        cleanUpAWorkplace.Stamina -= random.nextInt(500);
        cleanUpAWorkplace.Armor += random.nextInt(0);
        cleanUpAWorkplace.Health += random.nextInt(200);
        cleanUpAWorkplace.Intelligence += random.nextInt(500);
        return cleanUpAWorkplace;
    }

    @Override
    public AllStats readABook(AllStats playerStats) {
        AllStats readABook = new AllStats();
        Random random = new Random();

        readABook.Strength -= random.nextInt(300);
        readABook.Stamina -= random.nextInt(0);
        readABook.Armor -= random.nextInt(0);
        readABook.Health += random.nextInt(0);
        readABook.Intelligence += random.nextInt(1000);
        return readABook;
    }

    @Override
    public AllStats washABody(AllStats playerStats) {
        AllStats washABody = new AllStats();
        Random random = new Random();

        washABody.Strength -= random.nextInt(300);
        washABody.Stamina -= random.nextInt(400);
        washABody.Armor -= random.nextInt(10);
        washABody.Health += random.nextInt(500);
        washABody.Intelligence += random.nextInt(400);
        return washABody;
    }

    @Override
    public AllStats haveATimeToDream(AllStats playerStats) {
        AllStats haveATimeToDream = new AllStats();
        Random random = new Random();

        haveATimeToDream.Strength -= random.nextInt(300);
        haveATimeToDream.Stamina += random.nextInt(200);
        haveATimeToDream.Armor -= random.nextInt(0);
        haveATimeToDream.Health += random.nextInt(100);
        haveATimeToDream.Intelligence += random.nextInt(700);
        return haveATimeToDream;
    }

    @Override
    public AllStats fixSomething(AllStats playerStats) {
        AllStats fixSomething = new AllStats();
        Random random = new Random();

        fixSomething.Strength -= random.nextInt(500);
        fixSomething.Stamina -= random.nextInt(400);
        fixSomething.Armor -= random.nextInt(0);
        fixSomething.Health += random.nextInt(0);
        fixSomething.Intelligence += random.nextInt(800);
        return fixSomething;
    }

    @Override
    public AllStats talkWithAWizeMan(AllStats playerStats) {
        AllStats talkWithAWizeMan = new AllStats();
        Random random = new Random();

        talkWithAWizeMan.Strength -= random.nextInt(100);
        talkWithAWizeMan.Stamina -= random.nextInt(700);
        talkWithAWizeMan.Armor -= random.nextInt(0);
        talkWithAWizeMan.Health += random.nextInt(0);
        talkWithAWizeMan.Intelligence += random.nextInt(1500);
        return talkWithAWizeMan;
    }
}
