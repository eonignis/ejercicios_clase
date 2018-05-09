print("Introduce tu nota", end=(" "))
nota=float(input())
if nota>=0 and nota<5:
	print("Has suspendido")
elif nota>=5 and nota<7:
	print("Aprobaste, cabron")
elif nota>=7 and nota<9:
	print("Casi sacas un excelente, pringado")
elif nota>=9 and nota<=10:
	print("Has copiado, fijo")
else:
	print("Tanta verguenza te da tu nota?")
print("Fucking bye")
