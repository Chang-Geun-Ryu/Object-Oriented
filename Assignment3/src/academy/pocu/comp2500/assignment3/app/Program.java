package academy.pocu.comp2500.assignment3.app;

import academy.pocu.comp2500.assignment3.*;
import academy.pocu.comp2500.assignment3.registry.Registry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Registry registry = new Registry();
        App app = new App(registry);
        registry.validate();

        ArrayList<IntVector2D> pos = new ArrayList<>();
        pos.add(new IntVector2D(0, -2));
        pos.add(new IntVector2D(1, -2));
        pos.add(new IntVector2D(2, -1));

        pos.add(new IntVector2D(2, 0));
        pos.add(new IntVector2D(2, 1));
        pos.add(new IntVector2D(1, 2));

        pos.add(new IntVector2D(0, 2));
        pos.add(new IntVector2D(-1, 2));
        pos.add(new IntVector2D(-2, 1));

        pos.add(new IntVector2D(-2, 0));
        pos.add(new IntVector2D(-2, -1));
        pos.add(new IntVector2D(-1, -2));

        SimulationManager simulationManager = SimulationManager.getInstance();

        Unit u0 = new Tank(new IntVector2D(3, 3));

        ArrayList<Unit> units = new ArrayList<>();
        units.add(new Turret(new IntVector2D(-2 + 3, -2 + 3)));
        units.add(new Wraith(new IntVector2D(-1 + 3, -2 + 3)));
//        for (IntVector2D v : pos) {
//            units.add(new Turret(new IntVector2D(v.getX() + 3, v.getY() + 3)));
//        }
//        Unit u1 = new Turret(new IntVector2D(1, 1));
//        Unit u2 = new Turret(new IntVector2D(1, 0));
//        Unit u3 = new Turret(new IntVector2D(2, 1));
//        Unit u4 = new Turret(new IntVector2D(1, 2));
//        Unit u5 = new Turret(new IntVector2D(0, 1));
//        ((Turret)u1).setHp(5);
//        ((Turret)u2).setHp(4);
//        ((Turret)u3).setHp(3);
//        ((Turret)u4).setHp(2);
//        ((Turret)u5).setHp(1);
//        Unit u0 = new Mine(new IntVector2D(12, 1), 2);
//        Unit u00 = new Marine(new IntVector2D(12, 1));
//        Unit u1 = new Marine(new IntVector2D(0, 5));
//        Unit u2 = new Turret(new IntVector2D(5, 6));
//        Unit u3 = new Tank(new IntVector2D(2, 4));
//        Unit u4 = new Marine(new IntVector2D(2, 4));
//        Unit u5 = new Wraith(new IntVector2D(2, 7));



        units.add(u0);
//        units.add(u00);
//        units.add(new Turret(new IntVector2D(1, 1)));
//        units.add(new Turret(new IntVector2D(1, 1)));
//        units.add(new Turret(new IntVector2D(1, 1)));
//        units.add(u1);
//        units.add(u2);
//        units.add(u3);
//        units.add(u4);
//        units.add(u5);


        for (Unit unit : units) {
            simulationManager.spawn(unit);
        }

        SimulationVisualizer visualizer = new SimulationVisualizer(units);
        for (int i = 0; i < 10; ++i) {
            clearConsole();
            visualizer.visualize(i, simulationManager.getUnits());
            simulationManager.update();
            continueOnEnter();
        }
    }

    public static void continueOnEnter() {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Press enter to continue");
            reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clearConsole() {
        try {
//            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}