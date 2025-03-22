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

public class Scheduler {
    private ArrayList<Appointment> appointments;

    public Scheduler() {
        appointments = new ArrayList<>();
    }

    // Check if a timeslot is available
    public boolean checkAvailability(Doctor doctor, String timeslot) {
        return doctor.getAvailableTimeslots().contains(timeslot);
    }

    // Book appointment for a patient
    public void bookAppointment(Patient patient, Doctor doctor, String timeslot) {
        if (checkAvailability(doctor, timeslot)) {
            patient.bookAppointment(doctor, timeslot);
        } else {
            System.out.println("Error: Timeslot not available.");
        }
    }

    // Cancel an appointment
    public void cancelAppointment(Patient patient, Appointment appointment) {
        patient.cancelAppointment(appointment);
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }
}
