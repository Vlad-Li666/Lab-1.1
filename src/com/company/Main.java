package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FootbolComand footbolcomands;
        Scanner scanner = new Scanner(System.in);
        Footboll footboll = new Footboll();
        System.out.println("Введите количество игроков:");
        int length = scanner.nextInt();
        for(int i = 0; i < length; i++) {
            System.out.println("Работник №" + (i+1) + ":");
            footbolcomands = new FootbolComand();
            System.out.print("Фамилия: ");
            footbolcomands.setLastName(scanner.next());
            System.out.print("Возраст: ");
            footbolcomands.setAge(scanner.nextInt());
            System.out.print("Количество игр: ");
            footbolcomands.setNumberGames(scanner.nextInt());
            System.out.print("Количество забитых голов: ");
            footbolcomands.setNumberHeads(scanner.nextInt());
            footboll.add(footbolcomands);
        }
        Footboll.printFootbolComandData(footboll);

    }

}
