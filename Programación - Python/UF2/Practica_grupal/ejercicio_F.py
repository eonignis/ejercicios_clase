pez=["Lista de Peces", ["Raza", "Pisqui", "Pasca"], ["Nombre del Animal", "loles", "lolas"], ["Nombre del Dueño", "lolita", "lolita2"], ["Peso", 12, 15], ["Chip",12345,1234]]
perro=["Lista de Perros", ["Raza", "Guau"], ["Nombre del Animal", "loles"], ["Nombre del Dueño", "lolita"], ["Peso", 12], ["Chip", 134]]
gato=["Lista de Gatos", ["Raza", "Miau"], ["Nombre del Animal", "loles"], ["Nombre del Dueño", "lolita"], ["Peso", 12], ["Chip", 123]]
conejo=["Lista de Conejos", ["Raza", "JODER RUBEN"], ["Nombre del Animal", "loles"], ["Nombre del Dueño", "lolita"], ["Peso", 12], ["Chip", 12341]]

def parche(tipo, animales):
	nuevosAnimales=[]

	contador=len(animales[1])
	for i in range(1,contador):
		nuevosAnimales.append([animales[1][i],animales[2][i],animales[3][i],animales[4][i],animales[5][i],tipo])

	return nuevosAnimales

def ordenarPorChip(animales):
	return sorted(animales, key=lambda animal: animal[4])

def b():
	print(pez[0])
	print(ordenarPorChip(parche("pez", pez)))
	print(perro[0])
	print(ordenarPorChip(parche("perro", perro)))
	print(gato[0])
	print(ordenarPorChip(parche("gato", gato)))
	print(conejo[0])
	print(ordenarPorChip(parche("conejo", conejo)))

	input()

def f():

	listaCompleta=parche("pez", pez)+parche("perro", perro)+parche("gato", gato)+parche("conejo", conejo)
	listaOrdenada=ordenarPorChip(listaCompleta)

	for animal in listaOrdenada:
		print(animal[5],animal[4])
