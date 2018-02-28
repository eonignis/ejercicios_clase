
import funciones
import os

a=open("arxiu.txt",'r+')
while True:

	print(" Elaborat per: ")
	print(" M E N U P R I N C I P A L ")
	print(" ==============================")
	print(" A. Introduir un milionari nou des de Teclat. ")
	print(" B. Guardar milionari a disc ")
	print(" C. Mostrar per pantall la informació de tots els Milionaris. ")
	print(" D. Mostra milionari més ric ")
	print(" E. Modificar la informació d'un milionari ")
	print(" X. Sortir del Programa ")

	opcio=str(input(" Introdueixi opcio: "))
	opcio=opcio.upper()


	if opcio=="A":
		os.system('clear')
		mill=funciones.A()
		os.system('clear')
		
	elif opcio=="B":
		try:
			mill=funciones.B(mill)
		except:
			print("No has introduit milionari.")
		input()
		os.system('clear')

	elif opcio=="C":
		os.system('clear')
		funciones.C()
		input()
		os.system('clear')

	elif opcio=="D":
		os.system('clear')
		funciones.D()
		input()
		os.system('clear')

	elif opcio=="E":
		os.system('clear')	
		funciones.E()
		input()
		os.system('clear')


	elif opcio=="X":
		sortir=str(input("Segur que vols sortir del programa? (S per sortir): "))
		sortir=sortir.upper()
		if sortir=="S":
			break
		else:
			os.system('clear')
a.close()