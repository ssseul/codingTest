# N, M, K를 공백으로 구분하여 입력받기
n, m, k = map(int, input().split())
# N개의 수를 공백으로 구분하여 입력받기
data = list(map(int, input().split()))

# 입력받은 수 정렬
data.sort()
# 가장 큰 수
first = data[n-1]
# 두번째로 큰 수
second = data[n-2]

# 가장 큰 수가 더해지는 횟수 계산
count = int(m / (k + 1)) * k
count += m % (k + 1)    # 나누어 떨어지지 않을 때, m을 (k+1)로 나눠서 더해지는 횟수를 추가시킴!

result = 0
result += (count) * first       # 가장 큰 수 더하기
result += (m - count) * second  # 두번째로 큰 수 더하기

print(result)