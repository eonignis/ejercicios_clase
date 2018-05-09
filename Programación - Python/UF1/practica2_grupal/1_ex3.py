correcto=""
numero=0

while numero<=1:
    numero = int(input("Dígame cuántos nombres tiene la lista: "))
    if numero <= 1:
        print("¡Imposible!")

lista_mujeres = []
lista_hombres = []
for i in range(numero):
    print("Dígame el nombre", str(i + 1) + ": ", end="")
    palabra = input()
    correcto=""
    while correcto!="ok":
        print("Digame su sexo (hombre o mujer): ")
        sexo=input()
        if sexo.lower()=="mujer":
            lista_mujeres.append(palabra)
            correcto="ok"
        elif sexo.lower()=="hombre":
            lista_hombres.append(palabra)
            correcto="ok"
        else:
            print("Lo ha indicado mal!")
print("La lista creada de mujeres es:", lista_mujeres)
print("La lista creada de hombres es:", lista_hombres)


correcto=""
#Se indica la posición de manera visual, nombrando la posicion de la lista sin tener en cuenta que en python empieza en la posición 0
PM=int(input("A partir de qué nombre de mujeres quieres empezar? "))
PM-=1
PH=int(input("A partir de qué nombre de hombres quieres empezar? "))
PH-=1
nombreM=lista_mujeres[PM:len(lista_mujeres)]
nombreH=lista_hombres[PH:len(lista_hombres)]

while correcto=="":
    NM=int(input("Cantidad de nombres que quieres mostrar para las mujeres? "))
    if NM>len(nombreM):
        print("Demasiados nombres! Pide menos :(")
    else:
        correcto="ok"
correcto=""
while correcto=="":
    NH=int(input("Cantidad de nombres que quieres mostrar para los hombres? "))
    if NH>len(nombreH):
        print("Demasiados nombres! Pide menos :(")
    else:
        correcto="ok"

print("Estimat",end=" ")
i=1
while i<=NM:
    i-=1
    print(nombreM[i],end=", ")
    i+=2
print("m'alegro de veure't")

print("Estimat",end=" ")
i=1
while i<=NH:
    i-=1
    print(nombreH[i],end=", ")
    i+=2
print("m'alegro de veure't")