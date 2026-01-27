print("From 2 list you have to print Odd from first and even from last as answer")

lst1 = []
lst2 = []
ans = []

n = int(input("How many elements for List ? "))

for i in range(n):
    lst1.append(int(input("Enter number for list 1: ")))

for i in range(n):
    lst2.append(int(input("Enter number for list 2: ")))

for i in range(n):
    if lst1[i] % 2 != 0:
        ans.append(lst1[i])

for i in range(n):
    if lst2[i] % 2 == 0:
        ans.append(lst2[i])

print("Answer list:", ans)
