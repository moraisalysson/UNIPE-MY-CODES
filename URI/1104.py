while(True):
    entradas = input()
    
    entsplit = entradas.split()

    entA = int(entsplit[0])

    entB = int(entsplit[1])

    if(entA == 0 and entB == 0):
        break
    
    entradasA = input()
    entradasB = input()
    
    entAsplit = entradasA.split()
    entBsplit = entradasB.split()

    entAsplit = list(set(entAsplit))
    entBsplit = list(set(entBsplit))

    quant_cartas = 0
    
    b = 0
    a = 0
    while(b < len(entBsplit)):
        while(a < len(entAsplit)):
            if(entBsplit[b] != entAsplit[a]):
                quant_cartas += 1
            a += 1
        b += 1
    
    if(entA < entB):
        if(quant_cartas > entA):
            quant_cartas = entA
    else:
        if(quant_cartas > entB):
            quant_cartas = entB

    print(quant_cartas)
