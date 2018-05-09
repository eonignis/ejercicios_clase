import random
import os
cpu=0
pl=0
r=0
while cpu==pl:
	cpu=random.randrange(1,4)
	print("Tria una de les opcions per jugar:")
	print("1. Pedra")
	print("2. Tisores")
	print("3. Paper",end=("\n\n"))
	pl=int(input())
	if cpu==1 and pl==3:
		r=1
	elif cpu==2 and pl==1:
		r=1
	elif cpu==3 and pl==2:
		r=1
	if pl==cpu:
		os.system("clear")
os.system("clear")1
if r==1:
	print("Has guanyat!")
else:
	print("Has perdut :(")