package DSA_Interview_Questions.Strings;

public class Patterns 
{
	public static void main(String[] args) 
	{
		// Pattern 1, Pattern 2, Pattern 3 -> left triangle
		pattern1(5); // star pattern
		pattern2(5); // number pattern
		pattern3(5); // character pattern
		
		// Pattern 4.1 -> right triangle 
		pattern4(5);
		
		// Pattern 5.1 -> middle triangle 1
		pattern5_1(5);
		
		// Pattern 5.2 -> Middle triangle 2
		pattern5_2(5);
		
		// Pattern 6 -> down left triangle
		pattern6(5);
		
		// Pattern 7 -> down right triangle
		pattern7(5);
		
		// Pattern 8.1 -> down middle triangle
		pattern8_1(5);
		
		// Pattern 8.2 -> down middle triangle
		pattern8_2(5);
		
		// Pattern 9 -> empty triangle
		pattern9(5);
		
		// Pattern 10 -> diamond
		pattern10(5);
	}
	
	static void pattern1(int n)
	{
		System.out.println("\nPattern 1");
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n)
	{
		System.out.println("\nPattern 2");
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	static void pattern3(int n)
	{
		System.out.println("\nPattern 3");
		for(int i = 1; i <= n; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print((char)(j+65) + " ");
			}
			System.out.println();
		}
	}
	
	static void pattern4(int n)
	{
		System.out.println("\nPattern 4");
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n - i; j++)
			{
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern5_1(int n)
	{
		System.out.println("\nPattern 5.1");
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern5_2(int n)
	{
		System.out.println("\nPattern 5.2");
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i - 1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern6(int n)
	{
		System.out.println("\nPattern 6");
		for(int i = n; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern7(int n)
	{
		System.out.println("\nPattern 7");
		for(int i = n; i >= 1; i--)
		{
			for(int j = 1; j <= n - i; j++)
			{
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern8_1(int n)
	{
		System.out.println("\nPattern 8.1");
		for(int i = n; i >= 1; i--)
		{
			for(int j = n; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern8_2(int n)
	{
		System.out.println("\nPattern 8.2");
		for(int i = n; i >= 1; i--)
		{
			for(int j = n; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i - 1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern9(int n)
	{
		System.out.println("\nPattern 9");
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(j == 1 || j == i || i == n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	static void pattern10(int n)
	{
		System.out.println("\nPattern 10");
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i - 1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = n - 1; i >= 1; i--)
		{
			for(int j = n; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i - 1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
}
