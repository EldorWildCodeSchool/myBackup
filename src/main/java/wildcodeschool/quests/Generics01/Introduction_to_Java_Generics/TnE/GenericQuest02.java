package wildcodeschool.quests.Generics01.Introduction_to_Java_Generics.TnE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class GenericList {

    public static <L> void generateGenericList(List<L> genList, L[] values) {
        int index = 0;
        for(L value : values ){
            genList.add(value);
        }
    }

    public static <L> void printGenericList(List<L> genList) {
        for(L entry : genList){
            System.out.println(genList);
        }
    }

}

class Hero {

    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return ("--- " + this.name + ", age " + this.age + " --- ");
    }

    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class GenericQuest02{

    public static void main(String[] args) {

        Hero hero_1 = new Hero("Black Widow", 34);
        Hero hero_2 = new Hero("Captain America", 100);
        Hero hero_3 = new Hero("Vision", 3);
        Hero hero_4 = new Hero("Iron Man", 48);
        Hero hero_5 = new Hero("Scarlet Witch", 29);
        Hero hero_6 = new Hero("Thor", 1500);
        Hero hero_7 = new Hero("Hulk", 49);
        Hero hero_8 = new Hero("Doctor Strange", 42);
        Hero hero_9 = new Hero("EO", 50);
        Hero hero_10 = new Hero("Baileys lovin' Queen Qf Qode", 29);

        Hero[] myHeroArr = {hero_1, hero_2, hero_3, hero_4, hero_5, hero_6, hero_7, hero_8, hero_9, hero_10};
        List<Hero> myHeroArrayList = new ArrayList<>();
        List<Hero> myHeroLinkedList = new LinkedList<>();
        GenericList.generateGenericList(myHeroArrayList, myHeroArr);
        GenericList.generateGenericList(myHeroLinkedList, myHeroArr);

        System.out.println(myHeroArrayList);
        System.out.println(myHeroLinkedList);
    }
}