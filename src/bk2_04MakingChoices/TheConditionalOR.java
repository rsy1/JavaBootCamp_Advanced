package bk2_04MakingChoices;

//Illustration
//-: Conditional OR / | and ||
//-: return true if the first expression is true or if the second expression is true.
//-: also return true if both expressions are true.
// -: with | Java first evaluates the expressions on either side of the | operator.
// -: if at least one of these expressions is true, the whole expression is true.
// -: Only one expression needs to be true...

public class TheConditionalOR {
	public static void main(String[] args) {

		int salesClass = 1;
		double salesTotal = 10000;
		double commissionRate = 0.0;

		if (salesTotal < 1000.0)
			commissionRate = 0.0;
		if (salesClass == 3)
			commissionRate = 0.0;

		if ((salesTotal < 1000.0) | (salesClass == 3))
			commissionRate = 0.0;

		if ((salesTotal < 1000.0) || (salesClass == 3))
			commissionRate = 0.0;

	}
}

/*You should use the regular OR/'|' operator only if your
program depends on some side effect of the second expression, such as work done
by a method call.*/