while True:
    try:
        entrada = input()
        ent_split = entrada.split()

        tipos_promo = int(ent_split[0])
        latas_venda = int(ent_split[1])

        cont = 0
        arm_latas = []
        arm_valores = []
        
        while(cont < tipos_promo):
            entrada2 = input()
            ent_split2 = entrada2.split()

            qtd_latas = int(ent_split2[0])
            vlr_latas = int(ent_split2[1])

            arm_latas.append(qtd_latas)

            arm_valores.append(vlr_latas/qtd_latas)
                
            cont += 1

        receita = 0.0
        while(0 < latas_venda):
            maior_vlr = max(arm_valores)

            index = arm_valores.index(maior_vlr)

            if(arm_latas[index] <= latas_venda):
                receita = receita + (arm_latas[index] * arm_valores[index])
                latas_venda -= arm_latas[index]

            else:
                latas_venda -= arm_latas[index]
                arm_latas.pop(index)
                arm_valores.pop(index)
                
        print(receita)
            
    except EOFError:
        break
