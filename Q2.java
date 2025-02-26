class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    private String Dept;

    public Employee(String name, int age, String Dept) {
        super(name, age);
        this.Dept = Dept;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String Dept) {
        this.Dept = Dept;
    }

    public void displayEmployee() {
        display();
        System.out.println("Job Title: " + Dept);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, String Dept, int teamSize) {
        super(name, age, Dept);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void displayManager() {
        displayEmployee(); // Calls parent class method
        System.out.println("Team Size: " + teamSize);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 35, "Project Manager", 10);
        manager.displayManager();
    }
}
