#	<=== Archivos ===>
fichero=open("comandas.txt", "w")

#	<=== Variables ===>
catalogo = {"cafe": 2.5, "arros": 2.1, "sucre": 1.25}
comanda = [("llet", 6), ("sucre", 6), ("cafe", 2), ("caviar", 1)]

#	<=== Funciones ===>

def processacomanda(catalogo, comanda):
	pedido=[]
	#	Primero buscamos la key del catalogo
	for key in catalogo:
		#	 Luego buscamos el elemento dentro de la comanda
		for i in comanda:
			#	 Y comprobamos que coincidan ambos. Si coinciden, continuamos; si no, seguimos a lo nuestro. Dejamos la lista en blanco "local" aqui para así entrar al if con ella vacía.
			local=[]
			if key == i[0]:
				#	Ahora que pedido y el elemento del catalogo coinciden los añadimos a "local" y calculamos el total.
				local.append(str(key)+": ")
				total=catalogo[key]*i[1]
				
				#	Cuando obtenemos el total, lo añadimos todo a una lista.
				local.append(str(total))
				pedido.append(local)

	#	Ahora ordenamos la lista que tenemos.
	pedido=sorted(pedido, key=lambda ordenaduria: ordenaduria[0])

	#	Finalmente nos queda añadir los datos al fichero.
	loop=len(pedido)
	for i in range(loop):
		fichero.writelines(str(pedido[i]))
		fichero.writelines("\n")


#	<=== Código ===>

processacomanda(catalogo, comanda)
print("Su archivo ha sido actualizado")

#	<=== Cerramos archivos ===>
fichero.close()