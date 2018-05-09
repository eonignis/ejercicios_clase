def superposicio(a, b):
	sup=0
	for i in a:
		for j in b:
			if i==j:
				sup=True
				break;
	if sup==0:
		sup=False
	return sup
x="s"
print("Escriu el elements de la llista 1")
a=[]
while x!="x":
	p=input()
	p=p.lower()
	a.append(p)
	x=input("Vols continuar? (S/N): ")
	x=x.lower()
	if x=="n":
		x="x"
x="s"
print("\nEscriu el elements de la llista 2")
b=[]
while x!="x":
	p=input()
	p=p.lower()
	b.append(p)
	x=input("Vols continuar? (S/N): ")
	x=x.lower()
	if x=="n":
		x="x"

print("\n",superposicio(a,b))
