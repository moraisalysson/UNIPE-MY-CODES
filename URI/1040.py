notas = input()

n1, n2, n3, n4 = notas.split()

media = ((float(n1) * 2) + (float(n2) * 3) + (float(n3) * 4) + (float(n4) * 1)) / (2 + 3 + 4 + 1)

if(media >= 7.0):
    print("Media: %.1f" %media)
    print("Aluno aprovado.")
           
elif(media < 5.0):
    print("Media: %.1f" %media)
    print("Aluno reprovado.")
           
elif(media >= 5.0 and media <= 6.9):
    print("Media: %.1f" %media)
    print("Aluno em exame.")

    nota_exame = float(input())

    print("Nota do exame: %.1f" %nota_exame)

    media = (nota_exame + media) / 2

    if(media >= 5.0):
        print("Aluno aprovado.")
    else:
        print("Aluno reprovado.")

    print("Media final: %.1f" %media)
