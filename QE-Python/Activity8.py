lst = []
n = int(input("How many elements? "))

for i in range(n):
    lst.append(int(input("Enter number: ")))

print(lst[0] == lst[-1])
