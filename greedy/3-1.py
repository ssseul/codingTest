n = 1260    # 거스름돈
count = 0   # 거슬러 줘야 할 동전의 최소 개수

# 큰 단위의 화폐부터 차례대로 확인
coin_types = [500, 100, 50, 10]

for coin in coin_types:
    count += n // coin;    # 해당화폐로 거슬러 줄 수 있는 동전의 최소 개수 세기
    n %= coin              # 해당화폐로 거슬러 주고 남은 거스름돈

print(count)    