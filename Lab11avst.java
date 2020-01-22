// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab11avst
{
	public static void main(String[] args)
	{
		// This main method needs additions for the 100 point version.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter desired limit for primes:");
		final int MAX = input.nextInt();
		boolean primes[] = new boolean[MAX];
		for (int q = 1;q<primes.length;q++){
			primes[q]=true;
		}
		computePrimes(primes);
		displayPrimes(primes);
	}
	public static void computePrimes(boolean primes[])
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");
		for (int x=2;x<primes.length;x++){//do this process for each item in the list..
			for (int b=(x+1);b<primes.length;b++){//multiplication checker
				if (primes[b]==true){
					int j = b%x;
					if (j==0){
						primes[b]=false;
					}
				}
			}
		}

	}

	public static void displayPrimes(boolean primes[])
	{
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		System.out.println();
		DecimalFormat imsorryiwasabsent = new DecimalFormat("0000");
		for (int c=2;c<primes.length;c++){//haha get it cuz c++ is a type of language
			if (primes[c]==true){
				System.out.print(imsorryiwasabsent.format(c)+" ");
			}
		}
	}
}
