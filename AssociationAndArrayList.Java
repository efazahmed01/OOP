import java.util.*;

public class Association {
    public static void main(String[] args){
        Department dpt = new Department(15);
        Professor p = new Professor(345);
        Professor p1 = new Professor(755);
        
        Course c = new Course(213, 3.00);
        Course c1 = new Course(214, 3.00);
        Course c2 = new Course(215, 1.50);
        
        Course c3 = new Course(500, 8.00);
        Course c4 = new Course(501, 5.00);
        Course c5 = new Course(502, 4.50);
        
        //assign
        dpt.assignProfessor(p);
        dpt.assignProfessor(p1);
        p.assignCourse(c);
        p.assignCourse(c1);
        p.assignCourse(c2);
        
        p1.assignCourse(c3);
        p1.assignCourse(c4);
        p1.assignCourse(c5);
        
        dpt.display();
    }
}

class Department{
    private int deptid;
    private ArrayList<Professor> prof = new ArrayList<>();
    
    Department(int deptid){
        this.deptid = deptid;
    }
    
    void assignProfessor(Professor p){
        prof.add(p);
    }
    
    void display(){
        System.out.println("Department id : " + deptid);
        System.out.println("No of Professors : " + prof.size());
        for(Professor p : prof){
            p.display();
        }
    }
}

class Professor{
    private int id;
    private ArrayList<Course> course = new ArrayList<>();
    
    Professor(int id){
        this.id = id;
    }
    
    void assignCourse(Course c){
        course.add(c);
    }
    
    void display(){
        System.out.println("Professor id : " + id);
        System.out.println("No of Course : " + course.size());
        for(Course c : course){
            c.display();
        }
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
