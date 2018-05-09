#	<=== Variables ===>
#	<--- La posición 0 SIEMPRE será descripción de lo que hay dentro de la lista --->
import os
pez=["Lista de Peces", ["Raza", "Pisqui"], ["Nombre del Animal", "loles"], ["Nombre del Dueño", "lolita"], ["Peso", 12], ["Conejoship",1234,12,3]]
perro=["Lista de Perros", ["Raza", "Pisqui"], ["Nombre del Animal", "loles"], ["Nombre del Dueño", "lolita"], ["Peso", 12], ["Chip", 1234,32,1]]
gato=["Lista de Gatos", ["Raza", "Pisqui"], ["Nombre del Animal", "loles"], ["Nombre del Dueño", "lolita"], ["Peso", 12], ["Chip", 1234,3534,12]]
conejo=["Lista de Conejos", ["Raza", "Pisqui"], ["Nombre del Animal", "loles"], ["Nombre del Dueño", "lolita"], ["Peso", 12], ["Chip", 12341,4,2,3]]
letra=""

#Funciones
def busca_animal():
	donete=""
	opcion=""
	while donete=="":
		print(" ============")
		print("=    PEZ     =")
		print("=   PERRO    =")
		print("=    GATO    =")
		print("=   CONEJO   =")
		print("= ---------- =")
		print("=  CANCELAR  =")
		print(" ============")
		print("Qué animal deseas introducir?")
		option=input()

		if option.lower() == "pez":
			return "pez"
			
		elif option.lower() == "perro":
			return "perro"

		elif option.lower() == "gato":
			return "gato"

		elif option.lower() == "conejo":
			return "conejo"

		elif option.lower() == "cancelar":
			return 
		else:
			os.system('clear')
			print("Se ha introducido incorrectamente el animal.")
			print("Pulse cualquier tecla para continuar.")
			input()
			os.system('clear')
	os.system('clear')

def add_to_list(lista):
	nomprop=input("Cómo te llamas? ")
	nomprop=nomprop.capitalize()
	lista[3].append(nomprop)

	nomani=input("Cual es el nombre del animal? ")
	nomani=nomani.capitalize()
	lista[2].append(nomani)

	pase="ok"
	while pase=="ok":
		try:
			chip=int(input("Cual es su número de chip? "))
			lista[5].append(chip)
			pase="not_ok"
			
		except ValueError:
			print("Has d'introduir només números.")

	raza=input("Qué raza es? ")
	lista[1].append(raza)

	peso=int(input("Cuanto pesa (en gramos)? "))
	lista[4].append(peso)

	return lista


def b():

	print()
	print(pez[0])
	print("Chip",sorted(pez[5][1:]),pez[1:5])
	print(perro[0])
	print("Chip",sorted(perro[5][1:]),perro[1:5])
	print(gato[0])
	print("Chip",sorted(gato[5][1:]),gato[1:5])
	print(conejo[0])
	print("Chip",sorted(conejo[5][1:]),conejo[1:5])

	input()

#Codigo

while letra!="X":
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
	letra=input("Introduce una letra ")
	letra=letra.upper()
	print("")
	if letra=="B":
		b()
	if letra=="A":
		print("Qué animal deseas introducir?")
		option=input()
	if option.lower() == "pez":
		pez=add_to_list(pez)
		donete="hola"
		print("Se ha añadido con éxito!")
	elif option.lower() == "perro":
		perro=add_to_list(perro)
		donete="hola"
		print("Se ha añadido con éxito!")
	elif option.lower() == "gato":
		gato=add_to_list(gato)
		donete="hola"
		print("Se ha añadido con éxito!")
	elif option.lower() == "conejo":
		conejo=add_to_list(conejo)
		donete="hola"
		print("Se ha añadido con éxito!")
	elif option.lower() == "cancelar":
		donete="hola"
	else:
		os.system('clear')
		print("Se ha introducido incorrectamente el animal.")
		print("Pulse cualquier tecla para continuar.")
		input()
		os.system('clear')
os.system('clear')





"""
a=Jose Lomero
b=Jordi Martinez
c=David Emilio
d=Dani Sabina
e=Jose Andres
f=Alejandro Novoa (este no)
g=Jose Canovas
x=x
"""