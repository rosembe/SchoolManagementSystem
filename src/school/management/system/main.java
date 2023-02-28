package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Teacher mustafa = new Teacher(1,"Mustafa",500);
        Teacher sarp = new Teacher(2,"Sarp",700);
        Teacher ahmet = new Teacher(3,"Ahmet",600);

        List<Teacher> teacherList= new ArrayList<>();
        teacherList.add(mustafa);
        teacherList.add(sarp);
        teacherList.add(ahmet);


        Student semih = new Student(1,"Semih",8);
        Student emir = new Student(2,"Emir",6);
        Student yusuf = new  Student(3,"Yusuf",0);

        List<Student> studentList= new ArrayList<>();
        studentList.add(semih);
        studentList.add(emir);
        studentList.add(yusuf);

        School riviera = new School(teacherList,studentList);

        Teacher anıl = new Teacher(4,"Anıl",800);
        riviera.addTeachers(anıl);


        yusuf.payFees(3000);
        System.out.println("Riviera has  earned $"+ riviera.getTotalMoneyEarned());
        emir.payFees(5000);
        System.out.println("Riviera has  earned $"+ riviera.getTotalMoneyEarned());

        System.out.println("-------Making Riviera Pay Salary-------");
        sarp.receiveSalary(sarp.getSalary());
        System.out.println("Riviera spent the money for salary to "+ sarp.getName() +" and now has $"+riviera.getTotalMoneyEarned());
        mustafa.receiveSalary((mustafa.getSalary()));
        System.out.println("Riviera spent the money for salary to "+ mustafa.getName() + " and now has $"+riviera.getTotalMoneyEarned() );

        System.out.println(emir);
        System.out.println(sarp);
    }
}
