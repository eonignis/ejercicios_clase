#	<=== Imports ===>
import os

#	<=== Variables ===>
#	<--- La posición 0 SIEMPRE será descripción de lo que hay dentro de la lista --->
pez=["Lista de Peces", ["Raza", "Pisqui"], ["Nombre del Animal", "loles"], ["Nombre del Dueño", "lolita"], ["Peso", 12], ["Chip", 1234]]
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

#	<=== Código ===>
while donete=="":
	option=busca_animal()
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
print(perro)