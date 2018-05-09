lista=[2.3, 5.6, 7.2, 5.0, 3.0, 2.1]
#a
print(lista)

#b
lista.reverse()
print(lista)
lista.reverse()

#c
lista[2]=6
print(lista)

#d
num=int(input("Introduce un numero: "))
lista[3]=num
print(lista)

#e
print(lista[1:len(lista):2])

#f
print(lista[0:len(lista):2