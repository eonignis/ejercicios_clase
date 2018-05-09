lista=[]

def llegirPersona():
	nom=input("Nombre: ")
	apellido=input("Apellido: ")
	dni=input("NIF: ")
	edad=input("Edad: ")
	altura=input("Altura: ")

	lista=[nom,apellido,dni,edad,altura]
	escriurePersonaADisc(lista)


def escriurePersonaADisc(persona):
	f=open("persones.txt","a")
	f.writelines(persona[0]+' - '+persona[1]+' - '+persona[2]+' - '+str(persona[3])+' - '+str(persona[4])+'\n')
	f.close()

option="yes"
while option=="yes":
	llegirPersona()

	eleccion=input("Quieres continuar? Si/No	")
	if eleccion.lower()=="no" or eleccion.lower()=="n":
		option="no"