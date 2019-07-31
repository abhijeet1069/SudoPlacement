def egcd(a,b): #Recursive. Calculates x
    if a == 0:
        return (b, 0, 1)
    else:
        g, y, x = egcd(b%a, a)
        return (g, x-(b//a)*y, y)

def xgcd(a,b): #Iterative. Calculates x,y
    prevX, x = 1, 0
    prevY, y = 0, 1
    while b:
        q = a//b
        x, prevX = prevX - q*x, x
        y, prevY = prevY - q*y, y
        a, b = b, a % b
    return a, prevX, prevY



def modinv(a,m): #Modular Inverse
    g, x, y = egcd(a,m)
    if g != 1:
        raise Exception("Modular Inverse does not exist")
    else:
        return x % m
    

