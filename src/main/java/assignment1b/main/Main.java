/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1b.main;


import com.mycompany.assignment1.*;
import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author markc
 */
public class Main {
   public static void main(String[] args)
    {
        DateTime dt = new DateTime();
        
        //add students    
        ArrayList<Student> stds = new ArrayList<Student>();
        
        Student std1 = new Student("John","19",dt);
        stds.add(std1);
        Student std2 = new Student("Mary","21",dt);
        stds.add(std2);
        Student std3 = new Student("David","18",dt);
        stds.add(std3);
        Student std4 = new Student("Helen","21",dt);
        stds.add(std4);
        Student std5 = new Student("Chris","19",dt);
        stds.add(std5);
        Student std6 = new Student("Sarah","19",dt);
        stds.add(std6);
        Student std7 = new Student("Joe","18",dt);
        stds.add(std7);
        
        //add modules
        ArrayList<Module> mod = new ArrayList<Module>();
        
        Module CT111 = new Module("Programming","CT111");
        CT111.StudentReg(std1);
        CT111.StudentReg(std4);
        CT111.StudentReg(std5);
        mod.add(CT111);
        
        Module CT222 = new Module("Database","CT222");
        CT222.StudentReg(std2);
        CT222.StudentReg(std4);
        CT222.StudentReg(std6);
        mod.add(CT222);
        
        Module CT354 = new Module("Professional Skills","CT354");
        CT354.StudentReg(std3);
        CT354.StudentReg(std4);
        CT354.StudentReg(std7);
        CT354.StudentReg(std1);
        mod.add(CT354);
       
        //add course
        Course BCT = new Course("Computer Science and IT", new DateTime(), new DateTime());
        BCT.setModules(mod);
        // Print our everything
        System.out.println(BCT);
    }
}
