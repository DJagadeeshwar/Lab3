/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.system1;

import java.util.List;

/**
 *
 * @author S545702
 */
//have many teaches, students
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalmoneyearned;
    private int totalmoneyspent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalmoneyearned = 0;
        totalmoneyspent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getTotalmoneyearned() {
        return totalmoneyearned;
    }

    public int getTotalmoneyspent() {
        return totalmoneyspent;
    }

    public void addTeacher(Teacher teacher) {
       teachers.add(teacher);
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public void updateTotalmoneyearned(int totalmoneyearned) {
        totalmoneyearned += totalmoneyearned;
    }

    public void updateTotalmoneyspent(int moneyspent) {
        totalmoneyearned = totalmoneyearned - moneyspent;
        totalmoneyearned -= moneyspent;
    }
    
    
 
}
