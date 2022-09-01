package bk2_04MakingChoices;

//Illustartion: Conditional And/&, && operator
//-:first operation is called an And (&) operation
//-:The && operator is similar to the & operator
//-: difference (& - compares both, while && evaluates first and sops if result is false)
//-: && recommended

public class TheConditionalAND {

	public static void main(String[] args) {
		
		int salesClass = 1;
		double salesTotal = 10000;
		double commissionRate = 0.0;
		 
		
		if ((salesClass == 1) & (salesTotal >= 10000.0))
			commissionRate = 0.025;
		
		if ((salesClass == 1) && (salesTotal >= 10000.0))
			commissionRate = 0.025;
	}
	
}
/*You should use the regular AND/'&' operator only if your
program depends on some side effect of the second expression, such as work done
by a method call.*/