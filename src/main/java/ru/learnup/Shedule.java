package ru.learnup;

public class Shedule {
    private final Boolean[] workSchedule;

    public Shedule(Boolean[] workSchedule) {
        this.workSchedule = workSchedule;
    }

    public Boolean[] getWorkSchedule() {
        return workSchedule;
    }
}
