import datetime

while True:
    try:
        data = input()

        data_div = data.split()

        mes = int(data_div[0])
        dia = int(data_div[1])

        if(mes == 12):
            if(dia == 25):
                print("E natal!")

            elif(dia == 24):
                print("E vespera de natal!")

            elif(dia > 25):
                print("Ja passou!")

        else:
            data1 = datetime.date(day=dia, month=mes, year=2016)
            data2 = datetime.date(day=25, month=12, year=2016)

            print("Faltam %i dias para o natal!" %(abs((data2 - data1).days)))
            
    except EOFError:
        break
