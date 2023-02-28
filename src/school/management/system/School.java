package school.management.system;

import java.util.List;

/**
 * Here is for the many students and many teachers.
 * Implement teachers and students using an Arraylist.
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpend;

    /**
     * new school object is created.
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpend=0;
    }

    /**
     *
     * @return list of teacher in the school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * It adds a teacher.
     * @param teacher the teacher will be added.
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of  student in the school.
     */
    public List<Student> getStudents() {

        return students;
    }

    /**
     * It adds a student to the school.
     * @param student the student will be added.
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school.
     */
    public int getTotalMoneyEarned() {

        return totalMoneyEarned;
    }

    /**
     * It adds the total money earned by the school.
     * @param moneyEarned money which is supposed to be added.
     */
    public  static void updateTotalMoneyEarned(int moneyEarned) {

        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return total money spend by the school.
     */

    public int getTotalMoneySpend() {

        return totalMoneySpend;
    }

    /**
     * It updates total money spend by the school.
     * @param moneySpent money which is supposed to be spend.
     */

    public static void updateTotalMoneySpend(int moneySpent) {

        totalMoneyEarned-=moneySpent;
    }
}
