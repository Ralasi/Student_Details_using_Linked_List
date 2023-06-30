package _2041019076;

import java.util.*;
public class SinglyLinkedList 
{
	Node start;
	Scanner sc= new Scanner(System.in);
	void create()
	{
		Node p =new Node();
		System.out.println("INPUT THE STUDENT DETAILS AS:- NAME ROLL MARK ");
		String n =sc.next();
		int r=sc.nextInt();
		double m=sc.nextDouble();
		p.stud=new Student();
		p.stud.setStudentDetails(n, r, m);
		p.link =null;
		start =p;
		System.out.println("want more node(1/0)");
		int op =sc.nextInt();
		while(op==1)
		{
			Node q =new Node();
			String err=sc.nextLine();//TO AVOID STRING INPUT ERROR AFTER INTEGER;
			n =sc.nextLine(); r=sc.nextInt(); m=sc.nextDouble();
			q.stud=new Student();
			q.stud.setStudentDetails(n, r, m);
			q.link =null;
			p.link =q;
			p=q;
			System.out.println("want more node(1/0)");
			op =sc.nextInt();
		}
	}
	void displayLinkedList()
	{
		Node p=start;
		while(p!=null)
		{
			p.stud.displayStudent();
			System.out.println();
			p=p.link;
		}
	}
	void findTopper()
	{
		Node p=start;
		Node top=p;
		while(p!=null)
		{
			if(p.stud.mark>top.stud.mark)
			{
				top=p;
			}
			p=p.link;
		}
		top.stud.displayStudent();
	}
	void displayFailedList()
	{
		Node p=start;
		while(p!=null)
		{
			if(p.stud.mark<40)
			{
				p.stud.displayStudent();
			}
			p=p.link;
		}
	}
	void sort()
	{
		Node i,j;
		for(i=start;i.link!=null;i=i.link)
		{
			for(j=start;j.link!=null;j=j.link)
			{
				if(j.stud.mark<j.link.stud.mark)
				{
					Student temp = j.stud;
					j.stud =j.link.stud;
					j.link.stud = temp;
				}
			}
		}
		
	}

}
