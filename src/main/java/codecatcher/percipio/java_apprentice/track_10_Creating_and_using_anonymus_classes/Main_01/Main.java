package codecatcher.percipio.java_apprentice.track_10_Creating_and_using_anonymus_classes.Main_01;

import java.util.ArrayList;
import codecatcher.percipio.java_apprentice.track_10_Creating_and_using_anonymus_classes.Home;

import java.util.List;

public class Main {

    private static List<Home> populateAndGetHomesList() {

        Home home1 = new Home("brownstone", "New York", 1200, 1000000);
        Home home2 = new Home("house", "Seattle", 5200, 1500000);
        Home home3 = new Home("townhome", "Bellevue", 3300, 500000);
        Home home4 = new Home("condo", "Mumbai", 3500, 1000000);
        Home home5 = new Home("villa", "Bangalore", 5400, 300000);
        Home home6 = new Home("mansion", "Palo Alto", 7500, 10000000);

        List<Home> homesList = new ArrayList<>();

        homesList.add(home1);
        homesList.add(home2);
        homesList.add(home3);
        homesList.add(home4);
        homesList.add(home5);
        homesList.add(home6);

        return homesList;
    }

    public static void main(String[] args) {

        List<Home> homesList = populateAndGetHomesList();

        System.out.println("*** Original list: \n" + homesList);

        List<Home> filteredList = filterByPriceInRange(homesList, 200000, 600000);

        System.out.println("*** Filtered list: \n" + filteredList);
    }

    private static List<Home> filterByPriceInRange(List<Home> homesList, int low, int high) {

        List<Home> filteredList = new ArrayList<>();

        for (Home home : homesList) {
            if (home.getPrice() >= low && home.getPrice() < high) {
                filteredList.add(home);
            }
        }

        return filteredList;
    }

}
