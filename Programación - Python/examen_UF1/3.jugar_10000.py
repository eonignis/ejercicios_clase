import random
print("Quants jugadors hi jugarán? ")
players=int(input())
i=1
puntsplayer=0
puntsmaquina=0
c=1
while c==1:
#1 sol jugador
	if players==1:
		play=1
		while play==1:
			torn=input("Premi qualsevol tecla per començar el torn.")
			while i<=1:
				dau1=random.randrange(1,7)
				dau2=random.randrange(1,7)
				dau3=random.randrange(1,7)
				if dau1==1 and dau2==1 and dau3==1:
					puntsplayer+=1000
				elif dau1==dau2 and dau1==dau3:
					puntsplayer+=dau1*100
				elif dau1==1 or dau2==1 or dau3==1:
					puntsplayer+=100
				elif dau1==5 or dau2==5 or dau3==5:
					puntsplayer+=50
				elif dau1%2==0 and dau2%2==0 and dau3%2==0:
					if dau1!=dau2 and dau2!=dau3 and dau1!=dau3:
						puntsplayer-=1000
				else:
					puntsplayer+=dau1+dau2+dau3
				print("Punts totals del jugador: ",puntsplayer)
				i+=1
			i=1
			while i<=1:
				dau1=random.randrange(1,7)
				dau2=random.randrange(1,7)
				dau3=random.randrange(1,7)
				if dau1==1 and dau2==1 and dau3==1:
					puntsmaquina+=1000
				elif dau1==dau2 and dau1==dau3:
					puntsmaquina+=dau1*100
				elif dau1==1 or dau2==1 or dau3==1:
					puntsmaquina+=100
				elif dau1==5 or dau2==5 or dau3==5:
					puntsmaquina+=50
				elif dau1%2==0 and dau2%2==0 and dau3%2==0:
					if dau1!=dau2 and dau2!=dau3 and dau1!=dau3:
						puntsmaquina-=1000
				else:
					puntsmaquina+=dau1+dau2+dau3
				print("Punts totals de la màquina: ",puntsmaquina)
				i+=1
			i=1
			if puntsmaquina>=10000:
				print("Ha guanyat la màquina!")
				play=646
			if puntsplayer>=10000:
				print("Ha guanyat el jugador! Enhorabona!")
				play=646


#Més de dos jugadors				
	else:
		while puntsplayer<10000:
			torn=input("Premi qualsevol tecla per començar el torn.")
			for h in range (players):
				print("Torn del jugador ",h+1)
				dau1=random.randrange(1,7)
				dau2=random.randrange(1,7)
				dau3=random.randrange(1,7)
				if dau1==1 and dau2==1 and dau3==1:
					puntsplayer+=1000
				elif dau1==dau2 and dau1==dau3:
					puntsplayer+=dau1*100
				elif dau1==1 or dau2==1 or dau3==1:
					puntsplayer+=100
				elif dau1==5 or dau2==5 or dau3==5:
					puntsplayer+=50
				else:
					puntsplayer+=dau1+dau2+dau3
				print("Punts totals: ",puntsplayer)

#Saber si el jugador vol continuar o no
	print("Vol altra seqüència? Si/No? ",end="")
	resposta=input("")
	if resposta=="No" or "no" or "NO":
		c=9
	else:
		c=1
print("Programa acabat. Fins la propera!")