/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withoutten;

/**
 *
 * @author ariya boonchoo
 */
public class WithoutTen {

//    public static void main(String[] args) {
//        int[] nums = {10, 20, 30, 50, 10, 60, 70};
////         int [] nums2 = {10,10,20,15,16};
//        withoutTen(nums);
//        String n = ",";
//        int t = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 10) {
////                System.out.print(t);
//                nums[i]=t;
//                System.out.print(nums[i]);
//                System.out.print(n);
//            }
//
//        }
//    }

    public static int[] withoutTen(int[] nums) {
        int[] arr = new int[nums.length];
        int p = 0;
        String n = ",";
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                arr[p] = nums[i];
                System.out.print(arr[p]);
                System.out.print(n);
                p++;

            }
        }
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10) {
//                System.out.print(t);
                nums[i]=t;
                System.out.print(nums[i]);
                System.out.print(n);
            }

        }

        return arr;

    }
}
