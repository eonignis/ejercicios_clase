#	<=== Variables ===>
notas=[5.0, 4.3, 6.3, 6.9, 8.5, 3.5]
aprobado=0

#	<=== Funciones ===>
def aprovats_mes50(notas):
	aprobado=0
	for i in notas:
		if i>=5:
			aprobado+=1
	if aprobado>=(len(notas)/2):
		return True
	else:
		return False

#	<=== Código ===>

resultado=aprovats_mes50(notas)

#	<=== Fin del programa ===>
print(notas)
print(resultado)