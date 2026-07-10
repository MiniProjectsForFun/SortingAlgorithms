public class Main {


    public static void main(String[] args) {
    int[] checkArr = new int[]{1,3, 2,4,6,5,8,7,11,10,9};
    System.out.println(java.util.Arrays.toString(bogoSort(checkArr)));
    System.out.println(isSorted(checkArr));

    }

    public static int[] bogoSort(int[] arr) { //uga buga!!!!!!!
        while (!isSorted(arr)) {
            shuffle(arr);
        }
        return arr;
    }


    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }
}
