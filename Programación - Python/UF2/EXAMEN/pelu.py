#	<=== Variables ===>
llistatallats=[["raspall", 0], ["garson", 0], ["mao-tse", 0], ["punki", 0], ["kunki", 0]]
llistadia=[("mao-tse", 2), ("raspall", 5), ("raspall", 2), ("garson", 10), ("mao-tse", 6), ("kunki",3)]
llista=[]

#	<=== Funciones ===>
def perruqueria(llistatallats, llistadia):
	#	<--- Primero buscamos en la lista de las propinas --->
	for i in llistadia:

		#	<--- Luego comparamos los nombres con la lista de cortes de pelo --->
		for j in llistatallats:

			#	<--- Y finalmente, si están en la lista, se añaden --->
			if i[0]==j[0]:
				j[1]=j[1]+i[1]

	#	<--- Al final, se devuelve solo la lista de cortes de pelos, que será la lista definitiva --->			
	return llistatallats

#	<=== Código ===>
llista=perruqueria(llistatallats, llistadia)
print(llista)