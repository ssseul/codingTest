import java.util.function.IntBinaryOperator;

public class TimeComplexity {
    public static void main(String[] args) {
        int array[] = {3, 5, 1, 2, 4};
        int summary = 0;

        for(int i=0; i<array.length; i++){
            summary += array[i];
        }

        System.out.println(summary);
    }
}