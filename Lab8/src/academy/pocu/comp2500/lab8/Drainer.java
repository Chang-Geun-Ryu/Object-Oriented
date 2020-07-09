package academy.pocu.comp2500.lab8;


public class Drainer extends SmartDevice implements IDrainable {
    private final int drainWater = 7;
    private final int level;
    private IWaterDetectable detect;
    public Drainer(int level) {
        this.isOn = false;
        this.level = level;
        this.detect = null;
    }

    protected void setDetect(IWaterDetectable detect) {
        this.detect = detect;
    }

    @Override
    public void onTick() {

        detect.detect(drainWater);
        this.tick += 1;
    }

    @Override
    public void addInstall(Planter planter) {
        planter.installDrainer(this);
    }

    @Override
    public void drain(Planter planter) {

    }
}
