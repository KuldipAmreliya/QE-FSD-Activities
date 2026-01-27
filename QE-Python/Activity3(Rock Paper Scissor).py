# print("Please enter Name of Player 1");
# player1=input();
# print("Please enter name of player 2");
# player2=input();
# i=0;
# while(i<4):
#     print("Player 1:")
#     turn1=input();
#     print("Player 2")
#     turn2=input();
#     if(turn1=="Rock" and turn2=="Scissors"):
#         print(player1,"wins");
#     if(turn1=="Scissors" and turn2=="Rock"):
#         print(player2,"wins");
#     if(turn1=="Rock" and turn2=="Paper"):
#         print(player2,"wins");
#     if(turn1=="Paper" and turn2=="Rock"):
#         print(player1,"wins");

print("Enter name of Player 1")
player1 = input()

print("Enter name of Player 2")
player2 = input()

i = 0
while i < 4:
    print("\nPlayer 1 turn:")
    turn1 = input()

    print("Player 2 turn:")
    turn2 = input()

    if turn1 == turn2:
        print("Draw")

    elif turn1 == "Rock" and turn2 == "Scissors":
        print(player1, "wins")

    elif turn1 == "Scissors" and turn2 == "Paper":
        print(player1, "wins")

    elif turn1 == "Paper" and turn2 == "Rock":
        print(player1, "wins")

    else:
        print(player2, "wins")

    i += 1
