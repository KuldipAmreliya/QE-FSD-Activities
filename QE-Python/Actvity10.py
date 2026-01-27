n = int(input("How many numbers in the tuple? "))

nums = []
for i in range(n):
    nums.append(int(input("Enter number: ")))

t = tuple(nums)

print("Numbers divisible by 5:")
for x in t:
    if x % 5 == 0:
        print(x)
