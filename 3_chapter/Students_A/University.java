import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    // Добавление студента
    public void addStudent(Student student) {
        students.add(student);
    }

    // a) Список студентов заданного факультета
    public List<Student> getStudentsByFaculty(String faculty) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getFaculty().equals(faculty)) {
                result.add(s);
            }
        }
        return result;
    }

    // b) Списки студентов по факультету и курсу
    public void printStudentsByFacultyAndCourse() {
        // Реализация группировки (можно использовать HashMap)
    }

    // c) Список студентов, родившихся после заданного года
    public List<Student> getStudentsBornAfterYear(int year) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getBirthDate().getYear() + 1900 > year) { // Год в Date считается с 1900
                result.add(s);
            }
        }
        return result;
    }

    // d) Список учебной группы
    public List<Student> getStudentsByGroup(String group) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getGroup().equals(group)) {
                result.add(s);
            }
        }
        return result;
    }
}
