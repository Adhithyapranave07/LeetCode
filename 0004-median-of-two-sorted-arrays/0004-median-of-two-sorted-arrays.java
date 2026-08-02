class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length ; 
        int m = nums2.length ; 

        int[] arr = new int[n+m];

        int i = 0 ; 
        int j = 0 ; 
        int k = 0 ; 

        while( i < n && j < m ){
            if(nums1[i] < nums2[j]){
                arr[k] = nums1[i];
                i++;
            }
            else {
                arr[k] = nums2[j];
                j++;
            }


            k++;
        }

        while( i < n ){
            arr[k++] = nums1[i++];
        }

        while( j < m ){
            arr[k++] = nums2[j++];
        }
        
        double ans = 0; 

        if( arr.length % 2 != 0 ){
           ans =  (double) arr[arr.length/2];
        }
        else {
            int arrle = arr.length ; 
            int r = arrle / 2 ; 
            int l = r - 1 ; 

            ans = (double) (arr[r] + arr[l] ) / 2.000 ;
        }

        return ans ;




    }
}