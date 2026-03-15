n = input()
mylist = list(map(int, input().split()))

my_max = max(mylist)
my_sum = sum(mylist)

print(my_sum * 100 / my_max / int(n))
