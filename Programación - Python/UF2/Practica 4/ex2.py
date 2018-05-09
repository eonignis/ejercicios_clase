#	<=== Variables ===>
dineros=0

#	<=== Funciones ===>
def money_calculator(dineros):
	if dineros>=500:
		print("Necesitarás ",int(dineros/500)," billete/s de 500€.")
		dineros=dineros%500
	if dineros>=200:
		print("Necesitarás ",int(dineros/200)," billete/s de 200€.")
		dineros=dineros%200
	if dineros>=100:
		print("Necesitarás ",int(dineros/100)," billete/s de 100€.")
		dineros=dineros%100
	if dineros>=50:
		print("Necesitarás ",int(dineros/50)," billete/s de 50€.")
		dineros=dineros%50
	if dineros>=20:
		print("Necesitarás ",int(dineros/20)," billete/s de 20€.")
		dineros=dineros%20
	if dineros >=10:
		print("Necesitarás ",int(dineros/10)," billete/s de 10€.")
		dineros=dineros%10
	if dineros>=5:
		print("Necesitarás ",int(dineros/5)," billete/s de 5€.")
		dineros=dineros%5
	if dineros>=2:
		print("Necesitarás ",int(dineros/2)," moneda/s de 2€.")
		dineros=dineros%2
	if dineros>=1:
		print("Necesitarás ",int(dineros)," moneda/s de 1€.")

#	<=== Código ===>
dineros=float(input("Introduce la cantidad de dinero que quieres calcular: "))
money_calculator(dineros)