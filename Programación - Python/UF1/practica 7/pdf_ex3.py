import random
peticion=int(input("Quants números vols veure? "))
final=int(input("Fins a quin número vols veure? "))
for i in range(peticion):
	print(random.randrange(2,final,2))