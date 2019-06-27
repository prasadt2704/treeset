package First;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo
{
	public int delete(TreeSet<Student> std2,int rlno)
	{
		for(Student s:std2)
		{
			if(s.getRlno()==rlno)
			{
				std2.remove(s);
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Demo dm = new Demo();
		int ch = 0;
		TreeSet<Student> set = new TreeSet<Student>();
		
		do
		{
		   Student std1= new Student();	
		   System.out.println("\n\nEnter the roll no");	
		   std1.setRlno(sc.nextInt());
		   System.out.println("\nenter the name of student");
		   std1.setName(sc.next());
		   set.add(std1);
		   System.out.println("\nDo you want to add more?(Yes:1/No:0)");
		   ch =sc.nextInt();
		}while(ch!=0);
        System.out.println("\n\nThe list of students is");
        Iterator itr= set.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next().toString());
        }
		System.out.println("\nEnter the roll no you want to delete");
		int delrl =sc.nextInt();
		int delresult= dm.delete(set, delrl);
		if(delresult==1)
		{
			Iterator itr1= set.iterator();
			System.out.println("\nThe record removed successfully ");
			while(itr1.hasNext())
	        {
	        	System.out.println(itr1.next().toString());
	        }
		}
		else
		{
			System.out.println("\nThe record is not present");
		}
		
	}

}
