#	<=== Variables ===>
numero=0

#	<=== Funciones ===>
def enter_num():
	num=int(input("Entra un número: "))
	return num


def funcion(numero):
	if numero==1:
		return "1"
	else:
		return "1+"+funcion(numero-1)


#	<=== Codigo ===>
numero=enter_num()
print(funcion(numero))