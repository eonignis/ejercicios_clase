#	<=== Ficheros ===>
fichero1=open("tablets.txt", "r")
fichero2=open("baratos.txt", "w")

#	<=== Variables ===>
preuMinim=0

#	<=== Funciones ===>
def tabletsBarats (nomfichero1, nomfichero2, precio):
	lista=nomfichero1.readlines()
	for i in lista:
		linea=i
		linea=linea.rstrip("\n")
		linea=linea.split(";")
		linea[-1]=float(linea[-1])
		linea[-2]=int(linea[-2])

		if linea[-1]<precio:
			palabra=linea[0][0:3]+" - "+linea[1]
			if linea[-2]<500:
				palabra=palabra+" Baja\n"
			elif linea[-2]>=500 and linea[-2]<=900:
				palabra=palabra+" Media\n"
			else:
				palabra=palabra+" Alta\n"
			nomfichero2.write(palabra)

#	<=== Código ===>
preuMinim=float(input("Introduce un precio mínimo: "))
tabletsBarats(fichero1, fichero2, preuMinim)