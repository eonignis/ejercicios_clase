password=999999999999
i=0
while password!="hola" and i<5:
	password=input("Escribe la contraseña: ")
	i+=1
if i==5:
	print("Acceso denegado")
else:
	print("Lo lograste")