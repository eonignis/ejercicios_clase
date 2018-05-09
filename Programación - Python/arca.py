#	<=== Variables ===>
#	<--- La posición 0 SIEMPRE será descripción de lo que hay dentro de la lista --->
lista=[8,3,5,34,3,2,4,6345,13,5353,4141,1,]
pez=["Lista de Peces", ["Raza", "Pisqui"], ["Nombre del Animal", "loles"], ["Nombre del Dueño", "lolita"], ["Peso", 12], ["Chip",1234,12,3]]
perro=["Lista de Perros", ["Raza", "Pisqui"], ["Nombre del Animal", "loles"], ["Nombre del Dueño", "lolita"], ["Peso", 12], ["Chip", 1234]]
gato=["Lista de Gatos", ["Raza", "Pisqui"], ["Nombre del Animal", "loles"], ["Nombre del Dueño", "lolita"], ["Peso", 12], ["Chip", 1234]]
conejo=["Lista de Conejos", ["Raza", "Pisqui"], ["Nombre del Animal", "loles"], ["Nombre del Dueño", "lolita"], ["Peso", 12], ["Chip", 1234]]
option=""

#Funciones
def b():

	print(sorted(pez[5][1:]))
	print(pez[0])
	print(pez[5],pez[1],pez[2],pez[3],pez[4])
	print(perro[0])
	print(perro[5],perro[1],perro[2],perro[3],perro[4])
	print(gato[0])
	print(gato[5],gato[1],gato[2],gato[3],gato[4])
	print(conejo[0])
	print(conejo[5],conejo[1],conejo[2],conejo[3],conejo[4])

	input()

#Codigo
b()

"""
while option!="X":
	print("====================================================")
	print("Escribe ""A"" Para Insertar un Animal")
	print("")
	print("Escribe ""B"" Para Mostrar Todos los Animales")
	print("")
	print("Escribe ""C"" Para Eliminar un Animal")
	print("")
	print("Escribe ""D"" Para Busca un Animal por Nombre")
	print("")
	print("Escribe ""E"" Para Modificar los datos de un animal")
	print("")
	print("Escribe ""F"" Para Mostrar la Clínica Ordenada por Chip")
	print("")
	print("Escribe ""G"" Para Indicar el Estado del Animal")
	print("")
	print("Escribe ""X"" Para Salir del Programa")
	print("====================================================")
	print("")
	option=input("Introduce una letra ")
	option=option.upper()
	print("")
	if option=="B":
		b()
	if option=="Z":
		print(pez[5][1:])
		print(pez[5][1:].sort())
		pez[5][1:].sort()
		print(pez[5][1:])
		input("")






a=Jose Lomero
b=Jordi Martinez
c=David Emilio
d=Dani Sabina
e=Jose Andres
f=Alejandro Novoa (este no)
g=Jose Canovas
x=x
"""