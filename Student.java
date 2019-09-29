
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GeoSonicDash
 */
public class Student implements Comparable<Student> {
    private String name;
    private int year;
    private int date;
    private String className;
    private String teacher;
    private String school;
    private int grade;
    Student(String getName, int getYear, int getDate, String getClassName, 
            String getTeacher, String getSchool, int getGrade) {//creates Student object 
        this.name = getName;
        this.year = getYear;
        this.date = getDate;
        this.className = getClassName;
        this.teacher = getTeacher;
        this.school = getSchool;
        this.grade = getGrade;
    }
    public String returnClassName() {//returns the class that the student is 
        return className; //taking
    }
    public int returnDate() {//returns date of student 
        return date;
    }
    public int returnGrade() {//returns student’s grade
        return grade;
    }
    public String returnName() {//returns student’s name
        return name;
    }
    public String returnSchool() {//returns student’s school
        return school;
    }
    public String returnTeacher() {//return student’s teacher 
        return teacher;
    }
    public int returnYear() {//return student’s year
        return year;
    }
    public static Comparator<Student> studentDateComparator = new Comparator<Student>() {
	    //Compares Student objects based on Student's date
	    public int compare(Student student1, Student student2) {	    	
	      String date1 = String.valueOf(student1.returnDate());
	      String date2 = String.valueOf(student2.returnDate());	      
	     return date1.compareTo(date2);
            }
    };
    public static Comparator<Student> studentClassNameComparator = new Comparator<Student>() {
	    //Compares Student objects based on Student's name
	    public int compare(Student student1, Student student2) {	    	
	      String className = student1.returnClassName();
	      String className2 = student2.returnClassName();	      
	      //ascending order
	     return className.compareTo(className2);
            }
    };
    public static Comparator<Student> studentYearComparator = new Comparator<Student>() {
	    //Compares Student objects based on Student's year
	    public int compare(Student student1, Student student2) {	    	
	      String year1 = String.valueOf(student1.returnYear());
	      String year2 = String.valueOf(student2.returnYear());	      
	      //ascending order
	     return year1.compareTo(year2);
            }
    };

    @Override
    public int compareTo(Student o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
