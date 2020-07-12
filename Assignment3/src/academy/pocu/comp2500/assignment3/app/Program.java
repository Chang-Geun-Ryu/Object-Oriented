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

//        ArrayList<IntVector2D> pos = new ArrayList<>();
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
//
//        Unit u0 = new Tank(new IntVector2D(3, 3));
//
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
//        /*0*/units.add(new Tank(new IntVector2D(0, 2)));
//        /*1*/units.add(new Tank(new IntVector2D(0, 6)));
//        /*2*/units.add(new Mine(new IntVector2D(0, 3), 4));
//        /*3*/units.add(new Mine(new IntVector2D(7, 4), 2));
//        /*4*/units.add(new SmartMine(new IntVector2D(8, 5), 4, 1));
//        /*5*/units.add(new Mine(new IntVector2D(14, 1), 3));
//        /*6*/units.add(new Mine(new IntVector2D(1, 7), 1));
//        /*7*/units.add(new SmartMine(new IntVector2D(2,0), 4, 1));
//        /*8*/units.add(new Mine(new IntVector2D(13, 5), 1));
//        /*9*/units.add(new SmartMine(new IntVector2D(0, 4), 2, 3));
//        /*A*/units.add(new Mine(new IntVector2D(8, 6), 4));
//        /*B*/units.add(new SmartMine(new IntVector2D(6, 1), 2, 3));
//        /*C*/units.add(new Mine(new IntVector2D(8, 0), 3));
//        /*D*/units.add(new SmartMine(new IntVector2D(12, 1), 4, 3));
//        /*E*/units.add(new SmartMine(new IntVector2D(2, 3), 3, 1));
//        /*F*/units.add(new Mine(new IntVector2D(12, 6), 1));

//        units.add(new Tank(new IntVector2D(13, 2)));
//        units.add(new Mine(new IntVector2D(14, 2), 2));

//        /*0*/units.add(new Wraith(      new IntVector2D(6,  5)));
//        /*1*/units.add(new SmartMine(   new IntVector2D(11, 4), 4, 3));
//        /*2*/units.add(new Wraith(      new IntVector2D(2,  2)));
//        /*3*/units.add(new Marine(      new IntVector2D(10, 3)));
//        /*4*/units.add(new Tank(        new IntVector2D(8,  4)));
//        /*5*/units.add(new Tank(        new IntVector2D(10, 0)));
//        /*6*/units.add(new Wraith(      new IntVector2D(11, 6)));
//        /*7*/units.add(new Turret(      new IntVector2D(0,  7)));
//        /*8*/units.add(new Mine(        new IntVector2D(11, 1), 4));
//        /*9*/units.add(new Mine(        new IntVector2D(5,  5), 1));
//        /*A*/units.add(new Marine(      new IntVector2D(11, 4)));
//        /*B*/units.add(new Mine(        new IntVector2D(14, 6), 4));
//        /*C*/units.add(new Wraith(      new IntVector2D(11, 2)));
//        /*D*/units.add(new Turret(      new IntVector2D(15, 3)));
//        /*E*/units.add(new Marine(      new IntVector2D(11, 7)));
//        /*F*/units.add(new SmartMine(   new IntVector2D(4,  7), 3, 3));

//        /*0*/units.add(new Tank(        new IntVector2D(0,  2)));
//        /*1*/units.add(new Tank(        new IntVector2D(0,  6)));
//        /*2*/units.add(new Mine(        new IntVector2D(8,  1), 2));
//        /*3*/units.add(new SmartMine(   new IntVector2D(7,  4), 3, 3));
//        /*4*/units.add(new Mine(        new IntVector2D(1,  6), 2));
//        /*5*/units.add(new Mine(        new IntVector2D(14, 7), 4));
//        /*6*/units.add(new Mine(        new IntVector2D(13, 0), 4));
//        /*7*/units.add(new SmartMine(   new IntVector2D(7,  1), 1, 2));
//        /*8*/units.add(new Mine(        new IntVector2D(11, 6), 4));
//        /*9*/units.add(new SmartMine(   new IntVector2D(11, 1), 1, 3));
//        /*A*/units.add(new Mine(        new IntVector2D(11, 3), 2));
//        /*B*/units.add(new Mine(        new IntVector2D(9,  2), 3));
//        /*C*/units.add(new SmartMine(   new IntVector2D(15, 7), 1, 2));
//        /*D*/units.add(new SmartMine(   new IntVector2D(10, 2), 4, 2));
//        /*E*/units.add(new SmartMine(   new IntVector2D(0,  4), 1, 3));
//        /*F*/units.add(new SmartMine(   new IntVector2D(1,  5), 3, 3));

