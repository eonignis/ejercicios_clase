correcto=1
day=0
month=0
year=0
while correcto==1:
	correcto=0
	day=int(input("Introdueix el dia: "))
	if day<1 or day>31:
		correcto=1
	month=int(input("Introdueix el mes: "))
	if month<1 or month>12:
		correcto=1
	year=int(input("Introdueix l'any: "))
	if year<1900 or year>2018:
		correcto=1

dia="0"
if day<10:
	dia+=str(day)
else:
	dia=str(day)

mes="0"
if month<10:
	mes+=str(month)
else:
	mes=str(month)

num=dia+mes+str(year)
while int(num)>=10:
	suma=0
	for i in num:
		suma+=int(i)
		num=str(suma)
print (suma)