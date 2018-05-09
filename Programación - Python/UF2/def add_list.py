def add_list():
	counter=int(input("Cuantos numeros deseas introducir en la lista? "))
	lista=[]
	for i in range(counter):
		number=int(input("Indica el numero: "))
		lista.append(number)
	return lista