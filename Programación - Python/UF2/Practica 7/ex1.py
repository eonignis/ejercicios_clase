#	<=== Variables ===>
num=0

#	<=== Funciones ===>
def suma_par(n):
	if n==2:
		return 2
	else:
		if n%2==0:
			return n+suma_par(n-2)
		else:
			return n+suma_par(n-1)

#	<=== Codigo ===>
num=int(input("Introdueix un numero: "))
print(suma_par(num))