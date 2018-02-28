edat=int(input("Entra la teva edat: "))
sexe=input("Ets home o dona? ")
if edat<=15:
	print("S'aplicarà la vacuna tipus A")
elif edat>=71:
	print("S'aplicarà la vacuna tipus C")
elif edat==70:
	print("No es pot vacunar segons l'exercici, ho sento.")
else:
	if sexe=="Home" or "home":
		print("S'aplicarà la vacuna tipus A")
	else:
		print("S'aplicarà la vacuna tipus B")