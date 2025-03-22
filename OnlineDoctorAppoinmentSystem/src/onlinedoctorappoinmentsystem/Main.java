/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onlinedoctorappoinmentsystem;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Emran Hossain
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        // Admin creates doctors
        Admin admin = new Admin("admin1", "password123");
        System.out.print("How many doctors would you like to add? ");
        int numDoctors = sc.nextInt();
        sc.nextLine();  // Consume the newline left by nextInt()

        // Loop to take input for each doctor
        for (int i = 0; i < numDoctors; i++) {
            // Call the addDoctor method in Admin class to get the name and specialty
            admin.addDoctor();
        }
        // Adding available timeslots for doctors
        Doctor doctor1 = admin.getDoctors().get(0);  // Dr. Smith
        doctor1.addAvailableTimeslot("10:00 AM");
        doctor1.addAvailableTimeslot("11:00 AM");
        
        // Create a patient
        Patient patient = new Patient("John Doe", 30, "123-456-7890");

        // Create a scheduler
        Scheduler scheduler = new Scheduler();

        // Patient books an appointment
        System.out.println("Booking an appointment with Dr. Smith at 10:00 AM...");
        scheduler.bookAppointment(patient, doctor1, "10:00 AM");

        // View patient appointments
        System.out.println("Appointments for patient: ");
        for (Appointment appointment : patient.getAppointments()) {
            System.out.println(appointment.getDoctor().getName() + " at " + appointment.getTimeslot());
        }

        // Patient cancels an appointment
        System.out.println("Cancelling appointment...");
        scheduler.cancelAppointment(patient, patient.getAppointments().get(0));
        
}
}