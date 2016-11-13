package nyc.c4q.shawn;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] myArr = {0,1,4,7,10,13};


        System.out.println(binarySearch(myArr, 10));
    }

    public static int binarySearch(int[] inputArr, int target) {
        int idxOfMin = 0;
        int idxOfMax = inputArr.length - 1;
        while (inputArr[idxOfMin] != target && inputArr[idxOfMax] != target) {
//            if(target == inputArr[idxOfMin]){
//                return idxOfMin;
//            }else if (target == inputArr[idxOfMax]){
//                return idxOfMax;
//            }

            int result = ((idxOfMax - idxOfMin) / 2);
            if (target < inputArr[idxOfMax - idxOfMin]) {
                idxOfMin = idxOfMin + result;
            } else if (target > inputArr[(idxOfMax - idxOfMin)]) {
                idxOfMax = idxOfMax - result;
            } else if (target == inputArr[(idxOfMax - idxOfMin)]) {
                System.out.println("BLAH");
            }
        }
        System.out.println("Index : " + idxOfMin + " " + inputArr[idxOfMin] + " , should be equal to  " + target);
        return idxOfMin;
    }
}
