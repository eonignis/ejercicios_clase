#	<=== Variables ===>
num=0

#	<=== Funciones ===>
def prints_sucesivos(counter,finisher):
	if counter==finisher:
		return print(counter)
	else:
		print(counter)
		return prints_sucesivos(counter+1,finisher)

#	<=== Codigo ===>
num=int(input("Introdueix un número: "))
prints_sucesivos(1,num)