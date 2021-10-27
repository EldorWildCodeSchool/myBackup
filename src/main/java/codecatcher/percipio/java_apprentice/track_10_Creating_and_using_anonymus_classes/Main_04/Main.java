package codecatcher.percipio.java_apprentice.track_10_Creating_and_using_anonymus_classes.Main_04;

import codecatcher.percipio.java_apprentice.track_10_Creating_and_using_anonymus_classes.Home;
import codecatcher.percipio.java_apprentice.track_10_Creating_and_using_anonymus_classes.HomeFilter;

import java.util.ArrayList;
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

    private static List<Home> filter(List<Home> homesList, HomeFilter homeFilter) {

        List<Home> filteredList = new ArrayList<>();

        for (Home home : homesList) {
            if (homeFilter.test(home)) {
                filteredList.add(home);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {

        List<Home> homesList = populateAndGetHomesList();

        System.out.println("*** Original list: \n" + homesList);

        List<Home> filteredList = filter(homesList, new HomeFilter() {

            @Override
            public boolean test(Home home) {
                return (home.getAreaSqFt() > 3000 && home.getAreaSqFt() < 5500);
            }
        });

        System.out.println("*** Filtered list: \n" + filteredList);
    }

}
