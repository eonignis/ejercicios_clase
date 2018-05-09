#	<=== Funciones ===>

def sum(a):
	suma=0
	for i in a:
		suma+=i
	print(suma)

def multip(a):
	multiplica=1
	for i in a:
		multiplica*=i
	print(multiplica)


#	<=== Código ===>
lista=[]
maximo=int(input("Cuantos numeros querrás introducir? "))
i=1
while i<=maximo:
	num=int(input("Introduce un número: "))
	lista.append(num)
	i+=1

#	<=== Finalizamos el programa sumando y multiplicando los números ===>
sum(lista)
multip(lista)