public class TimeComplexity_multi {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 2, 4};

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                int temp = array[i] * array[j];
                System.out.println(temp);
            }
        }
    }
}
