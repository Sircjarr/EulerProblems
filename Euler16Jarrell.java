/*Power digit sum
PROBLEM 16

215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
*/
import java.util.*;
import java.math.*;
public class Euler16Jarrell
{
	public static void main(String[] args)
	{
		BigInteger num = new BigInteger("2");
		num = num.pow(1000);
		String numString = num.toString();
		String[] numArray = numString.split("");
		long sum = 0;
		for (int i = 0; i < numArray.length; i++)
		{
			sum += Integer.parseInt(numArray[i]);
		}
		System.out.print(sum); 
	}
}
