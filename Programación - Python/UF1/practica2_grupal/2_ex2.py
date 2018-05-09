#Febrero funciona, el resto de meses solo pasan de mes pero no suman días.
day=int(input("Quin día és? "))
month=int(input("Quin mes és? "))
year=int(input("Quin any és? "))

endmonth=(31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

#Cambiamos el año.
if day==31 and month==12:
	day=1
	month=1
	year+=1
else:
#Mes de febrero, mirar si es bisiesto.
	if month==2 and (year%4==0 and (year%100!=0 or year%400==0)):
		if day==29:
			day=1
			month+=1
		else:
			day=1
			month+=1
	elif month!=2:
		#Mirar si es Enero, Marzo, Mayo, Julio, Agosto, Octubre o Diciembre.
		for i in endmonth:
			if month==i:
				day=1
				month+=1

	else:
		day+=1


date=(day,month,year)
print(date)
"""
	mes31=[01,03,05,07,int("08"),10,12]
	mes30=[04,06,int("09"),11]"""
