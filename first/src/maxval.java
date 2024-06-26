import java.util.Arrays;

public class maxval {

    static int maxvalue(int[] nums){

        int maxVal=nums[0];

        for (int i = 0; i < nums.length-1; i++) {

            if(nums[i]>nums[maxVal]){

                maxVal=nums[i];
            }

        }

        return nums[maxVal];



    }




    public static void main(String[] args) {

        int[] nums={2,1,9,4,2,3};// 9;

        int result=maxvalue(nums);

        System.out.println("maximum value in array "+ Arrays.toString(nums)+ "is "+result);

    }
}
