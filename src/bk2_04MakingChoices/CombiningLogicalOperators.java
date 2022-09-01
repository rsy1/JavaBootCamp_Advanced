package bk2_04MakingChoices;

public class CombiningLogicalOperators {

	public static void main(String[] args) {

		int salesClass = 1;
		double salesTotal = 10000;
		double commissionRate = 0.0;

		if ((salesTotal < 1000.0) || ((salesTotal < 5000.0) && (salesClass == 1))
				|| ((salesTotal < 10000.0) && (salesClass == 2)))

			commissionRate = 0.0;

		// Better indendation & brackets than above..............................
		if ((salesTotal < 1000.0) || ((salesTotal < 5000.0) && (salesClass == 1))
				|| ((salesTotal < 10000.0) && (salesClass == 2)))
			commissionRate = 0.0;

		//Rather code seperate if statements for simplicity
		if (salesTotal < 1000.0)
			commissionRate = 0.0;
		if ((salesTotal < 5000.0) && (salesClass == 1))
			commissionRate = 0.0;
		if ((salesTotal < 10000.0) && (salesClass == 2))
			commissionRate = 0.0;
	}
}

/*
 * »»The sales total is less than $1,000. »»The sales total is less than $5,000,
 * and the sales class is 1. »»The sales total is less than $10,000, and the
 * sales class is 2.
 */
