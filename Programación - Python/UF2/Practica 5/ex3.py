#	<=== Variables ===>
numero=0

#	<=== Funciones ===>
def multiplica_lista(accion):
	if accion==0:
		return 0
	else:
		return accion%10 + multiplica_lista(accion//10)

def enter_num():
	num=int(input("Entra un número: "))
	return num
#	<=== Codigo ===>
numero=enter_num()
print(multiplica_lista(numero))