#	<=== Variables ===>
lista=[]
new_list=[]

#	<=== Funciones ===>
def suma_lista(lista,n):
	if n==len(lista)-1:
		return lista[n]
	else:
		return lista[n]+suma_lista(lista,n+1)

def add_list():
	counter=int(input("Cuantos numeros deseas introducir en la lista? "))
	lista=[]
	for i in range(counter):
		number=int(input("Indica el numero: "))
		lista.append(number)
	return lista

#	<=== Codigo ===>
#	<--- Creamos las listas --->
counter=int(input("Cuantas listas quieres añadir? "))
for i in range(counter):
	lista=add_list()
	new_list.append(lista)

#	<=== Ejercicio ===>
new_list=suma_lista(new_list,0)
print(suma_lista(new_list,0))