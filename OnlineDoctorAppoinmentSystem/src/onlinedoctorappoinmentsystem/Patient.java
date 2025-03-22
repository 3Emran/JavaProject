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
public class Patient {
    private String name;
    private int age;
    private String contactInfo;
    private ArrayList<Appointment> appointments;

    public Patient(String name, int age, String contactInfo) {
        this.name = name;
        this.age = age;
        this.contactInfo = contactInfo;
        this.appointments = new ArrayList<>();
    }

    // Book an appointment
    public void bookAppointment(Doctor doctor, String timeslot) {
        if (doctor.getAvailableTimeslots().contains(timeslot)) {
            Appointment appointment = new Appointment(this, doctor, timeslot);
            appointments.add(appointment);
            doctor.addAppointment(appointment);
            System.out.println("Appointment booked with Dr. " + doctor.getName() + " at " + timeslot);
        } else {
            System.out.println("Error: The selected timeslot is unavailable.");
        }
    }

    // Cancel an appointment
    public void cancelAppointment(Appointment appointment) {
        if (appointments.contains(appointment)) {
            appointments.remove(appointment);
            appointment.cancel();
        } else {
            System.out.println("Error: Appointment not found.");
        }
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public String getName() {
        return name;
    }
}