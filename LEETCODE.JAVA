import java.util.*;
public class leetcode{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,1};
        boolean result=duplicate(arr);
        System.out.println(result);

    }
    public static boolean duplicate(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}