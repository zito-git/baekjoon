import sys
input = sys.stdin.readline

num, q = map(int, input().split())
numbers = list(map(int, input().split()))
num_arr = [0]
my_sum = 0

for i in numbers:
    my_sum += i
    num_arr.append(my_sum)

for i in range(q):
    a, b = map(int, input().split())
    print(num_arr[b] - num_arr[a - 1])
