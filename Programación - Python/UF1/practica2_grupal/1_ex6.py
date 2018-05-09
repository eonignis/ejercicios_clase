lista_crecimiento=[]
alturas=[]
primera_altura=[]
segunda_altura=[]
print("Anem a tomar l'alçada dels 10 alumnes.")
for i in range(10):
	toma1=float(input("Introdueix la primera alçada del alumne "+str(i+1)+": "))
	primera_altura.append(toma1)
alturas.append(primera_altura)
for i in range(10):
	toma2=float(input("Introdueix la segona alçada del alumne "+str(i+1)+": "))
	segunda_altura.append(toma2)
alturas.append(segunda_altura)
print("Aquesta és la llista d'altures introduides: ""\n",alturas)
for i in range(10):
	crecimiento=segunda_altura[i]-primera_altura[i]
	lista_crecimiento.append(crecimiento)
print("Aquesta es la llista del creixement que han tingut els alumnes: ",lista_crecimiento)