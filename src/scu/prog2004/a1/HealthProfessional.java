package scu.prog2004.a1; 

public class HealthProfessional {
    // 实例变量
    private int id; // 仅数字ID
    private String name; // 姓名
    private String specialtyArea; // 额外属性：专业领域（所有健康从业者通用）

    // 默认构造函数（无参数）
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialtyArea = "General Health";
    }

    // 带参构造函数（初始化所有实例变量）
    public HealthProfessional(int id, String name, String specialtyArea) {
        this.id = id;
        this.name = name;
        this.specialtyArea = specialtyArea;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("Health Professional ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialty Area: " + specialtyArea);
    }

    // Getter和Setter方法
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialtyArea() {
        return specialtyArea;
    }
}