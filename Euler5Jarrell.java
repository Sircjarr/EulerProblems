// Problem #5
/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

import java.util.*;
public class Euler5Jarrell
{
	public static void main(String[] args)
	{
		int answer = 0;
		outer:
		for (int i = 1; true; i++)
		{
			for (int x = 1; x<21; x++)
			{
				if (i%x==0)
				{
					answer=i;
				}
				else
				{
					break;
				}
				if (x == 20)
				{
					break outer; 
				}
			}
		}
		System.out.print(answer);
	}
}