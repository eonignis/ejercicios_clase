year=int(input("Escribe un año: "))
if (year%4 and year%100!=0) or year%400:
	print("Es bisiesto")
else:
	print("No es bisiest")