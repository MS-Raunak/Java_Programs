package DataStructure.Array.singledimensional;

import java.util.Arrays;

public class P11_ShiftZeroRightSide {
    public static void main(String[] args) {
        int[] arr = {0,0,5,0,7,0,9};

        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]==0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
