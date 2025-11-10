package scu.prog2004.a1;

public class Cardiologist extends HealthProfessional {
    // 独特属性：擅长的心脏病类型（心脏病专家特有）
    private String specializedHeartCondition;

    // 默认构造函数
    public Cardiologist() {
        super();
        this.specializedHeartCondition = "Coronary Artery Disease";
    }

    // 带参构造函数
    public Cardiologist(int id, String name, String specialtyArea, String specializedHeartCondition) {
        super(id, name, specialtyArea);
        this.specializedHeartCondition = specializedHeartCondition;
    }

    // 打印医生详情
    @Override
    public void printDetails() {
        System.out.println("=== Health Professional Type: Cardiologist ===");
        super.printDetails();
        System.out.println("Specialized Heart Condition: " + specializedHeartCondition);
        System.out.println();
    }

    // Getter方法
    public String getSpecializedHeartCondition() {
        return specializedHeartCondition;
    }
}