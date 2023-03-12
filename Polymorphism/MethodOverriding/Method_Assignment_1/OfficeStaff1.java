package Polymorphism.MethodOverriding.Method_Assignment_1;

class Faculty {
    // Implement your code here
    private String name;
    private float basicSalary;
    private float bonusPercentage;
    private float carAllowancePercentage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public float getCarAllowancePercentage() {
        return carAllowancePercentage;
    }

    public void setCarAllowancePercentage(float carAllowancePercentage) {
        this.carAllowancePercentage = carAllowancePercentage;
    }

    public Faculty(String name, float basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonusPercentage = 4;
        this.carAllowancePercentage = 2.5f;
    }

    public double calculateSalary() {
        double totalSalary = 0.0;
        totalSalary = this.basicSalary + (this.basicSalary * (0.04f)) + (this.basicSalary * (0.025f));
        return totalSalary;
    }

}

class OfficeStaff extends Faculty {
    // Implement your code here
    private String designation;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public OfficeStaff(String name, float basicSalary, String designation) {
        super(name, basicSalary);
        this.designation = designation;
    }

    public double calculateSalary() {
        double totalSalary = super.calculateSalary();
        if (this.designation.equals("Accountant"))
            return totalSalary + 10000.0;
        else if (this.designation.equals("Clerk"))
            return totalSalary + 7000.0;
        else if (this.designation.equals("Peon"))
            return totalSalary + 4500.0;
        else
            return totalSalary;
    }
}

class Teacher extends Faculty {
    // Implement your code here
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Teacher(String name, float basicSalary, String qualification) {
        super(name, basicSalary);
        setQualification(qualification);
    }

    public double calculateSalary() {
        double totalSalary = super.calculateSalary();
        if (this.qualification.equals("Doctoral"))
            return totalSalary + 20000.0;
        else if (this.qualification.equals("Masters"))
            return totalSalary + 18000.0;
        else if (this.qualification.equals("Bachelors"))
            return totalSalary + 15500.0;
        else if (this.qualification.equals("Associate"))
            return totalSalary + 10000.0;
        else
            return totalSalary;
    }
}

class OfficeStaff1 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
        OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");

        System.out.println("Teacher Details\n***************");
        System.out.println("Name: " + teacher.getName());
        System.out.println("Qualification: " + teacher.getQualification());
        System.out.println("Total salary: $" + Math.round(teacher.calculateSalary() * 100.0) / 100.0);
        System.out.println();

        System.out.println("Office Staff Details\n***************");
        System.out.println("Name: " + officeStaff.getName());
        System.out.println("Designation: " + officeStaff.getDesignation());
        System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary() * 100.0) / 100.0);

        // Create more objects for testing your code

    }
}
