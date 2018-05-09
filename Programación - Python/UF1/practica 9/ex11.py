#Una frase predefinida para hacer pruebas:
#cadena="Esta frase contiene 1 dígito."
#cadena="Esta frase no contiene dígitos."
#print(cadena)
x=0
cadena=input("Escribe una frase inspiradora: ")
for i in cadena:
	if i.isdigit()==True:
		x=1
if x==1:
	print("La frase contiene algún dígito")
else:
	print("La frase no contiene ningún dígito")