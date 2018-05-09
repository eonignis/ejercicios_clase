cognom = []
count = 0
while (count < 1):	
	nombre = input("Introduce tu nombre: ")
	apellido = input("Introduce tu primer apellido: ")
	apellido2 = input("Introduce tu inicial del segundo apellido: ")
	cognom.append([nombre,apellido,apellido2])
	count = count + 1
for i in range(0,count):
	print(cognom[i][1],"",cognom[i][2],".",cognom[i][0])