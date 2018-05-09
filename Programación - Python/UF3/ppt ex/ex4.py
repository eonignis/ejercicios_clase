f=open("persones.txt","r")

informacio=f.readline()

while informacio!="":
	lista=informacio.split(" - ")
	
	
	if int(lista[3])>=18:
		print(lista[0],lista[1],"es mayor de edad")
	else:
		print(lista[0],"no es mayor de edad")
	
	informacio=f.readline()

f.close()