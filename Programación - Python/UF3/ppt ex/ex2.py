#	Abrimos los archivos
senars=open("senars.txt","r")
parells=open("parells.txt","r")
new=open("1a100.txt","w")

i=1
while i<=50:
	#	Leemos y añadimos con senars y luego parells
	num=senars.readline()
	new.write(num)
	num=parells.readline()
	new.write(num)

	i+=1


#	Cerramos los archivos
senars.close()
parells.close()
new.close()