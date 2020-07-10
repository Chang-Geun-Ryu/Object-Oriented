package academy.pocu.comp2500.lab8;


public class Drainer extends SmartDevice implements IDrainable, IWaterDetectable {
    private final int DRAIN = 7;
    private final int DETECT_LEVEL;
    private boolean isDetect;
    public Drainer(int level) {
        this.isOn = false;
        this.DETECT_LEVEL = level;
        this.isDetect = false;
    }

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
            planter.drainWater(this.DRAIN);
        }
    }

    @Override
    public void detect(int waterLevel) {
        if (DETECT_LEVEL <= waterLevel) {
            isDetect = true;
        } else {
            isDetect = false;
        }
    }
}
