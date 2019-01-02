

def fib(n):
    global qtd

    qtd += 1
    
    if(n == 0):
        return 0

    elif(n == 1):
        return 1

    else:
        return ( fib(n - 1) + fib(n - 2) )

casos = int( input() )

while( casos > 0):
    qtd = 0

    valor = int( input() )

    resultado = fib(valor)
    
    print("fib(%d) = %d calls = %d" %(valor, qtd - 1, resultado) )

    casos -= 1
