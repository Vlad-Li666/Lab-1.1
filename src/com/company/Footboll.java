package com.company;
import java.util.ArrayList;
public class Footboll {
    private final ArrayList<FootbolComand> footbolComands = new ArrayList<>();
    Footboll(){
    }
    public void add(FootbolComand footbolcomands) {footbolComands.add(footbolcomands);}
    public static void printFootbolComandData(Footboll footboll){
        System.out.println("Все работники с возрастом > 30 и без высшего образования");
        int i = 0;
        for(FootbolComand footbolcomands: footboll.footbolComands){
            int age = footbolcomands.getAge();
            if(age > 25 ){
                System.out.println("Футболист №" + (i+1) + ":");
                System.out.println("Фамилия: " + footbolcomands.getLastName());
                System.out.println("Возраст: " + footbolcomands.getAge());
                System.out.println("Количество игр: " + footbolcomands.getNumberGames());
                System.out.println("Количество забитых голов: " + footbolcomands.getNumberHeads());
            }
            i++;
        }
    }

}
