package scu.prog2004.a1;

import java.util.ArrayList;
import java.util.Iterator;

public class AssignmentOne {
    // 声明静态ArrayList（存储所有预约，供所有方法访问）
    private static ArrayList<Appointment> appointmentList = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 代码（保持不变）
        System.out.println("=== Part 3: Health Professional Details ===");
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Emily Davis", "Family Medicine", 25);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Michael Brown", "General Practice", 22);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Sarah Wilson", "Primary Care", 18);
        Cardiologist cardio1 = new Cardiologist(201, "Dr. James Taylor", "Cardiology", "Heart Failure");
        Cardiologist cardio2 = new Cardiologist(202, "Dr. Lisa Anderson", "Cardiology", "Arrhythmia");
        
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        cardio1.printDetails();
        cardio2.printDetails();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("=== Part 5: Appointment Management ===");
        
        // 创建4个预约（2个GP，2个心脏病专家）
        createAppointment("John Smith", "0412345678", "08:30", gp1);
        createAppointment("Mary Johnson", "0487654321", "10:15", gp2);
        createAppointment("Robert Lee", "0423456789", "14:00", cardio1);
        createAppointment("Jennifer Wong", "0498765432", "16:45", cardio2);
        
        // 打印所有预约
        System.out.println("=== All Appointments After Creation ===");
        printExistingAppointments();
        
        // 取消一个预约（根据手机号）
        String cancelMobile = "0487654321";
        System.out.println("=== Canceling Appointment for Mobile: " + cancelMobile + " ===");
        cancelBooking(cancelMobile);
        
        // 打印取消后的预约
        System.out.println("=== All Appointments After Cancellation ===");
        printExistingAppointments();
        
        System.out.println("------------------------------");
    }

    // Part 5：创建预约并添加到集合（支持多态，可接收任何HealthProfessional子类对象）
    public static void createAppointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        // 数据验证：必填信息不能为空
        if (patientName.isEmpty() || patientMobile.isEmpty() || timeSlot.isEmpty() || doctor == null) {
            System.out.println("Error: All appointment details are required. Cannot create appointment.");
            return;
        }
        // 创建预约对象并添加到集合
        Appointment newAppt = new Appointment(patientName, patientMobile, timeSlot, doctor);
        appointmentList.add(newAppt);
        System.out.println("Appointment created successfully for " + patientName);
    }

    // Part 5：打印所有预约
    public static void printExistingAppointments() {
        if (appointmentList.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }
        for (int i = 0; i < appointmentList.size(); i++) {
            System.out.println("=== Appointment " + (i + 1) + " ===");
            appointmentList.get(i).printAppointment();
            System.out.println();
        }
    }

    // Part 5：根据手机号取消预约
    public static void cancelBooking(String patientMobile) {
        Iterator<Appointment> iterator = appointmentList.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Appointment appt = iterator.next();
            if (appt.getPatientMobile().equals(patientMobile)) {
                iterator.remove(); // 安全删除
                found = true;
                System.out.println("Appointment canceled successfully for mobile: " + patientMobile);
            }
        }
        if (!found) {
            System.out.println("Error: No appointment found with mobile number: " + patientMobile);
        }
    }
}