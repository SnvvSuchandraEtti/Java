class Person{
 String name;
 int age;
 String gender;
 Person(){}
 Person(String name, int age, String gender){ 
    this.name = name;
    this.age = age;
    this.gender = gender;  
 }
 void showDetails(){
    System.out.println(name + " " + age " " + gender);
 }
}
class Student extends Person{
    String StudentID;
    String Branch;
    String College;
    Student(){}
    Student(String name , int age, String gender, String StudentID, String Branch, String College){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.StudentID = StudentID;
        this.Branch = Branch;
        this.College = College;
    }
    }
public class INheritanceExample1{
    Person p1 = new Person();
    Student  s1 = new Student ();
    }