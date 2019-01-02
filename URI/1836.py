casos = int(input())

dados = []

cont = 0
while(cont < casos):
    entrada = []
    ent_split = []
    ent_linha01 = []
    ent_linha02 = []
    ent_linha03 = []
    ent_linha04 = []
    linha01 = []
    linha02 = []
    linha03 = []
    linha04 = []
    
    entrada = input()

    ent_split = entrada.split()

    dados.append(ent_split[0])
    dados.append(int(ent_split[1]))

    ent_linha01 = input()
    ent_linha02 = input()
    ent_linha03 = input()
    ent_linha04 = input()

    linha01 = list(map(int, ent_linha01.split()))
    linha02 = list(map(int, ent_linha02.split()))
    linha03 = list(map(int, ent_linha03.split()))
    linha04 = list(map(int, ent_linha04.split()))

    hp = int((((linha01[1] + linha01[0] + (pow(linha01[2], 0.5) / 8) + 50) * int(ent_split[1])) / 50) + 10)
    at = int((((linha02[1] + linha02[0] + (pow(linha02[2], 0.5) / 8)) * int(ent_split[1])) / 50) + 5)
    df = int((((linha03[1] + linha03[0] + (pow(linha03[2], 0.5) / 8)) * int(ent_split[1])) / 50) + 5)
    sp = int((((linha04[1] + linha04[0] + (pow(linha04[2], 0.5) / 8)) * int(ent_split[1])) / 50) + 5)

    dados.append(hp)
    dados.append(at)
    dados.append(df)
    dados.append(sp)

    cont += 1

cont = 0
i = 0
while(cont < casos):
    print("Caso #%d: %s nivel %d" %(cont + 1, dados[i], dados[i + 1]))
    print("HP: %d" %(dados[i + 2]))
    print("AT: %d" %(dados[i + 3]))
    print("DF: %d" %(dados[i + 4]))
    print("SP: %d" %(dados[i + 5]))
    
    i += 6
    cont += 1
