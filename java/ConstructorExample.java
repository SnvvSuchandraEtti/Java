public class ConstructorExample {

    String name;
    int age;
    String college;
    String branch;
    double cgpa;

    // Empty constructor
    ConstructorExample() {
        // No message to the console
    }

    // Constructor with name parameter
    ConstructorExample(String n) {
        if (n == null || n.isEmpty()) {
            System.out.println("Name cannot be empty. Setting a default name.");
            name = "DefaultName";
        } else {
            name = n;
        }
    }

    // Constructor with name and age parameters
    ConstructorExample(String n, int a) {
        this(n); // Call the constructor with name parameter
        age = a;
    }

    // Constructor with all parameters
    ConstructorExample(String n, int a, String c, String b, double cg) {
        this(n, a); // Call the constructor with name and age parameters
        college = c;
        branch = b;
        cgpa = cg;
    }
}

public class Example1 {
    public static void main(String[] args) {
        ConstructorExample s1 = new ConstructorExample(); // Using empty constructor
        ConstructorExample s2 = new ConstructorExample("Suchandra");
        ConstructorExample s3 = new ConstructorExample("Suchandra", 19);
        ConstructorExample s4 = new ConstructorExample("Suchandra", 19, "Aec", "Cse", 8.3);
    }
}
