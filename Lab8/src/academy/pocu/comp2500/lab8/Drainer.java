package academy.pocu.comp2500.lab8;


public class Drainer extends SmartDevice implements IDrainable, IWaterDetectable {
    private final int drainWater = 7;
    private final int detectLevel;
    private boolean isDetect;
    public Drainer(int level) {
        this.isOn = false;
        this.detectLevel = level;
        this.isDetect = false;
//        this.detect = null;
    }

//    protected void setDetect(IWaterDetectable detect) {
//        this.detect = detect;
//    }

    @Override
    public void onTick() {

        if (this.isDetect) {
            if (this.isOn) {

            } else {
                this.isOn = true;
                this.switchTick = this.tick;
            }

        } else {
            if (this.isOn) {
                this.isOn = false;
                this.switchTick = this.tick;
            }
        }

        this.tick += 1;
    }

//
//    public void installDetect(Planter p) {
//        IWaterDetectable detect = new IWaterDetectable() {
//
//        };
//        p.addDetect(detect);
//    }

    @Override
    public void addInstall(Planter planter) {
        planter.installDrainer(this);
        planter.addDetect(this::detect);
    }

    @Override
    public void drain(Planter planter) {
        if (this.isOn) {
            planter.drainWater(this.drainWater);
        }
    }

    @Override
    public void detect(int waterLevel) {
        if (detectLevel <= waterLevel) {
            isDetect = true;
        } else {
            isDetect = false;
        }
    }
}
