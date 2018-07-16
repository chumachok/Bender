package Weapons;

import Characteristic.AllStats;

import java.util.Random;

public class CreateHealthModifier implements HealthModifiers
{
    @Override
    public AllStats eyes(AllStats playerStats)
    {
        AllStats eyes = new AllStats();
        Random random = new Random();

        eyes.Strength += random.nextInt(0);
        eyes.Stamina -= random.nextInt(400);
        eyes.Armor += random.nextInt(0);
        eyes.Health += random.nextInt(100);
        eyes.Intelligence -= random.nextInt(200);
        return eyes;
    }

    @Override
    public AllStats neck(AllStats playerStats) {
        AllStats neck = new AllStats();
        Random random = new Random();

        neck.Strength += random.nextInt(50);
        neck.Stamina -= random.nextInt(1000);
        neck.Armor += random.nextInt(100);
        neck.Health += random.nextInt(600);
        neck.Intelligence -= random.nextInt(200);
        return neck;
    }

    @Override
    public AllStats body(AllStats playerStats) {
        AllStats body = new AllStats();
        Random random = new Random();

        body.Strength += random.nextInt(400);
        body.Stamina -= random.nextInt(1000);
        body.Armor += random.nextInt(100);
        body.Health += random.nextInt(1000);
        body.Intelligence -= random.nextInt(200);
        return body;
    }

    @Override
    public AllStats back(AllStats playerStats) {
        AllStats back = new AllStats();
        Random random = new Random();

        back.Strength += random.nextInt(400);
        back.Stamina -= random.nextInt(1000);
        back.Armor += random.nextInt(100);
        back.Health += random.nextInt(1000);
        back.Intelligence -= random.nextInt(200);
        return back;
    }

    @Override
    public AllStats arms(AllStats playerStats) {
        AllStats hands = new AllStats();
        Random random = new Random();

        hands.Strength += random.nextInt(500);
        hands.Stamina -= random.nextInt(1000);
        hands.Armor += random.nextInt(100);
        hands.Health += random.nextInt(1000);
        hands.Intelligence -= random.nextInt(200);
        return hands;
    }

    @Override
    public AllStats legss(AllStats playerStats) {
        AllStats legs = new AllStats();
        Random random = new Random();

        legs.Strength += random.nextInt(400);
        legs.Stamina -= random.nextInt(1000);
        legs.Armor += random.nextInt(100);
        legs.Health += random.nextInt(1000);
        legs.Intelligence -= random.nextInt(200);
        return legs;
    }
}
