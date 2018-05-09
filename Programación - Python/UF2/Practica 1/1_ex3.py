def divisores(num):
	if num <= 0:
		print("Introduce un numero mayor de cero:")
	else:
		print("Los divisores de", num," son:", end="")
		for i in range (num):
			if i%2==0:
				print (i, end="")
num=int(input("Escribe un numero:"))
divisores(num)