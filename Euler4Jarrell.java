// Problem #4
/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

import java.util.*;
public class Euler4Jarrell
{
	public static void main(String[] args)
	{
		int[] firstNumber = new int[999];
		int[] secondNumber = new int[999];
		int count = 1;
		for (int i = 0; i < 999; i++)
		{
			firstNumber[i]= count;
			count++;
		}
		count = 1;
		for (int i = 0; i < 999; i++)
		{
			secondNumber[i]= count;
			count++;
		}
		ArrayList<Integer> palindromes = new ArrayList<Integer>(); 
		int product = 0;
		for (int i = 0; i<firstNumber.length; i++)
		{
			for (int x = 0; x<secondNumber.length; x++)
			{
				product= firstNumber[i] * secondNumber[x];
				if (checkIfPalindrome(product))
				{
					palindromes.add(product);
				}
				else
				{
					continue; 
				}
			}
		}
		int max = 0;
		for (int i = 0; i < palindromes.size()-1; i++)
		{
			if (palindromes.get(i) > max)
			{
				max = palindromes.get(i); 
			}
		}
		System.out.print(max); 
	}
	public static boolean checkIfPalindrome(int r)
	{
		String pal = Integer.toString(r);
		String rev = "";
		for (int i = 0; i<pal.length(); i++)
		{
			rev = pal.charAt(i) + rev;
		}
		if (pal.equals(rev))
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
}