package school.management.system;

/**
 * This class is responsible for keeping data of the teacher of their Id,name & salaries.
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * It creates new teacher object.
     * @param id id of the teachers.
     * @param name name of the teachers.
     * @param salary salary of the teachers.
     */
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;

    }

    /**
     *
     * @return the id of the teacher.
     */
    public int getId(){

        return this.id;
    }

    /**
     *
     * @return the name of the teacher.
     */
    public String getName(){

        return this.name;
    }

    /**
     *
     * @return the salary of the teacher.
     */
    public int getSalary(){

        return this.salary;
    }

    /**
     * It updates salary of the teacher.
     * @param salary the salary of the teacher is going to receive.
     */
    public void setSalary(int salary){

        this.salary=salary;
    }

    /**
     * It adds the salaryEarned.
     * Decreases the money from total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpend(salary);

    }

    @Override
    public String toString() {
        return "Teacher's name:"+name+
                " has received salary so far $" + salaryEarned;
    }
}