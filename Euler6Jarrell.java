// Problem #6
/*The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

import java.util.*;
public class Euler6Jarrell
{
	public static void main(String[] args)
	{
		int sumOfSquares = 0;
		for (int i = 1; i < 101; i++)
		{
			sumOfSquares+= i * i; 
		}
		int squareOfSum = 0;
		for (int i = 1; i < 101; i++)
		{
			squareOfSum+= i;
		}
		squareOfSum*=squareOfSum;
		System.out.print(squareOfSum - sumOfSquares);
	}
}