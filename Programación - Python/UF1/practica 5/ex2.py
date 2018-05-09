correcto=1
while correcto==0:
	a=int(input("Introdueix base: "))
	b=int(input("Introdueix exponent: "))
	if a>=0 and b>=0:
		correcto=1
r=a**b
print ("El resultat del número ",a," multiplicat ",b,"vegades és: ",r)