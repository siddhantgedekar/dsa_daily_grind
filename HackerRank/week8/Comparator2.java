import java.util.*;

/**
 * Sorts students by CGPA descending, then name ascending, then id descending.
 * Input format:
 * - first line: integer n
 * - next n lines: id name cgpa
 * Output format:
 * - each student on its own line: id name cgpa
 */
class Student {
    int id;
    String name;
    float cgpa;

    Student(int id, String name, float cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class Comparator2 {

    static class Checker implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            if (Float.compare(a.cgpa, b.cgpa) != 0) {
                return Float.compare(b.cgpa, a.cgpa);
            } else if (a.name.compareTo(b.name) == 0) {
                return Integer.compare(b.id, a.id);
            } else {
                return a.name.compareTo(b.name);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];

        for(int i=0; i<n; i++) {
            String inp = sc.nextLine().trim();
            String[] parts = inp.split("\\s+");
            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            float cgpa = Float.parseFloat(parts[2]);
            students[i] = new Student(id, name, cgpa);
        }
        sc.close();

        Arrays.sort(students, new Checker());

        for(Student s : students) {
            System.out.println(s.id + " " + s.name + " " + s.cgpa);
        }
    }
}
