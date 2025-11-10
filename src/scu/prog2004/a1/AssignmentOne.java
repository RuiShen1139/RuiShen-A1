package scu.prog2004.a1;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("=== Part 3: Health Professional Details ===");
        
        // 创建3个全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Emily Davis", "Family Medicine", 25);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Michael Brown", "General Practice", 22);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Sarah Wilson", "Primary Care", 18);
        
        // 创建2个心脏病专家对象
        Cardiologist cardio1 = new Cardiologist(201, "Dr. James Taylor", "Cardiology", "Heart Failure");
        Cardiologist cardio2 = new Cardiologist(202, "Dr. Lisa Anderson", "Cardiology", "Arrhythmia");
        
        // 打印所有医生详情
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        cardio1.printDetails();
        cardio2.printDetails();
        
        System.out.println("------------------------------");
    }
}