
package bubblesort;

public class BubbleSort {

   
    public static void main(String[] args) {
          int a[] ={37,56,61,34,27,11,14};  
          System.out.println("Array Before Sort");  
          for(int i=0; i<a.length; i++){  
          System.out.print(a[i]+ " ");  
          }  
          System.out.println();  
          bubbleSort(a);
          System.out.println("Array After Sort");  
          for(int i=0; i<a.length; i++){  
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
