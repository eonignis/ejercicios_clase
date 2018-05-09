#	<=== Imports ===>
import os

#	<=== Variables ===>
#	<--- La posición 0 SIEMPRE será descripción de lo que hay dentro de la lista --->
pez=["Lista de Peces", ["Raza", "Pisqui"], ["Nombre del Animal", "Loles"], ["Nombre del Dueño", "Lolita"], ["Peso", 12], ["Chip", 1234]]
perro=["Lista de Perros", ["Raza", "Pisqui"], ["Nombre del Animal", "loles"], ["Nombre del Dueño", "lolita"], ["Peso", 12], ["Chip", 1234]]
gato=["Lista de Gatos", ["Raza", "Pisqui"], ["Nombre del Animal", "loles"], ["Nombre del Dueño", "lolita"], ["Peso", 12], ["Chip", 1234]]
conejo=["Lista de Conejos", ["Raza", "Pisqui"], ["Nombre del Animal", "loles"], ["Nombre del Dueño", "lolita"], ["Peso", 12], ["Chip", 1234]]
option=""
donete=""

#	<=== Funciones ===>
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

def ereaser_name(lista):
	#	Preguntamos el chip del animal
		chip=int(input("Indica el chip del animal: "))

		#	Buscamos la posicion
		posicion=lista[5].index(chip)
		print(posicion)

		#	Se eliminan los valores
		print(lista)
		lista[1].pop(posicion)
		lista[2].pop(posicion)
		lista[3].pop(posicion)
		lista[4].pop(posicion)
		lista[5].pop(posicion)

		return lista

#	<=== Código ===>
while donete=="":
	option=
	if option.lower() == "pez":
		pez=ereaser_name(pez)
		donete="hola"
		print("La acción se ha completado con éxito!")
	elif option.lower() == "perro":
		perro=ereaser_name(perro)
		donete="hola"
		print("La acción se ha completado con éxito!")
	elif option.lower() == "gato":
		gato=ereaser_name(gato)
		donete="hola"
		print("La acción se ha completado con éxito!")
	elif option.lower() == "conejo":
		conejo=ereaser_name(conejo)
		donete="hola"
		print("La acción se ha completado con éxito!")
	elif option.lower() == "cancelar":
		donete="hola"
	else:
		os.system('clear')
		print("Se ha introducido incorrectamente el animal.")
		print("Pulse cualquier tecla para continuar.")
		input()
		os.system('clear')
os.system('clear')
