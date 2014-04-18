package ce1002.a8.s102502044;

import java.util.*;

class Student {

    int grade;

    //讀入grade
    Student() {
        grade = get_grade(); 
    }

    //產生8個Student，並放進ArrayList
    static List<Student> new_many(int size) {
        List<Student> students = new ArrayList<Student>(size);

        System.out.println("Input grades:");
        for(int i=0 ; i<size ; i++) {
            Student student = new Student();
            students.add(student);
        }
        return students;
    }

    //讀入grade
    static int get_grade() {
        Scanner scanner = new Scanner(System.in);
        String input;

        input = scanner.nextLine();
        while(!input.matches("^100|([1-9])?\\d")) {
            System.out.println("Out of range!");
            input = scanner.next();
        }
        return Integer.parseInt(input);
    }
}
