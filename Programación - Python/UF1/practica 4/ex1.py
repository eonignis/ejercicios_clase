import os

opcion=5
res=0
while opcion!=0:
	print("CALCULADORA")
	print("Menu Principal",end=("\n\n\n"))
	print("1 - Sumar")
	print("2 - Restar")
	print("3 - Multiplicar")
	print("4 - Dividir")
	print("0 - Salir")
	opcion=int(input("Opción: "))
	os.system("clear")
	if opcion==0:
		break;
	elif opcion==1:
		num1=float(input("Escribe un numero: "))
		num2=float(input("Escribe otro numero: "))
		res=num1+num2
	elif opcion==2:
		num1=float(input("Escribe un numero: "))
		num2=float(input("Escribe otro numero: "))
		res=num1-num2
	elif opcion==3:
		num1=float(input("Escribe un numero: "))
		num2=float(input("Escribe otro numero: "))
		res=num1*num2
	elif opcion==4:
		num1=float(input("Escribe un numero: "))
		num2=float(input("Escribe otro numero: "))
		while num2<1:
			print("Escribe un numero superior a 0")
			num2=float(input("Escribe otro numero: "))
		res=num1/num2
	else:
		print("Opción no válida")
	if opcion>0 and opcion<5:
		print("El resultado es: ",res)
	pulsa=input("Pulsa cualquier tecla para continuar")
	os.system("clear")