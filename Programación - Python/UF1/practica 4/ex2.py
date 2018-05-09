num=1
i=0
while num%10!=0:
	num=int(input("Escriu un numero multiple de 10: "))
while num%10==0:
	num=num/10
	i+=1
print(num," per 10 elevat a ",i)