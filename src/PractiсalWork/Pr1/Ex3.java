package PractiсalWork.Pr1;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        int sum = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            k++;
        }
        System.out.println("Sum " + sum + " " + "Med " + sum / k);
    }
}
