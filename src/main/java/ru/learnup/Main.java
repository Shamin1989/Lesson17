package ru.learnup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.debug("Application started...");
        SheduleBuilder builder = new SheduleBuilder();
        builder.setSize(20);
        builder.wordDay();
        builder.workDays(4);
        builder.dayOffs(2);
        builder.workDays(5);
        builder.dayOffs(2);
        builder.dayOff();
        builder.wordDay();
        builder.workDays(4);
        Shedule shedule = builder.build();
        System.out.println(Arrays.toString(shedule.getWorkSchedule()));
        builder.setSize(15);
        shedule = builder.build();
        System.out.println(Arrays.toString(shedule.getWorkSchedule()));
        LOG.debug("Application finished...");
    }
}

