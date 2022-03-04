n1 = int(input())
op = input()
n2 = int(input())

if (op == "+"):
    result = n1 + n2
elif (op == "-"):
    result = n1 - n2
elif (op == "*"):
    result = n1 * n2
elif (op == "/"):
    result = n1 / n2
elif (op == "//"):
    result = n1 // n2
elif (op == "%"):
    result = n1 % n2
    
print ("Resultado = ", result)