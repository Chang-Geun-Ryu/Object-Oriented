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
//        pos.add(new IntVector2D(0, -2));
//        pos.add(new IntVector2D(1, -2));
//        pos.add(new IntVector2D(2, -1));
//
//        pos.add(new IntVector2D(2, 0));
//        pos.add(new IntVector2D(2, 1));
//        pos.add(new IntVector2D(1, 2));
//
//        pos.add(new IntVector2D(0, 2));
//        pos.add(new IntVector2D(-1, 2));
//        pos.add(new IntVector2D(-2, 1));
//
//        pos.add(new IntVector2D(-2, 0));
//        pos.add(new IntVector2D(-2, -1));
//        pos.add(new IntVector2D(-1, -2));
        // W : Wraith
        // M : Marine
        // U : Turret
        // N : Mine
        // A : SmartMine


        SimulationManager simulationManager = SimulationManager.getInstance();

        Unit u0 = new Tank(new IntVector2D(3, 3));

        ArrayList<Unit> units = new ArrayList<>();
//        units.add(new Tank(new IntVector2D(0, 2)));

        ///// 00
//        units.add(new Wraith(new IntVector2D(15, 0)));
//        units.add(new Marine(new IntVector2D(4, 3)));
//        units.add(new Marine(new IntVector2D(10, 5)));
//        units.add(new Turret(new IntVector2D(3, 4)));
//        units.add(new Wraith(new IntVector2D(14, 7)));
//        units.add(new Mine(new IntVector2D(14, 6), 3));
//        units.add(new Mine(new IntVector2D(5, 0), 3));
//        units.add(new SmartMine(new IntVector2D(8, 0), 2, 2));
//        units.add(new Mine(new IntVector2D(4, 2), 3));
//        units.add(new Tank(new IntVector2D(9, 6)));
//        units.add(new Turret(new IntVector2D(3, 7)));
//        units.add(new SmartMine(new IntVector2D(14, 3), 3, 1));
//        units.add(new Tank(new IntVector2D(8, 0)));
//        units.add(new SmartMine(new IntVector2D(2, 4), 4, 1));
//        units.add(new Wraith(new IntVector2D(10, 0)));
//        units.add(new Wraith(new IntVector2D(4, 5)));
/////
    /// 01
        /*0*/units.add(new Tank(new IntVector2D(0, 2)));
        /*1*/units.add(new Tank(new IntVector2D(0, 6)));
        /*2*/units.add(new Mine(new IntVector2D(0, 3), 4));
        /*3*/units.add(new Mine(new IntVector2D(7, 4), 2));
        /*4*/units.add(new SmartMine(new IntVector2D(8, 5), 4, 1));
        /*5*/units.add(new Mine(new IntVector2D(14, 1), 3));
        /*6*/units.add(new Mine(new IntVector2D(1, 7), 1));
        /*7*/units.add(new SmartMine(new IntVector2D(2,0), 4, 1));
        /*8*/units.add(new Mine(new IntVector2D(13, 5), 1));
        /*9*/units.add(new SmartMine(new IntVector2D(0, 4), 2, 3));
        /*A*/units.add(new Mine(new IntVector2D(8, 6), 4));
        /*B*/units.add(new SmartMine(new IntVector2D(6, 1), 2, 3));
        /*C*/units.add(new Mine(new IntVector2D(8, 0), 3));
        /*D*/units.add(new SmartMine(new IntVector2D(12, 1), 4, 3));
        /*E*/units.add(new SmartMine(new IntVector2D(2, 3), 3, 1));
        /*F*/units.add(new Mine(new IntVector2D(12, 6), 1));

//        units.add(new Tank(new IntVector2D(13, 2)));
//        units.add(new Mine(new IntVector2D(14, 2), 2));

        for (Unit unit : units) {
            simulationManager.spawn(unit);
        }

        SimulationVisualizer visualizer = new SimulationVisualizer(units);
        for (int i = 0; i < 31; ++i) {
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