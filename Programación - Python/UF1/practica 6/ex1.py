n=-1
i=1
while n<0:
	n=int(input("Quants valors va a introduir? "))
	if n<0:
		print ("Impossible!")
num1=int(input("Escriu un nombre: "))
num2=num1
while i<=n:
	num2=int(input("Escriu un nombre diferent de "+str(num2)+":"))
	while num1==num2:
		print (num1," no és diferent de ",num2,"!")
		num2=int(input("Escriu un nombre diferent de "+str(num2)+":"))
	i+=1
print ("Gràcies per la seva col·laboració")