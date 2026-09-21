public class InsertionSort {
 static void sort(int[] a){for(int i=1;i<a.length;i++){int key=a[i],j=i-1;while(j>=0&&a[j]>key){a[j+1]=a[j];j--;}a[j+1]=key;}}
 public static void main(String[] args){int[] a={12,11,13,5,6};sort(a);for(int x:a)System.out.print(x+" ");}
}
