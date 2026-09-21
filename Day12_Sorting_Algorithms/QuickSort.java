public class QuickSort {
 static void sort(int[] a,int l,int r){if(l>=r)return;int p=partition(a,l,r);sort(a,l,p-1);sort(a,p+1,r);}
 static int partition(int[] a,int l,int r){int pivot=a[r],i=l;for(int j=l;j<r;j++)if(a[j]<=pivot){int t=a[i];a[i]=a[j];a[j]=t;i++;}int t=a[i];a[i]=a[r];a[r]=t;return i;}
 public static void main(String[] args){int[] a={10,7,8,9,1,5};sort(a,0,a.length-1);for(int x:a)System.out.print(x+" ");}
}
