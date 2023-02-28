package school.management.system;

/**
 * This class is responsible for the keeping data of the students such as id,name grade,fees & fees paid.
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing.
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     * @param id id for the student.It must be unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */
    public Student(int id,String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name= name;
        this.grade = grade;


    }

    /**
     * Used to update student's grade.
     * @param grade new grade of the student.
     */

    public void setGrade(int grade){
        this.grade=grade;

    }

    /**
     * Add the fees to the feesPaid field.
     * the school going to receive a payment from the student.
     * @param fees the fees that student pays.
     */
    public  void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return  id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return fees total of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees(){
       return feesTotal-=feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name:"+name+
                " Total fees paid so far $"+feesPaid;
    }
}