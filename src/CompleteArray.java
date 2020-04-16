import java.util.Arrays;
public class CompleteArray {
    public static void main(String[] args) {
        int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10};
        int sum = 0;
        int length = numbers.length-1;
        for(int index = 0 ; index<=length;index++){
            sum += numbers[index];
        }
        System.out.println(sum);
    }
}
