print("Introduce día, mes y año")
dia=int(input())
mes=int(input())
year=int(input())
'''print("Introduce la hora, minutos y segundos")
hora=int(input())
minuto=int(input())
segundo=int(input())
segundo=segundo+1
if segundo>59:
	segundo=00
	minuto=minuto+1
if minuto>59:
	minuto=00
	hora=hora+1
if hora>23:
	hora=00
	dia=dia+1'''
if dia>28 and mes==2:
	dia=1
	mes=mes+1
if dia>31 and mes==1 or 3 or 5 or 7 or 8 or 10 or 12:
	dia=1
	mes=mes+1
if dia>30 and mes==4 or 6 or 9 or 11:
	dia=1
	mes=mes+1
if mes>12:
	mes=1
	year=year+1
print(dia,"-",mes,"-",year,sep=("")  )
#print(hora,":",minuto,":",segundo,sep=(""))