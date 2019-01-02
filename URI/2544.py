import math

while True:
    try:
        valor = int(input())

        print(int(math.log2(valor)))
        
    except EOFError:
        break
