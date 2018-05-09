#	<=== Variables ===>
numero=0

#	<=== Funciones ===>
def inverter(numero):
	if numero==0:
		return ""
	else:
		return str(numero%10) + inverter(numero//10)

def enter_num():
	num=int(input("Entra un número: "))
	return num

#	<=== Codigo ===>
numero=enter_num()
print(inverter(numero))