import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author sueean@163.com
 * @version 1.0
 * @date 2022/5/12 17:01
 */
public class V4_FindMedian {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
        Arrays.sort(result);
        int lenth=result.length;
        if(lenth==0){
            return 0;
        }
        //偶数
        if(lenth%2==0){
            int data1=result[lenth/2-1];
            int data2=result[lenth/2];
            double middle=(data1+data2)/2.0;
            return middle;
        }
        int index=(lenth+1)/2-1;
        double middle=result[index];
        return middle;
    }

    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] nums2={2};
        double medianSortedArrays = new V4_FindMedian().findMedianSortedArrays(nums1, nums2);
        System.out.println("中位数："+medianSortedArrays);
    }
}
