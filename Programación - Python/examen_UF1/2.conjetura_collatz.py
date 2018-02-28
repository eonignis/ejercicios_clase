c=1
while c==1:
	numero=int(input("Entra un número: "))
	if numero==1:
		print("S'ha d'introduir un nombre més gran per poder confirmar la conjetura de Collatz!")
	else:
		print("Succesió generada: ",numero,end="")
		while numero!=1:
			if numero%2==0:
				numero=numero/2
				print(", ",int(numero),end="")
			else:
				numero=(numero*3)+1
				print(", ",int(numero),end="")
			if numero==1:
				print(".")
	print("Vol altra seqüència? Si/No? ",end="")
	resposta=input("")
	if resposta=="No" or "no" or "NO":
		c=9
print("Fins la propera!!!")