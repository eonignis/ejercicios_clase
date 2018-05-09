lista1=[]
lista2=[]
primer_punto=[]
segundo_punto=[]
tercer_punto=[]
cuarto_punto=[]

opcio=""
while opcio.lower()!="stop":
	print("Escribe una palabra para añadir en la lista 1 (si quieres parar, escribe STOP): ")
	opcio=input()
	if opcio not in lista1:
		if opcio.lower()!="stop":
			lista1.append(opcio)
	else:
		print("Ya lo has introducido, prueba un elemento nuevo!")

opcio=""
while opcio.lower()!="stop":
	print("Escribe una palabra para añadir en la lista 2 (si quieres parar, escribe STOP): ")
	opcio=input()
	if opcio not in lista2:
		if opcio.lower()!="stop":
			lista2.append(opcio)
	else:
		print("Ya lo has introducido, prueba un elemento nuevo!")


#Primer punto
for i in lista1:
	if i not in primer_punto:
		primer_punto.append(i)
for i in lista2:
	if i not in primer_punto:
		primer_punto.append(i)

#Segundo punto
for i in lista1:
	if i not in lista2:
		segundo_punto.append(i)


#Tercer punto
for i in lista2:
	if i not in lista1:
		tercer_punto.append(i)

#Cuarto punto
for i in lista1:
	if i in lista2:
		cuarto_punto.append(i)
#1
print("La unión de las dos listas es: ",primer_punto)
#2
print("Las palabras que aparecen en la primera lista y la segunda no son: ",segundo_punto)
#3
print("Las palabras que aparecen en la segunda lista y la primera no son: ",tercer_punto)
#4
print("Las palabras que solo aparecen en ambas listas son: ",cuarto_punto)