entradas = input()

notas_str = entradas.split()

notas = list(map(float, notas_str))

for vlr in notas:
    if(vlr == min(notas)):
        notas.remove(vlr)
        break

for vlr in notas:
    if(vlr == max(notas)):
        notas.remove(vlr)
        break
    
print("%.1f" %(sum(notas)))
