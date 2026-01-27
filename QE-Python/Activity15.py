
print("Program started")

try:
    print(undefined_variable)
except NameError as e:
    print("NameError caught!")
    print("Error message:", e)

print("Program continues running")