//        /*0*/units.add(new Wraith(      new IntVector2D(15, 0)));
//        /*1*/units.add(new Marine(      new IntVector2D(4,  3)));
//        /*2*/units.add(new Marine(      new IntVector2D(10, 5)));
//        /*3*/units.add(new Turret(      new IntVector2D(3,  4)));
//        /*4*/units.add(new Wraith(      new IntVector2D(14, 7)));
//        /*5*/units.add(new Mine(        new IntVector2D(14, 6), 3));
//        /*6*/units.add(new Mine(        new IntVector2D(5,  0), 3));
//        /*7*/units.add(new SmartMine(   new IntVector2D(8,  0), 2, 2));
//        /*8*/units.add(new Mine(        new IntVector2D(4,  2), 3));
//        /*9*/units.add(new Tank(        new IntVector2D(9,  6)));
//        /*A*/units.add(new Turret(      new IntVector2D(3,  7)));
//        /*B*/units.add(new SmartMine(   new IntVector2D(14, 3), 3, 1));
//        /*C*/units.add(new Tank(        new IntVector2D(8,  0)));
//        /*D*/units.add(new SmartMine(   new IntVector2D(2,  4), 4, 1));
//        /*E*/units.add(new Wraith(      new IntVector2D(10, 0)));
//        /*F*/units.add(new Wraith(      new IntVector2D(4,  5)));

//        /*0*/units.add(new Tank(      new IntVector2D(0, 2)));
//        /*1*/units.add(new Tank(      new IntVector2D(0, 6)));
//        /*2*/units.add(new SmartMine( new IntVector2D(9, 7), 2, 1));
//        /*3*/units.add(new Mine(      new IntVector2D(7, 5), 2));
//        /*4*/units.add(new SmartMine( new IntVector2D(1, 3), 2, 2));
//        /*5*/units.add(new Mine(      new IntVector2D(10, 6), 3));
//        /*6*/units.add(new Mine(      new IntVector2D(11, 7), 2));
//        /*7*/units.add(new SmartMine( new IntVector2D(0, 7), 2, 2));
//        /*8*/units.add(new Mine(      new IntVector2D(6, 6), 4));
//        /*9*/units.add(new Mine(      new IntVector2D(2, 0), 3));
//        /*A*/units.add(new Mine(      new IntVector2D(6, 4), 1));
//        /*B*/units.add(new Mine(      new IntVector2D(14, 3), 4));
//        /*C*/units.add(new SmartMine( new IntVector2D(11, 0), 3, 2));
//        /*D*/units.add(new SmartMine( new IntVector2D(15, 2), 3, 1));
//        /*E*/units.add(new Mine(      new IntVector2D(12, 2), 2));
//        /*F*/units.add(new SmartMine( new IntVector2D(12, 6), 4, 1));

        simulationTest0_0(units);
        //
