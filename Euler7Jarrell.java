// Problem #10
/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

import java.util.*;
public class Euler7Jarrell
{
	public static void main(String[] args)
	{
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		for (int potentialPrime = 2; true; potentialPrime++)
		{
			for (int i = 2; i<potentialPrime+1; i++)
			{
				if (potentialPrime==i)
				{
					primeNumbers.add(potentialPrime);
					break;
				}
				else if (potentialPrime%i != 0)
				{
					continue;
				}
				else
				{
					break;
				}
			}
			if (primeNumbers.size()==10001)
			{
				break;
			}
		}
		System.out.print(primeNumbers.get(10000));
	}
}