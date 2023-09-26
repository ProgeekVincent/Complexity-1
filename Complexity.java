
// student no : 3931188
// Surname : Nkosi


import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;

public class Complexity
{
	// algorithm1 method
	public static void algorithm1(int[] arr)
	{
		boolean found = false;
		int sizeArr = arr.length;
		for (int i=0; i < sizeArr; i++)
		{
			for (int j = i + 1; j < sizeArr; j++ )
			{
				if ((arr[i] + arr[j]) == 0 )
				{
					System.out.println(arr[i] + " and "+arr[j]+" are in the array.");
					continue;
				}
			}
		}
	}

	// algorithm2 method
	public static void algorithm2(int[] arr)
	{
		Set<Integer> visited = new HashSet<>();
		int i = 0; // index of first element in array
		int j = arr.length - 1; // index of the last element
		while ( i != j)
		{
			if ((arr[i] + arr[j]) == 0 && !visited.contains(arr[i]) && !visited.contains(arr[j]))
			{
				System.out.println(arr[i] + " and "+ arr[j] + " are in the array.");
				visited.add(arr[i]);
				visited.add(arr[j]);
			}else if ((arr[i] + arr[j]) > 0)
				j = j - 1;
			else
				i = i + 1;
		}
	}

	public static void main(String[] args)
	{
		
		try{
			File input1 = new File("Input1.txt");

			File input2 = new File("Input2.txt");

			Scanner scanner1 = new Scanner(input1);

			Scanner scanner2 = new Scanner(input2);

			// searching for lines in a first file "input.txt"

			while (scanner1.hasNextLine())
			{
				String line = scanner1.nextLine();

				String strArr[] = line.split(","); // split the contents of each line with a ","
				
				int intArr[] = new int[strArr.length]; // an array of integers with the size of string array above

				for (int i=0 ; i < strArr.length; i++)
				{
					intArr[i] = Integer.parseInt(strArr[i]);
				}

				System.out.println("\n\nSearch of input1.txt file.");

				System.out.println("\nalgorithm1 search.\n");

				final long start1Nano = System.nanoTime(); //start time in nano seconds

				final long start1Sec = System.currentTimeMillis(); // start time in milli seconds

				algorithm1(intArr);

				final long end1Nano = System.nanoTime(); // end time in nano seconds

				final long end1Sec = System.currentTimeMillis(); // start time in nano seconds

				System.out.println("\nDuration of algorithm 1 : \n"+(end1Nano - start1Nano)+" nanoseconds.\n"+ (end1Sec - start1Sec) + " MilliSeconds");

				System.out.println("\nalgorithm2 search.\n");

				final long start2Nano = System.nanoTime();

				final long start2Sec = System.currentTimeMillis();

				algorithm2(intArr);

				final long end2Nano = System.nanoTime();

				final long end2Sec = System.currentTimeMillis();

				System.out.println("\nDuration of algorithm 2 : \n"+(end2Nano - start2Nano)+" nanoseconds.\n"+ (end2Sec - start2Sec) + " MilliSeconds");
				boolean isFast = (start1Nano - end1Nano) > (start2Nano - end2Nano);



			}
			// seaching for lines in a second file "input2.txt"

			while (scanner2.hasNextLine())
			{
				String strArr[] = scanner2.nextLine().split(",");

				int intArr[] = new int[strArr.length];

				for (int i=0; i < strArr.length; i++)

					intArr[i] = Integer.parseInt(strArr[i]);

				System.out.println("\n\nSearch of Input2.txt file");

				System.out.println("\nalgorithm1 search.\n");

				final long n1 = System.nanoTime(); // start time in nanoseconds
				final long s1 = System.currentTimeMillis(); // end time in milliseconds


				algorithm1(intArr);

				final long n2 = System.nanoTime(); // end time in nanaseconds
				final long s2 = System.currentTimeMillis(); // end time in milliseconds

				System.out.println("\nDuration of algorithm 1 : \n: "+(n2 - n1)+" nanoseconds.\n" + (s2 - s1) + " MilliSeconds");
				
				System.out.println("\nalgorithm2 search.\n");

				final long nn1 = System.nanoTime(); // start time in nanoseconds
				final long ss1 = System.currentTimeMillis(); // end time in milliseconds

				algorithm2(intArr);

				final long nn2 = System.nanoTime(); // end time in nanaseconds
				final long ss2 = System.currentTimeMillis(); // end time in milliseconds

				System.out.println("\nDuration of algorithm 2 : \n"+(nn2 - nn1)+" nanoseconds.\n" + (ss2 - ss1) + " MilliSeconds");
			}

		}catch (FileNotFoundException e)
		{
			System.out.println("File is not found!");
		}

	}
}