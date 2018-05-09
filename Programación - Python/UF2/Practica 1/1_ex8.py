#	<=== Variables ===>
bisiestos=0
year=0
newyear=0
diferencia=0
lista=[]


#	<=== Funciones ===>
def the_bisiesto(a,b):
	bisiestos=0
	lista=[]
	diferencia=(b-a)+1
	lista.append(diferencia)
	while a<=b:
		if a%4==0 and (a%100!=0 or a%400==0):
			bisiestos=bisiestos+1
		a+=1
	lista.append(bisiestos)
	return lista


#	<=== Código ===>
print("Comptador d'anys de traspàs.")
year=int(input("Escriu un any: "))
newyear=int(input("Escriu un any posterior a "+str(year)+": "))
while newyear<year:
	newyear=int(input(str(newyear)+" no és posterior a "+str(year)+", torna a intentar-ho: "))

lista=the_bisiesto(year,newyear)


#	<=== Finalizamos el programa ===>
print("De ",year," a ",newyear," hi han ", lista[0]," anys, y ",lista[1]," anys són de traspàs.")

