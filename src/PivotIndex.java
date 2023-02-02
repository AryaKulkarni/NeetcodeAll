public class PivotIndex {
    public static int pivotIndex(int[] nums) {

        int[] sumLeft=new int[nums.length];
        int[] sumRight = new int[nums.length];

        int sum=0;

        for(int i=0;i<nums.length;i++) {
            sumLeft[i]=sum;
            sum+=nums[i];
        }
        sum=0;
        for(int i=nums.length-1;i>=0;i--) {
            sumRight[i]=sum;
            sum+=nums[i];
        }

        for(int i=0;i<nums.length;i++) {
            if(sumLeft[i]==sumRight[i]) return i;
        }
        return -1;
        
    }
    public static void main(String[] args) throws Exception {
        int arr[]={1,2,3};
        System.out.println(pivotIndex(arr));
    }
}
