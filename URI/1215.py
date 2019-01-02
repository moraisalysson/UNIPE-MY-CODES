while True:
    try:
        entrada = input()
   
    except EOFError:
        break

    separadas = (entrada.lower()).split(" ")

    separadas.sort()

    i = 0

    for valor in separadas:
        print(valor)

    
