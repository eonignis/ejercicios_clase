#	<=== Archivos ===>
archivo_lectura=open("log.txt", "r")
archivo_escritura=open("state.txt", "w")

#	<=== Variables ===>
fulldata=[]
llindar=50

#	String de ejemplo 1
el_string="42:45:50:47"

#	String de ejemplo 2
el_string2="45:50:49:52"


#	<=== Funciones ===>

#	Ejercicio A
def sotallindar(string, llindar):
	llista=[]
	#	Separamos todo según los :
	llista=string.split(":")

	#	Recorremos la lista creada ahora y comprobamos con el int de la i a ver si coincide con el llindar o no
	for i in llista:
		if int(i)>llindar:
			#	Si coincide se devuelve True
			return False

	#	Si nunca llega a coincidir, al final devolverá False
	return True

#	Ejercicio B
def seleccionats(archivo_lectura, llindar):
	data=[]
	dades=[]
	archivo_lectura.seek(0)
	#	Primero insertaremos todos los datos dentro de una lista
	i= archivo_lectura.readline()
	while i!="":
		#	Entramos la linea 
		data=i.split("&")
		data[-1]=data[-1].rstrip("\n")
		data.remove(data[1])

		if sotallindar(data[1], llindar) == True:
			archivo_escritura.write(data[0]+"\n")

		#	Aumentamos el contador
		i= archivo_lectura.readline()

	print("Ya se han seleccionado los candidatos aptos.")

#	<=== Código ===>
seleccionats(archivo_lectura, llindar)


#	<=== Cerramos archivos ===>
archivo_lectura.close()
archivo_escritura.close()