//        /*0*/units.add(new Wraith(      new IntVector2D(6, 5)));
//        /*1*/units.add(new SmartMine(      new IntVector2D(11, 4), 4, 3));
//        /*2*/units.add(new Wraith( new IntVector2D(2, 2)));
//        /*3*/units.add(new Marine(      new IntVector2D(10, 3)));
//        /*4*/units.add(new Tank( new IntVector2D(8, 4)));
//        /*5*/units.add(new Tank(      new IntVector2D(10, 0)));
//        /*6*/units.add(new Wraith(      new IntVector2D(11, 6)));
//        /*7*/units.add(new Turret( new IntVector2D(0, 7)));
//        /*8*/units.add(new Mine(      new IntVector2D(11, 1), 4));
//        /*9*/units.add(new Mine(      new IntVector2D(5, 5), 1));
//        /*A*/units.add(new Marine(      new IntVector2D(11, 4)));
//        /*B*/units.add(new Mine(      new IntVector2D(14, 6), 4));
//        /*C*/units.add(new Wraith( new IntVector2D(11, 2)));
//        /*D*/units.add(new Turret( new IntVector2D(15, 3)));
//        /*E*/units.add(new Marine(      new IntVector2D(11, 7)));
//        /*F*/units.add(new SmartMine( new IntVector2D(4, 7), 3, 3));


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

    public static void simulationTesttest(ArrayList<Unit> units) {
        units.clear();
        /*0*/units.add(new Turret(      new IntVector2D(6, 0)));
        /*1*/units.add(new Wraith(      new IntVector2D(5, 2)));
        /*2*/units.add(new Wraith(      new IntVector2D(0, 0)));
        /*3*/units.add(new Marine(      new IntVector2D(3, 3)));
        /*4*/units.add(new Tank(        new IntVector2D(6, 0)));
        /*5*/units.add(new SmartMine(   new IntVector2D(5,0), 4, 1));
        /*6*/units.add(new Tank(        new IntVector2D(1,0)));
        /*7*/units.add(new Marine(      new IntVector2D(1, 2)));
        /*8*/units.add(new Marine(      new IntVector2D(4, 3)));
        /*9*/units.add(new SmartMine(   new IntVector2D(5, 0), 1, 3));
        /*A*/units.add(new Tank(        new IntVector2D(1, 1)));
        /*B*/units.add(new Marine(      new IntVector2D(3,0)));
        /*C*/units.add(new Mine(        new IntVector2D(3,3), 3));
        /*D*/units.add(new Wraith(      new IntVector2D(3,0)));
        /*E*/units.add(new Wraith(      new IntVector2D(1,0)));
        /*F*/units.add(new SmartMine(   new IntVector2D(0,2), 2, 2));
    }

    public static void simulationTest(ArrayList<Unit> units) {
        units.clear();
        Unit u0 = new Mine(new IntVector2D(12, 1), 2);
        Unit u1 = new Marine(new IntVector2D(0, 5));
        Unit u2 = new Turret(new IntVector2D(5, 6));
        Unit u3 = new Tank(new IntVector2D(2, 4));
        Unit u4 = new Marine(new IntVector2D(2, 4));
        Unit u5 = new Wraith(new IntVector2D(2, 7));
        Unit u6 = new SmartMine(new IntVector2D(11, 1), 2, 3);
        Unit u7 = new Marine(new IntVector2D(12, 1));
        Unit u8 = new Marine(new IntVector2D(12, 3));
        Unit u9 = new Wraith(new IntVector2D(7, 6));
        Unit u10 = new Destroyer(new IntVector2D(15, 7));
        units.add(u0);
        units.add(u1);
        units.add(u2);
        units.add(u3);
        units.add(u4);
        units.add(u5);
        units.add(u6);
        units.add(u7);
        units.add(u8);
        units.add(u9);
        units.add(u10);
    }
    public static void simulationTest0_0(ArrayList<Unit> units) {
        units.clear();
        Unit u0 = new Wraith(new IntVector2D(15, 0));
        Unit u1 = new Marine(new IntVector2D(4, 3));
        Unit u2 = new Marine(new IntVector2D(10, 5));
        Unit u3 = new Turret(new IntVector2D(3, 4));
        Unit u4 = new Wraith(new IntVector2D(14, 7));
        Unit u5 = new Mine(new IntVector2D(14, 6), 3);
        Unit u6 = new Mine(new IntVector2D(5, 0), 3);
        Unit u7 = new SmartMine(new IntVector2D(8, 0), 2, 2);
        Unit u8 = new Mine(new IntVector2D(4, 2), 3);
        Unit u9 = new Tank(new IntVector2D(9, 6));
        Unit uA = new Turret(new IntVector2D(3, 7));
        Unit uB = new SmartMine(new IntVector2D(14, 3), 3, 1);
        Unit uC = new Tank(new IntVector2D(8, 0));
        Unit uD = new SmartMine(new IntVector2D(2, 4), 4, 1);
        Unit uE = new Wraith(new IntVector2D(10, 0));
        Unit uF = new Wraith(new IntVector2D(4, 5));
        units.add(u0);
        units.add(u1);
        units.add(u2);
        units.add(u3);
        units.add(u4);
        units.add(u5);
        units.add(u6);
        units.add(u7);
        units.add(u8);
        units.add(u9);
        units.add(uA);
        units.add(uB);
        units.add(uC);
        units.add(uD);
        units.add(uE);
        units.add(uF);
    }
    public static void simulationTest0_1(ArrayList<Unit> units) {
        units.clear();
        Unit u0 = new Marine(new IntVector2D(0xC, 6));
        Unit u1 = new Turret(new IntVector2D(7, 4));
        Unit u2 = new SmartMine(new IntVector2D(2, 5), 2, 2);
        Unit u3 = new Mine(new IntVector2D(7, 3), 2);
        Unit u4 = new Mine(new IntVector2D(7, 7), 4);
        Unit u5 = new Turret(new IntVector2D(1, 6));
        Unit u6 = new Mine(new IntVector2D(0xB, 0), 4);
        Unit u7 = new SmartMine(new IntVector2D(3, 0), 2, 1);
        Unit u8 = new Turret(new IntVector2D(0xA, 0));
        Unit u9 = new Turret(new IntVector2D(0xD, 3));
        Unit uA = new Turret(new IntVector2D(0xE, 2));
        Unit uB = new Tank(new IntVector2D(0xE, 6));
        Unit uC = new SmartMine(new IntVector2D(0xA, 0), 1, 3);
        Unit uD = new Marine(new IntVector2D(0xC, 6));
        Unit uE = new Wraith(new IntVector2D(8, 7));
        Unit uF = new Wraith(new IntVector2D(0xF, 7));
        units.add(u0);
        units.add(u1);
        units.add(u2);
        units.add(u3);
        units.add(u4);
        units.add(u5);
        units.add(u6);
        units.add(u7);
        units.add(u8);
        units.add(u9);
        units.add(uA);
        units.add(uB);
        units.add(uC);
        units.add(uD);
        units.add(uE);
        units.add(uF);
    }
    public static void simulationTest0_2(ArrayList<Unit> units) {
        units.clear();
        Unit u0 = new Turret(new IntVector2D(0xE, 2));
        Unit u1 = new Tank(new IntVector2D(0xB, 4));
        Unit u2 = new Turret(new IntVector2D(7, 2));
        Unit u3 = new SmartMine(new IntVector2D(0xD, 2), 2, 2);
        Unit u4 = new Tank(new IntVector2D(0xC, 5));
        Unit u5 = new Mine(new IntVector2D(9, 3), 3);
        Unit u6 = new Marine(new IntVector2D(2, 7));
        Unit u7 = new Turret(new IntVector2D(5, 3));
        Unit u8 = new Wraith(new IntVector2D(0xF, 5));
        Unit u9 = new Mine(new IntVector2D(6, 6), 4);
        Unit uA = new Wraith(new IntVector2D(0xD, 6));
        Unit uB = new SmartMine(new IntVector2D(4, 7), 1, 1);
        Unit uC = new Wraith(new IntVector2D(9, 0));
        Unit uD = new Mine(new IntVector2D(1, 3), 1);
        Unit uE = new Marine(new IntVector2D(0xA, 5));
        Unit uF = new SmartMine(new IntVector2D(6, 5), 3, 2);
        units.add(u0);
        units.add(u1);
        units.add(u2);
        units.add(u3);
        units.add(u4);
        units.add(u5);
        units.add(u6);
        units.add(u7);
        units.add(u8);
        units.add(u9);
        units.add(uA);
        units.add(uB);
        units.add(uC);
        units.add(uD);
        units.add(uE);
        units.add(uF);
    }
    public static void simulationTest0_3(ArrayList<Unit> units) {
        units.clear();
        Unit u0 = new SmartMine(new IntVector2D(0xC, 7), 2, 2);
        Unit u1 = new Turret(new IntVector2D(6, 7));
        Unit u2 = new Mine(new IntVector2D(0xA, 3), 1);
        Unit u3 = new Tank(new IntVector2D(2, 0));
        Unit u4 = new Mine(new IntVector2D(7, 0), 2);
        Unit u5 = new Wraith(new IntVector2D(6, 0));
        Unit u6 = new SmartMine(new IntVector2D(0xA, 2), 2, 2);
        Unit u7 = new Marine(new IntVector2D(4, 0));
        Unit u8 = new Wraith(new IntVector2D(0xE, 6));
        Unit u9 = new SmartMine(new IntVector2D(3, 4), 4, 2);
        Unit uA = new Mine(new IntVector2D(2, 0), 3);
        Unit uB = new Tank(new IntVector2D(6, 7));
        Unit uC = new Wraith(new IntVector2D(0xA, 7));
        Unit uD = new Marine(new IntVector2D(3, 1));
        Unit uE = new Mine(new IntVector2D(0xE, 3), 4);
        Unit uF = new Marine(new IntVector2D(7, 5));
        units.add(u0);
        units.add(u1);
        units.add(u2);
        units.add(u3);
        units.add(u4);
        units.add(u5);
        units.add(u6);
        units.add(u7);
        units.add(u8);
        units.add(u9);
        units.add(uA);
        units.add(uB);
        units.add(uC);
        units.add(uD);
        units.add(uE);
        units.add(uF);
    }
    public static void simulationTest1(ArrayList<Unit> units) {
        units.clear();
        Unit u0 = new Tank(new IntVector2D(0, 2));
        Unit u1 = new Tank(new IntVector2D(0, 6));
        Unit u2 = new SmartMine(new IntVector2D(0xC, 1), 1, 2);
        Unit u3 = new Mine(new IntVector2D(7, 6), 1);
        Unit u4 = new Mine(new IntVector2D(8, 5), 3);
        Unit u5 = new Mine(new IntVector2D(0xC, 2), 4);
        Unit u6 = new Mine(new IntVector2D(1, 1), 3);
        Unit u7 = new Mine(new IntVector2D(0xA, 2), 2);
        Unit u8 = new SmartMine(new IntVector2D(0xC, 7), 3, 3);
        Unit u9 = new SmartMine(new IntVector2D(1, 4), 1, 3);
        Unit uA = new Mine(new IntVector2D(6, 7), 4);
        Unit uB = new SmartMine(new IntVector2D(7, 3), 2, 2);
        Unit uC = new SmartMine(new IntVector2D(0xE, 6), 1, 3);
        Unit uD = new Mine(new IntVector2D(0, 1), 3);
        Unit uE = new Mine(new IntVector2D(7, 6), 1);
        Unit uF = new Mine(new IntVector2D(1, 7), 2);
        units.add(u0);
        units.add(u1);
        units.add(u2);
        units.add(u3);
        units.add(u4);
        units.add(u5);
        units.add(u6);
        units.add(u7);
        units.add(u8);
        units.add(u9);
        units.add(uA);
        units.add(uB);
        units.add(uC);
        units.add(uD);
        units.add(uE);
        units.add(uF);
    }
    public static void simulationTest2_0(ArrayList<Unit> units) {
        units.clear();
        Unit u0 = new Marine(new IntVector2D(2, 1));
        Unit u1 = new Turret(new IntVector2D(0, 2));
        Unit u2 = new Wraith(new IntVector2D(3, 0));
        Unit u3 = new Mine(new IntVector2D(4, 0), 4);
        Unit u4 = new Marine(new IntVector2D(4, 3));
        Unit u5 = new Turret(new IntVector2D(5, 0));
        Unit u6 = new Tank(new IntVector2D(4, 1));
        Unit u7 = new Wraith(new IntVector2D(0, 2));
        Unit u8 = new SmartMine(new IntVector2D(0, 3), 3, 3);
        Unit u9 = new Wraith(new IntVector2D(3, 0));
        Unit uA = new Mine(new IntVector2D(2, 0), 4);
        Unit uB = new Wraith(new IntVector2D(2, 3));
        Unit uC = new Tank(new IntVector2D(5, 3));
        Unit uD = new Wraith(new IntVector2D(0, 1));
        Unit uE = new SmartMine(new IntVector2D(0, 2), 1, 3);
        Unit uF = new Mine(new IntVector2D(2, 2), 2);
        units.add(u0);
        units.add(u1);
        units.add(u2);
        units.add(u3);
        units.add(u4);
        units.add(u5);
        units.add(u6);
        units.add(u7);
        units.add(u8);
        units.add(u9);
        units.add(uA);
        units.add(uB);
        units.add(uC);
        units.add(uD);
        units.add(uE);
        units.add(uF);
    }
    public static void simulationTest2_1(ArrayList<Unit> units) {
        units.clear();
        Unit u0 = new SmartMine(new IntVector2D(0, 1), 4, 1);
        Unit u1 = new Marine(new IntVector2D(7, 2));
        Unit u2 = new Wraith(new IntVector2D(2, 1));
        Unit u3 = new Wraith(new IntVector2D(2, 3));
        Unit u4 = new SmartMine(new IntVector2D(0, 0), 4, 2);
        Unit u5 = new Mine(new IntVector2D(6, 3), 4);
        Unit u6 = new Marine(new IntVector2D(2, 2));
        Unit u7 = new Wraith(new IntVector2D(0, 0));
        Unit u8 = new Tank(new IntVector2D(6, 2));
        Unit u9 = new SmartMine(new IntVector2D(3, 1), 2, 3);
        Unit uA = new Wraith(new IntVector2D(3, 3));
        Unit uB = new Wraith(new IntVector2D(1, 2));
        Unit uC = new Wraith(new IntVector2D(0, 3));
        Unit uD = new SmartMine(new IntVector2D(4, 0), 4, 3);
        Unit uE = new SmartMine(new IntVector2D(5, 3), 2, 1);
        Unit uF = new Wraith(new IntVector2D(0, 3));
        units.add(u0);
        units.add(u1);
        units.add(u2);
        units.add(u3);
        units.add(u4);
        units.add(u5);
        units.add(u6);
        units.add(u7);
        units.add(u8);
        units.add(u9);
        units.add(uA);
        units.add(uB);
        units.add(uC);
        units.add(uD);
        units.add(uE);
        units.add(uF);
    }
}

