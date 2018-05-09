f1=open("arxiu1.txt","r")
f2=open("arxiu2.txt","r")

lista=f1.readlines()
posicion=f2.readlines()
for i in posicion:
	i=int(i)-1
	print(lista[i])


f1.close()
f2.close()