
def A():
	a=input("Introdueix el nom del milionari: ")
	x=int(input("Introdueix la seva edat: "))
	b=int(input("Quantes accions té en MicroSopa? "))
	c=int(input("Quantes accions té en AireTel? "))
	d=int(input("Quantes accions té en AmenizaDos? "))
	e=int(input("Quantes accions té en IbemePorUvas? "))
	f=int(input("Quantes accions té en MacChiton? "))
	
	mill=[a,x,b,c,d,e,f]
	print(mill[0]+'\t'+str(mill[1])+'\t'+str(mill[2])+'\t'+str(mill[3])+'\t'+str(mill[4])+'\t'+str(mill[5])+'\t'+str(mill[6])+'\n')
	return mill
	
def B(mill):
	a.seek(0,2)
	a.write(mill[0]+'\t'+str(mill[1])+'\t'+str(mill[2])+'\t'+str(mill[3])+'\t'+str(mill[4])+'\t'+str(mill[5])+'\t'+str(mill[6])+'\n')

def C():
	a.seek(0)
	print(a.read())

def D():
	

def E():
	c()
	linia=int("Quina empresa vols modificar?: ")
	a.seek()
	cont=1
	lin=a.readline()
	while cont!=linia:
		cont+=1
		lin=a.readline()
	if linia==cont:

		a()
		b()
	else:
		print("Empresa no trobada.")


