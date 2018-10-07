
package quicksort;


public class QuickSort {
       
    public static void main(String[] args) {
       int a[]={98,29,65,12,44,87};
       quicksort(a,0,5);
       System.out.println("Sorted Array is:");
       for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
    public static int partition(int a[],int lb,int ub){
 	int pivot=a[lb];
 	int start=lb;
 	int end=ub;
 	while(start<end)
 	{
 		while(a[start]<=pivot && start<end)
 		{
 			start=start+1;
		 }
		 while(a[end]>pivot){
		 	end=end-1;
		 }
		 if(start<end)
		 {
		 	int temp=a[start];
		 	    a[start]=a[end];
		 	    a[end]=temp;
		 }
	 }
	 a[lb]=a[end];
	 a[end]=pivot;
	 return (end);         
}
      static void quicksort(int a[],int lb,int ub){
        if(lb<ub)
 	{
 		int loc=partition(a,lb,ub);
 		quicksort(a,lb,loc-1);
 		quicksort(a,loc+1,ub);
	 }
}
}
