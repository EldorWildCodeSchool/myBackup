package wildcodeschool.quests.Java04.Scratch;

import java.util.Arrays;

public class Diddly {

    public static void main(String[] args) {

        String[] weaponsIndiana = {"whip", "gun", "saber"};
        String[] weaponsHelen = {"knife", "shield"};
        String[] weaponsRavenwood = { "belt", "dagger", "gun", "shield"};

        String[][] weapons;

        weapons = new String[][] {
                weaponsIndiana,
                weaponsHelen,
                weaponsRavenwood
                };

        System.out.println(Arrays.toString(weapons[0])); //[whip, gun, saber]
        System.out.println(Arrays.toString(weapons[1])); //[knife, shield]
        System.out.println(Arrays.toString(weapons[2])); //[belt, dagger, gun, shield]

    }

}
