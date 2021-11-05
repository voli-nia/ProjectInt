package com.stepit.HomeWorks.L8HW;

import java.util.ArrayList;

public class Instructor extends ClubStaff {

    public String name;
    public int age;
    public String discipline;
    private String phone;
    private int salaryPerHour;

    public Instructor(String name, int age, String discipline) {
        this.name = name;
        this.age = age;
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", discipline='" + discipline + '\'' +
                ", phone='" + phone + '\'' +
                ", salaryPerHour=" + salaryPerHour +
                ", schedules=" + schedules +
                '}';
    }

    enum discipline {
        AQUA,
        POWER,
        GROUPLESSONS,
        PERSONAL,
        AEROBICA,
        YOGA
    }

    ArrayList<Instructor> instructors = new ArrayList<Instructor>();
    ArrayList <Schedule> schedules = new ArrayList<Schedule>();


}
