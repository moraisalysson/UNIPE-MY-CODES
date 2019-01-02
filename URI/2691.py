casos = int(input())

while(casos > 0):
    entrada = input()

    entradaSplit = entrada.split("x")

    vlr1 = int(entradaSplit[0])
    vlr2 = int(entradaSplit[1])

    cont = 5
    if(vlr1 == vlr2):
        while(cont <= 10):
            print("%d x %d = %d" %(vlr1, cont, vlr1 * cont))
            cont += 1
    else:
        while(cont <= 10):
            print("%d x %d = %d && %d x %d = %d" %(vlr1, cont, vlr1 * cont, vlr2, cont, vlr2 * cont))
            cont += 1
    casos -= 1
