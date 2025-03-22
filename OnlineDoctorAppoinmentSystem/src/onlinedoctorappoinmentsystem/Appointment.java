/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinedoctorappoinmentsystem;

/**
 *
 * @author Emran Hossain
 */
public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String timeslot;
    private String status;

    public Appointment(Patient patient, Doctor doctor, String timeslot) {
        this.patient = patient;
        this.doctor = doctor;
        this.timeslot = timeslot;
        this.status = "Booked";
    }

    public void cancel() {
        status = "Cancelled";
        System.out.println("Appointment with Dr. " + doctor.getName() + " at " + timeslot + " has been cancelled.");
    }

    public String getStatus() {
        return status;
    }

    public String getTimeslot() {
        return timeslot;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }
}