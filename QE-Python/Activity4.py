print("Enter name of Player 1")
p1 = input()

print("Enter name of Player 2")
p2 = input()

play = "yes"

while play == "yes":
    print("\nPlayer 1 turn:")
    t1 = input()

    print("Player 2 turn:")
    t2 = input()

    if t1 == t2:
        print("Draw")

    elif t1 == "Rock":
        if t2 == "Scissors":
            print(p1, "wins")
        else:
            print(p2, "wins")

    elif t1 == "Scissors":
        if t2 == "Paper":
            print(p1, "wins")
        else:
            print(p2, "wins")

    elif t1 == "Paper":
        if t2 == "Rock":
            print(p1, "wins")
        else:
            print(p2, "wins")

    print("\nPlay another round? (yes/no)")
    play = input()
