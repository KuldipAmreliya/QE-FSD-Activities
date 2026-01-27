lst = []
n = int(input("How many elements? "))

for i in range(n):
    lst.append(int(input("Enter number: ")))

total = 0
for num in lst:
    total += num

print("List:", lst)
print("Sum:", total)
