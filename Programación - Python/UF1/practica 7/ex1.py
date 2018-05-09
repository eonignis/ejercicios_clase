import random
acierto=random.randrange(1,11)
num=15
while acierto!=num:
	num=int(input("Introdueix un número del 1 al 10: "))
	if num!=acierto:
		print("Error 404")
print("Acertaste!")