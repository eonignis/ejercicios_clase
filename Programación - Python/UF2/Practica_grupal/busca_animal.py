import os

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

opcion=busca_animal()
print(opcion)