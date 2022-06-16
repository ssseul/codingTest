# N, M, K를 공백으로 입력받기
n, m, k = map(int, input().split())
# N개의 수를 공백으로 구분하여 입력받기
data = list(map(int, input().split()))

# 입력받은 수를 정렬
data.sort()

# 가장 큰 수
first = data[n-1]
# 두번째로 큰 수
second = data[n-2]

result = 0

while True:
    # 가장 큰수를 K번 더하기
    for i in range(k):  
        if m == 0:  # m이 0이라면 반복문 탈출
            break
        result += first
        m -= 1  # 더할 때마다 1씩 빼기

    if m == 0:  # m이 0이라면 반복문 탈출
        break

    # 두 번째로 큰 수를 한번 더하기
    result += second
    m -= 1  # 더할 때마다 1씩 빼기

# 최종 답안 출력
print(result)        