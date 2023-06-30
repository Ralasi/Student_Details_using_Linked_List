package _2041019076;

public class StudentMain 
{
	public static void main(String[] args)
	{
		SinglyLinkedList s1= new SinglyLinkedList();
		s1.create();
		System.out.println("THE STUDENT LIST :-");
		s1.displayLinkedList();
		System.out.println();
		System.out.println("THE TOPPER OF LIST:-");
		s1.findTopper();
		System.out.println();
		System.out.println("THE FAILED STUDENT LIST:-");
		s1.displayFailedList();
		System.out.println();
		System.out.println("THE SORTED LIST:-");
		s1.sort();
		s1.displayLinkedList();
	}

}
