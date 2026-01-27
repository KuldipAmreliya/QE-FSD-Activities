def fibonacci(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)


count = int(input("How many Fibonacci numbers do you want to generate? "))

if count <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci series:")
    for i in range(count):
        print(fibonacci(i), end=" ")
