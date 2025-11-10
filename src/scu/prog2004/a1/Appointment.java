package scu.prog2004.a1;

public class Appointment {
    // 实例变量：患者姓名、手机号、预约时间、接诊医生（父类引用，支持多态）
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional doctor; // 父类类型引用，可指向子类对象

    // 默认构造函数
    public Appointment() {
        this.patientName = "Unknown";
        this.patientMobile = "0000000000";
        this.timeSlot = "00:00";
        this.doctor = new HealthProfessional();
    }

    // 带参构造函数（初始化所有变量）
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // 打印预约详情
    public void printAppointment() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Appointment Time: " + timeSlot);
        System.out.println("Consulting Doctor: " + doctor.getName());
        doctor.printDetails(); // 调用医生的打印方法（多态：根据医生类型执行不同逻辑）
    }

    // Getter方法（取消预约时需要通过手机号查询，必须提供）
    public String getPatientMobile() {
        return patientMobile;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }
}