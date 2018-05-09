#	<=== Variables ===>
lista1=[]
lista2=[]
result=[]

#	<=== Funciones ===>
def add_list():
	counter=int(input("Cuantos numeros deseas introducir en la lista? "))
	lista=[]
	for i in range(counter):
		number=int(input("Indica el numero: "))
		lista.append(number)
	return lista

def lista_comun(lis1,lis2):
	resultado=[]
	for i in lis1:
		for j in lis2:
			if i==j:
				resultado.append(i)
	return resultado

#	<=== Código ===>
#	<=== Comentar/descomentar la parte que no interesa ===>
#	<=== Listas predeterminadas ===>
lista1=[1,2,1]
lista2=[2,3,2,4]

#	<=== Creación de nuevas listas ===>
"""lista1=add_list()
lista2=add_list()"""

result=lista_comun(lista1,lista2)
print(result)