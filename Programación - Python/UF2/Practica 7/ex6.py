#	<=== Variables ===>
num=0

#	<=== Funciones ===>
def efe_de_equis(x):
	if x==1:
		return 1
	else:
		return (x**2)+efe_de_equis(x-1)

#	<=== Codigo ===>
num=int(input("Introdueix un número: "))
print(efe_de_equis(num))