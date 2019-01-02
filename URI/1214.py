def getArrayInt(medias):
    array_medias = []

    for media in medias:
        array_medias.append( float(media) )

    return array_medias

def calcMedia(medias):
    somador = 0
    cont = 1
    
    while(cont < len(medias)):
        somador += medias[cont]
        cont += 1

    return somador/(len(medias) - 1)

def calcAcimaMedia(media, medias):
    qtd_acima = 0
    cont = 1
    
    while(cont < len(medias)):

        if(medias[cont] > media):
            qtd_acima += 1

        cont += 1

    return qtd_acima/(len(medias) - 1)

#-------------------------
casos = int(input())

while(casos > 0):

    entradas = input()

    entradas_split = entradas.split()

    entradas_int = getArrayInt(entradas_split)    

    media_turma = calcMedia(entradas_int)
        
    acima_media = calcAcimaMedia(media_turma, entradas_int)

    print("%.3f%%" %(acima_media * 100))
    
    casos -= 1


    
        
