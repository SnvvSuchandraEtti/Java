public class Student {

    String name;
    int age;
    String college;
    String branch;
    double cgpa;

    Student() {
        System.out.println("Hey There, This is the empty constructor.");
    }

    Student(String n) {
        if (n == null || n.isEmpty()) {
            System.out.println("Name cannot be empty. Setting a default name.");
            name = "DefaultName";
        } else {
            name = n;
        }
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    Student(String n, int a, String c, String b, double cg) {
        name = n;
        age = a;
        college = c;
        branch = b;
        cgpa = cg;
    }
}

public class Example1 {
    public static void main(String[] args) {
        Student s1 = new Student(); r
        Student s2 = new Student("Suchandra");
        Student s3 = new Student("Suchandra", 19);
        Student s4 = new Student("Suchandra", 19, "Aec", "Cse", 8.3);
    }
}