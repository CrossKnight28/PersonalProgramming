import java.util.Random;

public class RandomNumbers
{
	public static void main ( String[] args )
	{
		Random rndm = new Random();

		int x = 1 + rndm.nextInt(10);

		System.out.println( "My random number is " + x );

		System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.print(1 + rndm.nextInt(5) + " " );
		System.out.print(1 + rndm.nextInt(5) + " " );
		System.out.print(1 + rndm.nextInt(5) + " " );
		System.out.print(1 + rndm.nextInt(5) + " " );
		System.out.print(1 + rndm.nextInt(5) + " " );
		System.out.print(1 + rndm.nextInt(5) + " " );
		System.out.println();

		System.out.println( "Here are some numbers from 1 to 100!" );
		System.out.print( 1 + rndm.nextInt(100) + "\t" );
		System.out.print( 1 + rndm.nextInt(100) + "\t" );
		System.out.print( 1 + rndm.nextInt(100) + "\t" );
		System.out.print( 1 + rndm.nextInt(100) + "\t" );
		System.out.print( 1 + rndm.nextInt(100) + "\t" );
		System.out.print( 1 + rndm.nextInt(100) + "\t" );
		System.out.println();

		int num1 = 1 + rndm.nextInt(10);
		int num2 = 1 + rndm.nextInt(10);

		if ( num1 == num2 )
		{
			System.out.println( "The random numbers were the same! Weird." );
		}
		if ( num1 != num2 )
		{
			System.out.println( "The random numbers were different! Not too surprising, actually." );
		}
	}
}