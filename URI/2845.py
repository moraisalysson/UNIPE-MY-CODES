entradas_int = []

doendes = int(input())

entrada = input()

entradas_split = entrada.split()

for valor in entradas_split:
    entradas_int.append(int(valor))

print(max(entradas_int) + 1)
