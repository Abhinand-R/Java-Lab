package Lab;
import java.util.*;
class QuickSort{
public void sort(int[] arr, int l, int h) {
if (l < h)
{
int p = partition(arr, l, h);
sort(arr,l, p-1);
sort(arr, p+1, h);
}
}
public int partition(int[] arr, int low, int high) {
int pivot = arr[high];
int i = (low-1);
for (int j=low; j<high; j++)
{
if (arr[j] <= pivot)
{
i++;
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
int temp = arr[i+1];
arr[i+1] = arr[high];
arr[high] = temp;
return i+1;
}
}
 class QuickSort1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the limit of Array :");

int lim = sc.nextInt();
int arr[] = new int[lim];
System.out.println("Enter the elements of Array :");
for(int i = 0 ; i<lim;i++) {
arr[i]=sc.nextInt();
}
int size = arr.length;
QuickSort qs = new QuickSort();
qs.sort(arr,0,size-1);
System.out.println("\nSorted Array:\n");
for (int i=0; i<size; ++i)
System.out.print(arr[i]+" ");
sc.close();
}
}

