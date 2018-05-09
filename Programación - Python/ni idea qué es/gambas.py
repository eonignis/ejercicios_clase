import os
print ("Escribe el numero de comensales")
comensales=int(input())
os.system('clear')
print ("Escribe cuanto vale el KG de arroz")
arroz=float(input())
os.system('clear')
print ("Escribe cuanto vale el KG de gambas")
gambas=float(input())
arroz_persona=comensales*125
gambas_persona=comensales*62.5
arroz_eur=(arroz/1000)*arroz_persona
gambas_eur=(gambas/1000)*gambas_persona
coste=arroz_eur+gambas_eur
os.system('clear')
print ("Necesitarás",arroz_persona, "gramos de arroz,", gambas_persona, "gramos de gambas, y costará", coste, "€.")