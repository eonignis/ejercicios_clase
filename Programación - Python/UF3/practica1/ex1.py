f=open("text.txt","w")

lineas=int(input("Cuantas lineas de texto? "))

for i in range(lineas):
	f.writelines("Linea"+str(i+1)+"\n")

f.close()