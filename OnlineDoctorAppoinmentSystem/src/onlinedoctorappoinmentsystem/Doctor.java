/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinedoctorappoinmentsystem;

import java.util.ArrayList;

/**
 *
 * @author Emran Hossain
 */
public class Doctor {
    private String name;
    private String specialization;
    private ArrayList<String> availableTimeslots;
    private ArrayList<Appointment> appointments;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.availableTimeslots = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    // Add available timeslot
    public void addAvailableTimeslot(String timeslot) {
        availableTimeslots.add(timeslot);
    }

    public ArrayList<String> getAvailableTimeslots() {
        return availableTimeslots;
    }

    // Add appointment
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    // Get doctor name
    public String getName() {
        return name;
    }

    // View doctor's schedule
    public void viewSchedule() {
        System.out.println("Available Timeslots for Dr. " + name + ":");
        for (String timeslot : availableTimeslots) {
            System.out.println(timeslot);
        }
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }
}