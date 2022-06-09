public class _3_1 {
    public static void main(String[] args) {
        int n = 1260;   // 거스름돈
        int count = 0;  // 거슬러 줘야 할 동전의 최소 개수

        int[] coin_types = {500, 100, 50, 10};
        for(int i=0; i<coin_types.length; i++){
            int coin = coin_types[i];   
            count += n / coin;          // 해당화폐로 거슬러 줄 수 있는 동전의 최소 개수 세기
            n = n % coin;               // 해당화폐로 거슬러 주고 남은 거스름돈
        }

        System.out.println(count);
    }
}
