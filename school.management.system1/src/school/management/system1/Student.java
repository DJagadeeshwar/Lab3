/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.system1;

/**
 *
 * @author S545702
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feepaid;
    private int feetotal;
    
public Student(int student, String name, int grade){
    this.id = id;
    this.name = name;
    this.grade = grade;
    this.feepaid = 0;
    this.feetotal = 30000;
}
 public void setGrade(int grade){
     this.grade = grade;
 }
 //feethat student pays
 public void feepaid(int fee){
     feepaid+=fee;
 }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeepaid() {
        return feepaid;
    }

    public int getFeetotal() {
        return feetotal;
    }
    public int getReamainingfees(){
        return feetotal - feepaid;
    }

    
}
