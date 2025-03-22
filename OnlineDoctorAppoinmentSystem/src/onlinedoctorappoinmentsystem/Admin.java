/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinedoctorappoinmentsystem;

/**
 *
 * @author Emran Hossain
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private String username;
    private String password;
    private ArrayList<Doctor> doctors;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
        this.doctors = new ArrayList<>();
    }

    // Add a new doctor
    public void addDoctor() {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter doctor's name: ");
        String name = sc.nextLine();
        
       System.out.print("Enter doctor's specialty: ");
       String specialization = sc.nextLine();
       
       Doctor doctor = new Doctor(name, specialization);
       doctors.add(doctor);
       System.out.println("Dr. " + name + " added as a " + specialization);
        
        
    }

    // View all doctors
    public void viewAllDoctors() {
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName() + " - " + doctor.getAvailableTimeslots());
        }
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
}

