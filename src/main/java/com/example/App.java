import java.util.*;

record Student(String name, double total) {
    String grade() {
        if (total >= 90) return "S";
        if (total >= 80) return "A";
        return "B"; // Simplified for brevity
    }
}

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Name and Total Marks: ");
            students.add(new Student(sc.next(), sc.nextDouble()));
        }

        System.out.println("\n--- Results ---");
        students.stream()
            .sorted((s1, s2) -> Double.compare(s2.total(), s1.total()))
            .forEach(s -> System.out.println(s.name() + ": " + s.total() + " [" + s.grade() + "]"));
        
        sc.close();
    }
}
