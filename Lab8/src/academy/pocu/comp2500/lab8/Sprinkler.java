package academy.pocu.comp2500.lab8;

import java.util.ArrayList;

public class Sprinkler extends SmartDevice implements ISprayable {
    private static final int water = 15;
    private static final ArrayList<Schedule> s = new ArrayList<>();
//  this.tick - this.switchTick;

    public Sprinkler() {
        this.isOn = false;
    }

    public void addSchedule(Schedule schedule) {
        s.add(schedule);
    }

    private void passSchedule() {
        for (int i = s.size() - 1; i >= 0; --i) {
            if (s.get(i).getStartTick() < this.tick) {
                s.remove(i);
            }
        }
    }

    @Override
    public void addInstall(Planter planter) {
        planter.installSprinkler(this);
    }

    private Schedule getScheduleOrNull() {
        Schedule schedule = null;
        if (s.size() > 0) {
            schedule = s.get(0);
            s.remove(0);
        }

        return schedule;
    }

    private boolean processeSchedule() {
        Schedule schedule = getScheduleOrNull();
        if (schedule != null) {
            int startTick = schedule.getStartTick();
            int keepTick = schedule.getKeep();
        }

        return false;
    }

    @Override
    public void onTick() {

        if (this.isOn) {


        } else if (s.size() > 0) {
            this.isOn = processeSchedule();
        } else {

        }


        this.tick += 1;
    }

    @Override
    public void spray(Planter planter) {
        if (this.isOn) {
//            planter.setSprayableCallBack();/
        }
    }


//    @Override
//    public void spray(Planter planter) {
//        if (this.isOn) {
////            planter.
//        }
//    }
}
