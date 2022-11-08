public class MainProgram {

    public static void main(String[] args) {
        Employee e1 = new Employee("Ambro","King","01.01.1970", 'm', 60);
        Employee e2 = new Employee("Müller","Dr.","13.09.2022", 'd', 63);
        Employee e3 = e2;

        System.out.println("Gehaltsprüfung für "+e1.getName());
        if(e1.getSalary() > 2000){
            System.out.println("Verdient genug!");
        }else{
            System.out.println("Verdient nicht genug :...(");
        }

        System.out.println("Gehaltsprüfung für "+e1.getName()+": "+e1.getSalary());
        if(e1.getAge() >= 40){
            e1.setSalary(3000);
        }

        System.out.println("Gehaltsprüfung für "+e1.getName()+": "+e1.getSalary());
        if(e1.getAge() >= 50){
            //Verwende eine Hilfsvariable für eine komplizierte Zwischenrechnung
            double newSalary = 1000*Math.random() + 4000;
            e1.setSalary(newSalary);
        }

        System.out.println("Gehaltsprüfung für "+e1.getName()+": "+e1.getSalary());
        if(e1.getAge() >= 60){
            double newSalary = e1.getSalary() + 500;
            e1.setSalary(newSalary);
        }

        System.out.println("Gehaltsprüfung für "+e1.getName()+": "+e1.getSalary());

        //Mögliche Vergleichsoperatoren: <, >, <=, >=, ==, !=
    }
}
