import java.util.ArrayList;
import java.util.List;

public class ArraySortCompare {
    public static void main(String[] args) {
        // 배열에 10,000개의 정수를 삽입
        int[] array = new int[10000];
        for(int i=0; i<10000; i++){
            // 1부터 100사이의 랜덤한 정수
            array[i] = (int)(Math.random()*100);
        }

        // 선택 정렬 프로그램 성능 측정
        long start_time = System.currentTimeMillis();   // 측정 시작
        System.out.println("선택 정렬 성능 측정: " + start_time);

        // 선택 정렬 프로그램 소스 코드
        for(int i=0; i<array.length; i++){
            // 가장 작은 원소의 인덱스
            int min_index = i;
            for(int j=i+1; j<array.length; j++){
                if(array[min_index] > array[j]){
                    min_index = j;
                }
            }
            // 스와프
            array[i] = array[min_index];
            array[min_index] = array[i];
        }

        long end_time = System.currentTimeMillis(); // 측정 종료
        //long diif_time = (end_time - start_time)/1000;
        System.out.println("선택 정렬 성능 측정: " + end_time);
    }
}
