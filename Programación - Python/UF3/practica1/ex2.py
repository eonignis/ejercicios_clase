lectura=open("text.txt","r")
escritura=open("portal.txt","w")


texto=lectura.read()
escritura.write(texto)


lectura.close()
escritura.close()