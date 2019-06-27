package First;

import java.util.Iterator;
import java.util.TreeSet;

public class Student implements Comparable<Student>
{
	int rlno;
	String name;
	
	public int getRlno() {
		return rlno;
	}
	public void setRlno(int rlno) {
		this.rlno = rlno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int rlno, String name) {
		super();
		this.rlno = rlno;
		this.name = name;
	}
	public Student() 
	{
		this.rlno = 0;
		this.name = " ";
	}
	@Override
	public String toString() {
		return "Student [rlno=" + rlno + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student s) 
	{
		if(this.rlno>s.rlno)
		{
			return 1;
		}
		else if(this.rlno<s.rlno)
		{
			return -1;
		}
		else
		{
		  return 0;
		}
	}
	
}
