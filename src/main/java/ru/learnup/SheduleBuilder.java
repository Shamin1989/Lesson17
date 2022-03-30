package ru.learnup;

import java.util.ArrayList;
import java.util.List;

public class SheduleBuilder {
    private List<Boolean> workSchedule = null;

    public SheduleBuilder() {

    }

    public void setSize(int size) {
        if (workSchedule != null) {
            int sizeSchedule = workSchedule.size();
            if (size > sizeSchedule) {
                for (int i = workSchedule.size(); i < size; i++) {
                    workSchedule.add(false);
                }
            } else if (size < sizeSchedule) {
                workSchedule.subList(size, sizeSchedule).clear();
            }
        } else {
            workSchedule = new ArrayList<>(size);
        }
    }

    public void dayOff() {
        workSchedule.add(false);
    }

    public void dayOffs(int count) {
        for (int i = 0; i < count; i++) {
            workSchedule.add(false);
        }
    }

    public void wordDay() {
        workSchedule.add(true);
    }

    public void workDays(int count) {
        for (int i = 0; i < count; i++) {
            workSchedule.add(true);
        }

    }

    public Shedule build() {
        Boolean[] schedule = new Boolean[workSchedule.size()];
        for (int i = 0; i < workSchedule.size(); i++) {
            schedule[i] = workSchedule.get(i);
        }
        return new Shedule(schedule);
    }
}
