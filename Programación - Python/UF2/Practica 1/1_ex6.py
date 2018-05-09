def generar_n_caracters(numero, caracter):
	resultado = numero * str(caracter)
	return resultado

numero = int(input("Dame un numero entero: "))
caracter = input("Dame un caracter: ")
print(generar_n_caracters(numero, caracter))



