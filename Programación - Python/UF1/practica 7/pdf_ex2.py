import random
eleccio=int(input("Escriu quants números vols generar: "))
for i in range (eleccio):
	i=random.randrange(2,101,2)
	print(i)