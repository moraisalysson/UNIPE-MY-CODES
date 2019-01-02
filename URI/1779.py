quant_casos = int(input())

contador_casos = 0
notas_contiguas = 0

casos_contiguos = []

while(contador_casos < quant_casos):
    num_provas = int(input())

    entrada_notas = input()

    lista_notas_temp = entrada_notas.split(" ")

    lista_notas = [int(numero) for numero in lista_notas_temp]
    #print(len(lista_notas))

    maior_nota = 0
    cont_descobre_maior = 0
    while(cont_descobre_maior < len(lista_notas)):
        if(lista_notas[cont_descobre_maior] > maior_nota):
            maior_nota = lista_notas[cont_descobre_maior]
        cont_descobre_maior = cont_descobre_maior + 1

    quantidade_contiguas_teste = 0
    quantidade_contiguas = 0
    for nota_atual in lista_notas:
        if(nota_atual == maior_nota):
            quantidade_contiguas_teste = quantidade_contiguas_teste + 1
        else:
            quantidade_contiguas_teste = 0

        if(quantidade_contiguas_teste > quantidade_contiguas):
            quantidade_contiguas = quantidade_contiguas_teste

    casos_contiguos.append(quantidade_contiguas)


    contador_casos = contador_casos + 1

contador_casos = 0

while(contador_casos < quant_casos):
    print("Caso #%d: %d" %(contador_casos + 1, casos_contiguos[contador_casos]))
    contador_casos = contador_casos + 1
