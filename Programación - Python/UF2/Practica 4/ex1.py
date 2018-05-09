#	<=== Imports ===>
import os

#	<=== Variables ===>
c=0
n=0

#	<=== Funciones ===>
def tres_linies():
	print("","\n","","\n","")

def nou_linies():
	for i in range(3):
		tres_linies()

def neteja_pantalla():
	for i in range(2):
		tres_linies()
	for i in range(2):
		nou_linies()
	print("")
	input("Limpia la pantalla")
	os.system("clear")

def concatena_n_vegades(c,n):
	for i in range(n):
		print(c)

#	<=== Código ===>
neteja_pantalla()
print("-Hasta aqui habían lineas en blanco")
input()
tres_linies()
print("-Hasta aqui habían lineas en blanco")
input()
nou_linies()
print("-Hasta aqui habían lineas en blanco")
input()
c=input("Qué cadena quieres mostrar por pantalla? ")
n=int(input("Cuantas veces quieres repetir la cadena? "))
concatena_n_vegades(c,n)


#	<=== Comentarios del ejercicio ===>
"""Primero disponemos el ejercicio tal como nos indica que creemos las funciones.
Después pasamos "neteja_pantalla" al inicio del programa, printa las lineas en blanco y luego limpia la pantalla."""