fichero1=open("persones.txt", "r")
fichero2=open("persones_v2.txt", "w")

caracter=fichero1.read(1)
while caracter!="":
	if caracter>="a" and caracter<="z" or caracter>="A" and caracter<="Z":
		num=(ord(caracter)+13)%26
		fichero2.write(chr(num))
	caracter=fichero1.read(1)
	print(caracter)

fichero1.close()
fichero2.close()




"""
Para saber el código ascii de una letra o viceversa es:
ord(-letra-) -> esto nos devuelve el numero ascii de la letra
chr(-numero) -> esto nos devuelve qué letra es el número introducido
"""