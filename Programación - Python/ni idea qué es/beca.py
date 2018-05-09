edad=int(input("Introduce tu edad: "))
ingresos=float(input("Introduce tus ingresos familiares: "))
hermanos=int(input("Introduce el numero de hermanos: "))
limit1=(hermanos*5700)+500
beca=0
if ingresos<=limit1:
	beca=4000*((hermanos*5700)+500-ingresos)/((hermanos*5700)+500)
elif ingresos>limit1 and hermanos>4:
	beca=150
else:
	beca=0
if edad<18:
	beca=beca*1.1
print("La teva beca será: ",beca)