casos = int(input())

while(casos > 0):

    entrada = input()

    entrada_split = entrada.split()
    
    base = int(entrada_split[0])
    potencia = int(entrada_split[1])

    resultado = str( pow(base, potencia) )
 
    print(len(resultado))

    casos -= 1
