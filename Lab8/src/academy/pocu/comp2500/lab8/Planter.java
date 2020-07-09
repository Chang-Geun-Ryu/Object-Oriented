package academy.pocu.comp2500.lab8;

import java.util.ArrayList;

public class Planter {
    private final int useWater = 2;
    private int waterAmount;
    private ArrayList<Sprinkler> sprayableDevices;
    private ArrayList<Drainer> drainableDevices;

    private ISprayable sprayableCallBack = null;

    public Planter(int waterAmount) {
        this.waterAmount = waterAmount;
        this.sprayableDevices = new ArrayList<>();
        this.drainableDevices = new ArrayList<>();
    }

    public void setSprayableCallBack(ISprayable sprayable) {
        this.sprayableCallBack = sprayable;
    }

    public int getWaterAmount() {
        return this.waterAmount;
    }

    public void installSmartDevice(SmartDevice device) {
//        devices.add(device);
        device.addInstall(this);
    }

    public void installSprinkler(Sprinkler s) {
        this.sprayableDevices.add(s);
    }

    public void installDrainer(Drainer d) {
        this.drainableDevices.add(d);

        IWaterDetectable detect = new IWaterDetectable() {
            @Override
            public void detect(int waterLevel) {
                waterAmount -= waterLevel;
            }
        };
        d.setDetect(detect);
    }

    public void tick() {

        for (Sprinkler s : this.sprayableDevices) {
            s.onTick();
            s.spray(this);
        }

        for (Drainer d : this.drainableDevices) {
            d.onTick();
            d.drain(this);
        }

        this.waterAmount = this.waterAmount - 2 >= 0 ? this.waterAmount - 2 : 0;
    }
}
