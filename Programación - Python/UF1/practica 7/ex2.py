import random
acierto=random.randrange(1,101)
i=1
num=-1
while acierto!=num:
	num=int(input("Introdueix un número del 1 al 100: "))
	if num==acierto:
		break;
	else:
		print("Error 404")
	if num<acierto:
		print("El número a acertar és més gran")
	else:
		print("El número a acertar és més petit")
	i+=1
	if i==6:
		acierto=num
print("¡Se acabó!")