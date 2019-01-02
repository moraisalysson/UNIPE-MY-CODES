casos = int(input())
while(casos > 0):
    ok = True
    indices = []
    
    str1 = input()
    str2 = input()
    strinc = input()

    i = 0
    while(i < len(strinc)):
        if(strinc[i] == "_"):
            indices.append(i)
        i += 1

    i = 0
    while(i < len(indices)):
        if(str1[indices[i]] == str2[indices[i]]):
            ok = False
        i += 1

    if(ok):
        print("S")
    else:
        print("N")
        
    casos -= 1
