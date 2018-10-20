import java.util.Scanner;
package bubblesort;

public class BubbleSort {

   
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of elements to be sorted: ");
         int n=sc.nextInt();
         System.out.println("Enter "+n+" elements to the array to be sorted: ");
         for(int i=0;i<n;i++)
         int a[i] =sc.nextInt();  
          System.out.println("Array entered Before Sort: \n");  
          for(i=0; i<n; i++){  
          System.out.print(a[i]+ " ");  
          }  
          System.out.println();  
          bubbleSort(a);
          System.out.println("Array After Sort:\n");  
          for(i=0; i<n; i++){  
          System.out.print(a[i]+ " ");  
          }  
         }  
        
    
    static void bubbleSort(int[] a) {  
        int n = a.length;  
          for(int i=0; i<n; i++){  
             for(int j=1;j<(n-i); j++){  
                 if(a[j-1] > a[j]){  
                    int temp = a[j-1];  
                    a[j-1] = a[j];  
                    a[j] = temp;  
                   }  
               }  
         }  
    }  
}
