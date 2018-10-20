import java.util.Random;
public class cocktail_sort 
{
    public static int N = 20;
    public static int[] sequence = new int[N];
    public static int[] cocktailSort(int[] a, int n) 
    {
        for(int i = 0;i<n-1;i++)
        {
        	for(int j = 0;j<n-i-1;j++)
        	{
        		if(a[j]>a[j+1])
        		{
        			int temp = a[j+1];
        			a[j+1] = a[j];
        			a[j] = temp;
        		}
        	}
        	
        	for(int j = n-(i+2);j>0;j--)
        	{
        		if(a[j]<a[j-1])
        		{
        			int temp = a[j];
        			a[j] = a[j-1];
        			a[j-1] = temp;
        		}
        	}
	}
        return a;
    }

    public static void printSequence(int[] sorted_sequence) 
    {
        for (int i = 0; i < sorted_sequence.length; i++)
            System.out.print(sorted_sequence[i] + " ");
        System.out.println();
    }

 
    public static void main(String[] args) 
    {
        Random random = new Random();
        System.out.println("Sorting of randomly generated numbers using COCKTAIL SORT");
	for (int i = 0; i < N; i++)
		sequence[i] = Math.abs(random.nextInt(1000));
		System.out.println("\nOriginal Sequence: ");
		printSequence(sequence);
		System.out.println("\nSorted Sequence: ");
		printSequence(cocktailSort(sequence, sequence.length));
    }

}
