#	<=== Variables ===>
new_list=[]

#	<=== Funciones ===>
def multiplica_lista(lista,n):
	if n==len(lista)-1:
		return lista[n]
	else:
		return lista[n]*multiplica_lista(lista,n+1)

def add_list():
	counter=int(input("Cuantos numeros deseas introducir en la lista? "))
	lista=[]
	for i in range(counter):
		number=int(input("Indica el numero: "))
		lista.append(number)
	return lista

#	<=== Codigo ===>
new_list=add_list()
print(multiplica_lista(new_list,0))