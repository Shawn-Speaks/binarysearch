package nyc.c4q.shawn;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] myArr = {1,4,7,10,13,16,19,22,25,28,31};
        int target = 19;

        System.out.println(iteratingBinarySaerch(myArr, target));
        System.out.println("Size of array: " + myArr.length);
    }

    public static int iteratingBinarySaerch(int[] inputArr, int target) {
        int maxIdx = inputArr.length-1;
        int minIdx = 0;
        while (minIdx<maxIdx) {
            int temp = (maxIdx + minIdx) / 2;

            if (target > inputArr[temp]) {
                minIdx = temp + 1;
                System.out.println("Lower bound: " + minIdx);
            } else if (target < inputArr[temp]){
                maxIdx = temp - 1;
                System.out.println("Upper bound: " + maxIdx);
            }else {
                System.out.println("Value: " + target + " was found at index: " + temp);
                return temp;
            }
        }
    return minIdx;
    }
}
