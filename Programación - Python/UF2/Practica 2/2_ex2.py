def poblacionsElevades(lp,a):	
	l=[]
	for i in lp:
		if i[1]>a:
			l.append(i[0])
	return l

lp=[["Gurb",563],["Cervera",548],["Balaguer",233],["Odena",421]]
a=int(input("Escriu l'altura que amb que s'ha de comparar: "))
x="s"
while x!="x":
	listapeq=[]
	p=input("Població: ")
	listapeq.append(p)
	p=int(input("Altura màxima de la població: "))
	listapeq.append(p)
	lp.append(listapeq)
	x=input("Vols continuar? (S/N): ")
	x=x.lower()
	if x=="n":
		x="x"
print(poblacionsElevades(lp,a))