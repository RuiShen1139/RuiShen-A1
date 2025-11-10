package scu.prog2004.a1;

public class GeneralPractitioner extends HealthProfessional {
    // 独特属性：接诊最大患者数（全科医生特有）
    private int maxPatientsPerDay;

    // 默认构造函数
    public GeneralPractitioner() {
        super(); // 调用父类默认构造函数
        this.maxPatientsPerDay = 20;
    }

    // 带参构造函数（初始化父类+子类属性）
    public GeneralPractitioner(int id, String name, String specialtyArea, int maxPatientsPerDay) {
        super(id, name, specialtyArea); // 调用父类带参构造函数
        this.maxPatientsPerDay = maxPatientsPerDay;
    }

    // 打印医生详情（含类型和所有属性）
    @Override
    public void printDetails() {
        System.out.println("=== Health Professional Type: General Practitioner ===");
        super.printDetails(); // 调用父类打印方法
        System.out.println("Max Patients Per Day: " + maxPatientsPerDay);
        System.out.println();
    }

    // Getter方法
    public int getMaxPatientsPerDay() {
        return maxPatientsPerDay;
    }
}