public class test {
    public static void main(String[] args) {
        testCalculatePerformance();
        System.out.println("All tests passed!");
    }

    public static void testCalculatePerformance() {
        
        Student s1 = new Student("Alice", 28, 19, 48); 
        assert s1.totalMarks == 95.0 : "Total marks incorrect for Alice";
        assert s1.grade.equals("S") : "Grade incorrect for Alice";
        assert s1.gpa == 9.5 : "GPA incorrect for Alice";


        Student s2 = new Student("Bob", 15, 10, 20); 
        assert s2.totalMarks == 45.0 : "Total marks incorrect for Bob";
        assert s2.grade.equals("F") : "Grade incorrect for Bob";
        assert s2.gpa == 4.5 : "GPA incorrect for Bob";

        System.out.println("testCalculatePerformance passed.");
    }
}
