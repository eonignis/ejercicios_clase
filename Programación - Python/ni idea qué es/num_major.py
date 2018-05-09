num1=float(input("Introduce un numero  "))
num2=float(input("Introduce otro numero  "))
num3=float(input("Introduce un ultimo numro  "))
if num1>num2 and num1>num3:
	mayor=num1
elif num2>num1 and num2>num3:
	mayor=num2
else:
	mayor=num3
print("El numero mas grande es: ",mayor)