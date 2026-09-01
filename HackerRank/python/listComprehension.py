def permutation(n):
    x = int(input())
    y = int(input())
    z = int(input())
    
    pList = [
        [i, j, k]
        for i in range(x+1)
        for j in range(y+1)
        for k in range(z+1)
        if (i+j+k) != n
    ]
    print(pList)

permutation(3)