package java11;

import java.util.HashSet;
import java.util.Set;

public class EqualTest
{
	public static void main(String[] args)
	{
		Q5HE e1 = new Q5HE();
		Q5HE e2 = new Q5HE();

		e1.setId(100);
		e2.setId(100);

		//Prints 'true'
		System.out.println(e1.equals(e2));

		Set<Q5HE> employees = new HashSet<Q5HE>();
		employees.add(e1);
		employees.add(e2);

		System.out.println(employees);	//Prints two objects
	}
}