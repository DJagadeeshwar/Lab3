/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.system1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author S545702
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Teacher lizzy = new Teacher (1, "lizzy",500); 
     Teacher melliza = new Teacher(2, "melliza", 700);
     Teacher mf = new Teacher (3, "mf",1000);
     
     List<Teacher> teacherList = new ArrayList<>();
     teacherList.add(lizzy);
     teacherList.add(melliza);
     teacherList.add(mf);
     
     
     
     Student tamasha = new Student(1,"thamasha", 3);
     Student Rakshit = new Student(2, "Rakshit", 4);
     Student Jagadeesh = new Student(3, "jagadeesh", 6);
     
     List<Student> StudentList = new ArrayList<>();
     StudentList.add(tamasha);
     StudentList.add(Rakshit);
     StudentList.add(Jagadeesh);
     
     
     
     
     School Mhs = new School(teacherList, StudentList);
        System.out.println("mhs has earned" + Mhs.getTotalmoneyearned());
        
        tamasha.feepaid(500);
     
     
     
    }
    
}
