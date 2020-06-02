package academy.pocu.comp2500.lab5;

import java.util.HashSet;

public class Program {

    public static void main(String[] args) {

        Knight knight0 = new Knight("Naruto", 252, 310, 99);
        Knight knight1 = new Knight("Sasuke", 250, 290, 111);
        Pet pet0 = new Pet("Giant Toad", 180);

        knight0.setPet(pet0);
//        knight0.attackTogether(knight1);
//
        knight0.attack(knight1);

        System.out.println(knight1.getHp());
    }
}