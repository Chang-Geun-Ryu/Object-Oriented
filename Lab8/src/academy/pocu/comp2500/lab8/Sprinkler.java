package academy.pocu.comp2500.lab8;

import java.util.ArrayList;

public class Sprinkler extends SmartDevice implements ISprayable {
    private static final int water = 15;
    private static final ArrayList<Schedule> s = new ArrayList<>();
    private Schedule onSchedule;
//  this.tick - this.switchTick;
    private int keepSprayTick;


    public Sprinkler() {
        this.tick = 0;
        this.switchTick = 0;
        this.isOn = false;
        this.keepSprayTick = 0;
        this.onSchedule = null;
    }

    public void addSchedule(Schedule schedule) {
        s.add(schedule);
    }

    @Override
    public void addInstall(Planter planter) {
        planter.installSprinkler(this);
    }

    private Schedule getScheduleOrNull() {
        ArrayList<Schedule> removeItems = new ArrayList<>();
        Schedule pickSchedule = null;

        for (Schedule schedule : s) {
            removeItems.add(schedule);

            if (this.tick < schedule.getStartTick() + schedule.getKeep()) {
                pickSchedule = schedule;
                break;
            }
        }

        s.removeAll(removeItems);

        return pickSchedule;
    }

    private boolean processeSchedule() {
        Schedule schedule = getScheduleOrNull();
        if (schedule != null) {
            int startTick = schedule.getStartTick();
            int keepTick = schedule.getKeep();

            if (this.tick > startTick) {

            } else {

            }
        }

        return false;
    }

    @Override
    public void onTick() {
        // start
        if (this.onSchedule == null) {
            this.onSchedule = getScheduleOrNull();
        }

        // process on/off
        if (this.isOn) {
            if (this.tick == this.onSchedule.getStartTick() + this.onSchedule.getKeep()) {
                this.isOn = false;
                switchTick = this.tick;
            }
        } else {
            if (this.onSchedule != null && this.onSchedule.getStartTick() == this.tick) {
                this.isOn = true;
                switchTick = this.tick;
            }
        }

        // end 처리
        if (this.onSchedule != null && this.tick >= this.onSchedule.getStartTick() + this.onSchedule.getKeep()) {
            this.onSchedule = null;
        }

        this.tick += 1;
    }

    @Override
    public void spray(Planter planter) {
        if (this.isOn) {
            planter.sprayWater(water);
        }
    }


//    @Override
//    public void spray(Planter planter) {
//        if (this.isOn) {
////            planter.
//        }
//    }
}
