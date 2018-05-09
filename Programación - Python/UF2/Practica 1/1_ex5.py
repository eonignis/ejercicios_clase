#	<=== Variables ===>
procediment=[]
i=1
total=0
histograma=0

#	<--- Si no quieres introducir datos, tienes esta lista que debes descomentar --->
#procediment=[4,9,7]

#	<=== Funciones ===>
def histogramizador(procediment):
	for i in procediment:
		print ("*"*i)

#	<=== Código ===>

#	<--- Si elegiste la lista preconfigurada, debes comentar esta parte del código --->
total=int(input("Cuantos elementos quieres mostrar por pantalla? "))
while i<=total:
	numero=int(input("Dinos ahora el número a analizar! "))
	procediment.append(numero)
	i+=1
#	<--- *Hay que comentar hasta esta parte --->


#	<=== Ahora usamos la función y finalizamos el programa ===>
histogramizador(procediment)