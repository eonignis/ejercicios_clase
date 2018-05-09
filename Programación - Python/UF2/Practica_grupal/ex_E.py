import os
#	<=== Variables ===>
#	<--- La posición 0 SIEMPRE será descripción de lo que hay dentro de la lista --->
a=0
pez=["Lista de Peces", ["Raza", "Pisqui","Adsfsdf","ASDOPFASDFA","Prueba"], ["Nombre del Animal", "Loles", "Manolo", "Anacleto"], ["Nombre del Dueño", "Lolita", "Lola", "Eustaquio"], ["Peso", 12], ["Chip", 1234]]
perro=["Lista de Perros", ["Raza", "Pisqui"], ["Nombre del Animal", "loles"], ["Nombre del Dueño", "lolita"], ["Peso", 12], ["Chip", 1234]]
gato=["Lista de Gatos", ["Raza", "Pisqui"], ["Nombre del Animal", "Loles"], ["Nombre del Dueño", "Lolita"], ["Peso", 12], ["Chip", 1234]]
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

def modificaDatos(lista):
	chip=0
	while chip==0:
		try:			
			chip=int(input("Cual es su número de chip? "))
			posicion=lista[5].index(chip)
						
		except ValueError:
			print("Atención! Debe introducir un chip correcto.")
			chip=0

	print("Introduce el dato que quieres modificar entre los siguientes ")
	print("Dueño, Nombre (de la mascota), Raza, y Peso")
	opcion=input()

	if opcion.lower() == "raza":
		print(lista[1][1:len(lista[1])])

		#Introducimos el valor nuevo
		nueva_raza=input("Indica la nueva raza: ")
		nueva_raza=nueva_raza.capitalize()


		#	Se actualiza el valor
		lista[1][posicion]=nueva_raza
		print(lista[1])

	elif opcion.lower() == "nombre":
		print(lista[2][1:len(lista[2])])

		#	Introducimos el valor nuevo
		nuevo_nombre=input("Indica el nuevo nombre: ")
		nuevo_nombre=nuevo_nombre.capitalize()

		#	Se actualiza el valor
		lista[2][posicion]=nuevo_nombre
		print(lista[2])

	elif opcion.lower() == "dueño":
		print(lista[3][1:len(lista[3])])

		#	Introducimos el valor nuevo
		nombre_dueño_nuevo=input("Indica el nuevo dueño: ")
		nombre_dueño_nuevo=nombre_dueño_nuevo.capitalize()

		#	Se actualiza el valor
		lista[3][posicion]=nombre_dueño_nuevo
		print(lista[3])

	elif opcion.lower() == "peso":
		print(lista[4][1:len(lista[4])])

		#	Introducimos el valor nuevo
		pase="ok"
		while pase=="ok":
			try:
				peso=int(input("Cual es su peso actual? "))
				peso_nuevo=int(input("Indica el nuevo peso: "))
				pase="not_ok"
				
			except ValueError:
				print("Atención! Debe introducir un numero entero.")

		#	Se actualiza el valor
		lista[4][posicion]=peso_nuevo
		print(lista[4])





#	<=== Código ===>
while donete=="":
	option=busca_animal()

	if option.lower()=="pez":
		pez=modificaDatos(pez)
		donete="hola"
	elif option.lower()=="perro":
		perro=modificaDatos(perro)
		a=1
	elif option.lower()=="gato":
		gato=modificaDatos(gato)
		a=1
	elif option.lower()=="conejo":
		conejo=modificaDatos(conejo)
		a=1
