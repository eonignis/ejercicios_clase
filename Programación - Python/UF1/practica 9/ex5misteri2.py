#Misteri 2
from math import ceil
#ceil redondea a la alza
grados=float(input("Dame un angulo (en grados): "))
cuadrante=int(ceil(grados)%360)/90
#Un círculo es un angulo de 360, y según el grado que introduzcamos nos indicará en qué cuadrante está
if cuadrante==0:
#Este cuadrante es del angulo 0 al angulo 90
	print("primer cuadrante")
if cuadrante==1:
#Este cuadrante es del angulo 91 al angulo 180
	print("segundo cuadrante")
#Este cuadrante es del angulo 181 al angulo 270
if cuadrante==2:
	print("tercer cuadrante")
#Este cuadrante es del angulo 271 al angulo 360
if cuadrante==3:
	print("cuarto cuadrante")