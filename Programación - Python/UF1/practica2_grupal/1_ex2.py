numero = int(input("Dígame cuántos nombres tiene la lista: "))

if numero < 1:
    print("¡Imposible!")
else:
    lista = []
    for i in range(numero):
        print("Dígame la palabra", str(i + 1) + ": ", end="")
        palabra = input()
        lista.append(palabra)
    print("La lista creada es:", lista)
    print("A partir de qué nombre quieres empezar?")
    #Se indica la posición de manera visual, nombrando la posicion de la lista sin tener en cuenta que en python empieza en la posición 0
    P=int(input())
    P-=1
    print("Cantidad de nombres que quieres mostrar?")
    N=int(input())
    nombre=lista[P:len(lista)]
    print("Estimat",end=" ")
    i=1
    while i<=N:
        i-=1
        print(nombre[i],end=", ")
        i+=2
    print("m'alegro de veure't")