public class MergeSort {
 static void sort(int[] a,int l,int r){if(l>=r)return;int m=l+(r-l)/2;sort(a,l,m);sort(a,m+1,r);merge(a,l,m,r);}
 static void merge(int[] a,int l,int m,int r){int[] t=new int[r-l+1];int i=l,j=m+1,k=0;while(i<=m&&j<=r)t[k++]=a[i]<=a[j]?a[i++]:a[j++];while(i<=m)t[k++]=a[i++];while(j<=r)t[k++]=a[j++];for(int x=0;x<t.length;x++)a[l+x]=t[x];}
 public static void main(String[] args){int[] a={38,27,43,3,9,82,10};sort(a,0,a.length-1);for(int x:a)System.out.print(x+" ");}
}
