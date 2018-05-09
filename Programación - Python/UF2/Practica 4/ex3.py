#	<=== Variables ===>
word=""
res=False

#	<=== Funciones ===>
def alfabeticrastico(palabra):
	anterior=""
	for i in palabra:
		if anterior!="":
			if i.lower()<anterior.lower():
				return False
		anterior=i
	return True

#	<=== Código ===>
word=input("Escribe una palabra para saber si es alfabética o no: ")
res=alfabeticrastico(word)

if res==True:
	print("La palabra es alfabética.")
else:
	print("La palabra NO es alfabética :(")
