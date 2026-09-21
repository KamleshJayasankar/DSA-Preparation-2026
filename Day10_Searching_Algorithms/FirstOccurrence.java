public class FirstOccurrence {
    static int firstOccurrence(int[] nums,int target){
        int left=0,right=nums.length-1,answer=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){answer=mid;right=mid-1;}
            else if(nums[mid]<target)left=mid+1;
            else right=mid-1;
        }
        return answer;
    }
    public static void main(String[] args){System.out.println(firstOccurrence(new int[]{1,2,2,2,4},2));}
}
