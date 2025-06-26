public class Main {
    public static void main(String[] args) {
        University university = new University();
        university.addStudent(new Student(1, "Иванов", "Иван", "ИИС", 2, "ИИС-202"));
        
        // a) Список студентов факультета "ИИС"
        System.out.println(university.getStudentsByFaculty("ИИС"));

        // d) Список группы "ИИС-202"
        System.out.println(university.getStudentsByGroup("ИИС-202"));
    }
}
