package prac6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getKolvo_ballov() - o2.getKolvo_ballov();
    }
}
