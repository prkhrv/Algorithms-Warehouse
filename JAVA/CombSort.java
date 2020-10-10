
package combsort;

import java.util.Scanner;

class CombSort 
{ 
  
    int getNextGap(int gap) 
    { 
        gap = (gap*10)/13; 
        if (gap < 1) 
            return 1; 
        return gap; 
    } 
  
    void sort(int arr[]) 
    { 
        int n = arr.length;
        int gap = n; 
  
        boolean swapped = true; 
  
        while (gap != 1 || swapped == true) 
        { 
            gap = getNextGap(gap); 
            swapped = false; 
            for (int i=0; i<n-gap; i++) 
            { 
                if (arr[i] > arr[i+gap]) 
                { 
                    int temp = arr[i]; 
                    arr[i] = arr[i+gap]; 
                    arr[i+gap] = temp; 
 
                    swapped = true; 
                } 
            } 
        } 
    } 
  
  
    public static void main(String args[]) 
    { 
        CombSort ob = new CombSort(); 
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
        ob.sort(arr); 
  
        System.out.println("sorted array"); 
        for (int i=0; i<arr.length; ++i) 
            System.out.print(arr[i] + " "); 
  
    } 
}
