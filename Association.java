//Spring 25 modified ans.. all association assume 1 to 1 association

import java.util.*;

public class Association {
    public static void main(String[] args){
        Department dpt = new Department(15);
        Professor p = new Professor(345);
        
        Course c = new Course(213, 3.00);
        
        //assign (1 to 1 relationships)
        dpt.assignProfessor(p);
        p.assignCourse(c);
        
        dpt.display();
    }
}

class Department{
    private int deptid;
    private Professor prof; // Single Professor object (not ArrayList)
    
    Department(int deptid){
        this.deptid = deptid;
    }
    
    void assignProfessor(Professor p){
        this.prof = p;
    }
    
    void display(){
        System.out.println("Department id : " + deptid);
        prof.display();
    }
}

class Professor{
    private int id;
    private Course course; 
    
    Professor(int id){
        this.id = id;
    }
    
    void assignCourse(Course c){
        this.course = c;
    }
    
    void display(){
        System.out.println("Professor id : " + id);
        course.display();
        
    }
}

class Course{
    private int code;
    private double credit;
    
    Course(int code, double credit){
        this.code = code;
        this.credit = credit;
    }
    
    void display(){
        System.out.println("Course code: " + code);
        System.out.println("Course credit: " + credit);
    }
}
