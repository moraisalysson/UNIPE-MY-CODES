def split_entradas_float(array_entradas):
    array = []
    entradas_apos_split = array_entradas.split()
            
    for valor in entradas_apos_split:
        array.append(float(valor))

    return array

def search_maior(array):
    maior = 0.0

    for valor in array:
        if(valor > maior):
            maior = valor

    return maior


def search_menor(array):
    menor = array[0]

    for valor in array:
        if(valor < menor):
            menor = valor

    return menor

def retira_menor_maior(array):
    maior = search_maior(array)
    menor = search_menor(array)

    array.remove(maior)
    array.remove(menor)

    return array

def calcula_nota_final(array, grau_dificuldade):
    soma = 0.0
    
    for valor in array:
        soma += valor

    return (soma * grau_dificuldade)

def imprime_resultado_competicao(resultado):
    cont = 0
    
    while(len(resultado) > cont):
        print("%s %.2f" %(resultado[cont], resultado[cont + 1]))

        cont += 2

resultado_competicao = []

while True:
    try:
        casos = int(input())

        while(casos > 0):
            resultado_competicao.append(input()) #add o nome

            grau_dif = float(input())

            entrada_notas = input()

            notas = split_entradas_float(entrada_notas)
          
            notas = retira_menor_maior(notas)

            nota_final = calcula_nota_final(notas, grau_dif)

            resultado_competicao.append(nota_final)
            
            casos -= 1

        imprime_resultado_competicao(resultado_competicao)

    except EOFError:
        break
