import java.util.*;
public class leetcode{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]={1,2,3,4,5};
        int[] ans=multiply(nums);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] multiply(int[] nums){
        int n=nums.length;
        int answer[]=new int[n];
        for(int i=0; i<nums.length; i++){
            int product=1;
            for(int j=0; j<n; j++){
                if(i==j){
                    continue;
                }
                product=product*nums[j];
                
            }
            answer[i]=product;
        }
        return answer;

    }
}