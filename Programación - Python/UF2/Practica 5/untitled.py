#	<=== Variables ===>
numero=1234

#	<=== Funciones ===>
def multiplica_lista(accion):
	if accion==0:
		return 0
	else:
		return accion%10 + multiplica_lista(accion//10)

#	<=== Codigo ===>
print(multiplica_lista(numero))