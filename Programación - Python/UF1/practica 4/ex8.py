num=int(input("Dona'm un número: "))
print("Els divisors de ",num,"són: ",end=(" "))
i=1
while i<=num:
	if num%i==0:
		print(i,end=(" "))
	i+=1