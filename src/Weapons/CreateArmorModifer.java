package Weapons;

import Characteristic.AllStats;

import java.util.Random;

public class CreateArmorModifer implements ArmorModifiers
{

    @Override
    public AllStats helmet(AllStats playerStats) {
        AllStats helmet = new AllStats();
        Random random = new Random();

        helmet.Strength -= random.nextInt(50);
        helmet.Stamina -= random.nextInt(100);
        helmet.Armor += random.nextInt(200);
        helmet.Health -= random.nextInt(50);
        helmet.Intelligence -= random.nextInt(400);
        return helmet;
    }

    @Override
    public AllStats chest(AllStats playerStats) {
        AllStats chest = new AllStats();
        Random random = new Random();

        chest.Strength -= random.nextInt(300);
        chest.Stamina -= random.nextInt(600);
        chest.Armor += random.nextInt(800);
        chest.Health -= random.nextInt(50);
        chest.Intelligence -= random.nextInt(50);
        return chest;
    }

    @Override
    public AllStats hands(AllStats playerStats) {
        AllStats hands = new AllStats();
        Random random = new Random();

        hands.Strength -= random.nextInt(200);
        hands.Stamina -= random.nextInt(500);
        hands.Armor += random.nextInt(400);
        hands.Health -= random.nextInt(100);
        hands.Intelligence -= random.nextInt(50);
        return hands;
    }

    @Override
    public AllStats gauntlets(AllStats playerStats) {
        AllStats gauntlets = new AllStats();
        Random random = new Random();

        gauntlets.Strength -= random.nextInt(50);
        gauntlets.Stamina -= random.nextInt(100);
        gauntlets.Armor += random.nextInt(150);
        gauntlets.Health -= random.nextInt(50);
        gauntlets.Intelligence -= random.nextInt(50);
        return gauntlets;
    }

    @Override
    public AllStats legs(AllStats playerStats) {
        AllStats legs = new AllStats();
        Random random = new Random();

        legs.Strength -= random.nextInt(200);
        legs.Stamina -= random.nextInt(400);
        legs.Armor += random.nextInt(400);
        legs.Health -= random.nextInt(100);
        legs.Intelligence -= random.nextInt(50);
        return legs;
    }

    @Override
    public AllStats foots(AllStats playerStats) {
        AllStats foots = new AllStats();
        Random random = new Random();

        foots.Strength -= random.nextInt(50);
        foots.Stamina -= random.nextInt(250);
        foots.Armor += random.nextInt(150);
        foots.Health -= random.nextInt(100);
        foots.Intelligence -= random.nextInt(50);
        return foots;
    }
}
