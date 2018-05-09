copia=0
print("REPETICIONS",end=("\n\n"))
num1=int(input("Escriu un número enter: "))
inscriure=int(input("Quants números va a inscriure? "))
for i in range(inscriure):
	repeticio=int(input("Escriu un número enter: "))
	if repeticio==num1:
		copia+=1
if copia==inscriure/2:
	print("Ha escrit tantes vegades el número ",num1," com la resta de números")
elif copia<inscriure/2:
	print ("Ha escrit menys vegades el número ",num1," que la resta de números")
else:
	print("Ha escrit més vegades el número ",num1," que la resta de números")