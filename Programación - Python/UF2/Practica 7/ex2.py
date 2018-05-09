#	<=== Variables ===>
num1=0
num2=0

#	<=== Funciones ===>
def MCD(a,b):
	c=a//b
	r=a%b
	if r==0:
		return b
	elif c==1:
		return r
	else:
		return MCD(c,r)


#	<=== Codigo ===>
num1=int(input("Introdueix un número: "))
num2=int(input("Introdueix un número: "))

if num1>num2:
	print(MCD(num1,num2))
else:
	print(MCD(num2,num1))