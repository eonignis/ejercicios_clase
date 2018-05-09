import random
a=0
b=0
opcio="s"
wins=0
lost=0
while a==b:
	a=random.randint(1,20)
	b=random.randint(1,20)
while opcio=="s":
	eleccio=input("Apostes per A o per B? ")
	print("A treu un ",a,"i B treu un ",b)
	if a>b and eleccio=="a":
		print("HAS GUANYAT!")
		wins+=1
	elif b>a and eleccio=="b":
		print("HAS GUANYAT!")
		wins+=1
	else:
		print("HAS PERDUT :(")
		lost+=1
	opcio=input("Has guanyat "+str(wins)+" partides i has perdut "+str(lost)+" partides. Vols continuar apostant? S/N")
print("Adeu")