import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class Student {
    String name;
    double cat, assignment, fat;
    double totalMarks;
    double gpa;
    String grade;

    public Student(String name, double cat, double assignment, double fat) {
        this.name = name;
        this.cat = cat;
        this.assignment = assignment;
        this.fat = fat;
        calculatePerformance();
    }

    otal
    public void calculatePerformance() {
        this.totalMarks = cat + assignment + fat;
        
   
        if (totalMarks >= 90) this.grade = "S";
        else if (totalMarks >= 80) this.grade = "A";
        else if (totalMarks >= 70) this.grade = "B";
        else if (totalMarks >= 60) this.grade = "C";
        else if (totalMarks >= 50) this.grade = "D";
        else this.grade = "F";

        
        this.gpa = (totalMarks / 10.0);
        if (this.gpa > 10.0) this.gpa = 10.0;
    }

    @Override
    public String toString() {
        return String.format("Name: %-10s | Total: %5.1f/100 | GPA: %3.1f | Grade: %s", 
                name, totalMarks, gpa, grade);
    }
}

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int numStudents = 5;

        System.out.println("Enter details for 5 students:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("CAT (30M): ");
            double cat = sc.nextDouble();
            System.out.print("Assignment (20M): ");
            double assignment = sc.nextDouble();
            System.out.print("FAT (50M): ");
            double fat = sc.nextDouble();

            students.add(new Student(name, cat, assignment, fat));
        }

       
        System.out.println("\n--- Performance Insights ---");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.totalMarks, s1.totalMarks);
            }
        });

        System.out.println("\n--- Top 3 Students ---");
        for (int i = 0; i < Math.min(3, students.size()); i++) {
            System.out.println((i + 1) + ". " + students.get(i).name + 
                               " - " + students.get(i).totalMarks);
        }
        
        sc.close();
    }
}
