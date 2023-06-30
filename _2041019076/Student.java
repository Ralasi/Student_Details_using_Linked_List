package _2041019076;

public class Student 
{
	String name;
    int roll;
    double mark;
    void setStudentDetails(String name,int roll,double mark)
    {
        this.name=name;
        this.roll=roll;
        this.mark=mark;
    }
    void displayStudent()
    {
        System.out.println("Name : "+name+"| Roll : "+roll+"| Mark : "+mark);
    }

}
