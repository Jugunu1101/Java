n = int(input("Enter"))
for i in range(1,n+1):
    for j in range(i):
        print("* ",end="")
    print()
for i in range(5,0,-1):
    for j in range(i):
        print("* ",end="")
    print()