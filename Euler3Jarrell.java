/*
PROBLEM 3
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/
import java.util.*; 
public class Euler3Jarrell
{
	public static void main(String[] args)
	{
		long x = 600851475143L;
		for (long i = 1; i < x; i++)
		{
			if (x % i == 0)
			{
				x /= i;
			}
		}
		System.out.print(x);
	}
}
