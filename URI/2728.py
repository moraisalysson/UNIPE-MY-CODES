while True:
    try:
        cont = 0
        entrada = input()

        entradaSplit = entrada.split("-")
        str1 = entradaSplit[0]
        str2 = entradaSplit[1]
        str3 = entradaSplit[2]
        str4 = entradaSplit[3]
        str5 = entradaSplit[4]

        if(str1[0].lower() == "c" or str1[len(str1)-1].lower() == "c"):
            cont += 1
        if(str2[0].lower() == "o" or str2[len(str2)-1].lower() == "o"):
            cont += 1
        if(str3[0].lower() == "b" or str3[len(str3)-1].lower() == "b"):
            cont += 1
        if(str4[0].lower() == "o" or str4[len(str4)-1].lower() == "o"):
            cont += 1
        if(str5[0].lower() == "l" or str5[len(str5)-1].lower() == "l"):
            cont += 1

        if(cont == 5):
            print("GRACE HOPPER")
        else:
            print("BUG")
        
    except EOFError:
        break
