#Una frase predefinida para hacer pruebas:
#cadena="HOLA muy BUENOS días TENGA usted."
#print(cadena)
cadena=input("Escribe una frase inspiradora: ")
print("Las letras mayusculas son: ")
for i in cadena:
	if i.isupper()==True:
		print(i,end=" ")
