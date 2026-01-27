fruits = {
    "apple": 100,
    "banana": 30,
    "mango": 150
}

fruit = input("Enter fruit name: ")

if fruit in fruits:
    print("Fruit is available")
else:
    print("Fruit is not available")
