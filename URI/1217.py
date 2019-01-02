casos = int(input())
cont_casos = 0
somador_precos = 0
somador_pesos = 0

while(cont_casos < casos):

    preco = float( input() )
    somador_precos += preco

    frutas = input()

    frutas_split = frutas.split()
    somador_pesos += len(frutas_split)

    print("day %d: %d kg" %( (cont_casos + 1), len(frutas_split) ) )

    cont_casos += 1

print("%.2f kg by day" %(somador_pesos/casos) )
print("R$ %.2f by day" %(somador_precos/casos) )
