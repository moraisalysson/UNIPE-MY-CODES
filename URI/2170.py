proj = 1

while True:
    try:
        entrada = input()
        
    except EOFError:
        break

    valores = entrada.split()

    if(len(valores) == 1 or float(valores[0].replace("'", " ")) == 0):
        percentual_juros = 0
    else:
        capital = float(valores[0].replace("'", " "))
        montante = float(valores[1].replace("'", " "))
        percentual_juros = ((montante / capital) - 1) * 100

    print("Projeto %d:" %proj)
    print("Percentual de juros da aplicacao: %.2f %%\n" %percentual_juros)

    proj = proj + 1
