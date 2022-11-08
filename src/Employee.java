public class Employee {

    //Globale Attribute und Referenzen
    private String name;
    private String forename;
    private String birthdate;

    private char gender;
    private int age;
    private double weight;

    private String department;
    private double salary;

    private int yearsOfService;
    private String specialities;

    public Employee(String name, String forename, String birthdate, char gender, int age){
        this.name = name;
        this.forename = forename;
        this.birthdate = birthdate;
        this.gender = gender;
        this.age = age;
        this.yearsOfService = 0;
        this.salary = 1500;
        this.department = "A38";
        //Alle anderen Attribute/Referenzen erhalten ihren Nullwert.
    }

    public String getName(){
        return name;
    }

    public String getForename() {
        return forename;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public String getSpecialities() {
        return specialities;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public void setSpecialities(String specialities) {
        this.specialities = specialities;
    }
}
