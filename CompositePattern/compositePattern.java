package CompositePattern;

import java.util.ArrayList;
import java.util.List;

class Employee{
	String name;
	String dept;
	List<Employee> subordinates;
	
	public Employee(String name,String dept) {
		// TODO Auto-generated constructor stub
		this.name = name;;
		this.dept = dept;
		subordinates= new ArrayList<Employee>();
	}
	void add(Employee e){
		subordinates.add(e);
	}
	void remove(Employee e){
		subordinates.remove(e);
	}
	
	List<Employee>  getSubordinates(){
		return subordinates;
	}
	 public String toString(){
	      return ("Employee :[ Name : " + name + ", dept : " + dept + " ]");
	   }   
}

public class compositePattern {
public static void main(String[] args) {
    Employee CEO = new Employee("Mike", "Head");
    Employee headSales = new Employee("jatin", "vohara");
    Employee headMarketing = new Employee("llina","gallegos");
    Employee clerk = new Employee("reva", "fuckadia");
    Employee peon = new Employee("jignesh", "chodwadia");
    
    CEO.add(headMarketing);
    CEO.add(headSales);
    
    headMarketing.add(clerk);
    headSales.add(peon);
    
    System.out.println(CEO);
    
    for (Employee headEmployee : CEO.getSubordinates()) {
        System.out.println(headEmployee.name);
        
       // for (Employee employee : headEmployee.getSubordinates()) {
         //  System.out.println(employee);
       // }
     }	
    
}
}
