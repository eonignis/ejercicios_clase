"""edad=int(input("Escribe tu edad: "))
print("Tienes carnet de estudiante? S/N")
carnet=input()
preu1=2
preu2=10
preu3=25
if edad<3:
	preu=preu1
	print("La entrada son",preu1,"€")
elif edad>=3 and edad<10:
	preu=preu2
	print("La entrada son",preu2,"€")
else:
	preu=preu3
	print("La entrada son",preu3,"€")
if carnet=="S" or "SI":
	preu=preu*0.9
	print("Pero con el descuento te sale a",preu,"€")"""



edad=int(input("Escribe tu edad: "))
print("Tienes carnet de estudiante? S/N")
carnet=input()
preu=0
if edad<3:
	preu=2
elif edad>=3 and edad<10:
	preu=10
else:
	preu=25
if carnet=="S" or "SI":
	preu=preu*0.9
print("El preu de la teva entrada serà de: ",preu,"€")
