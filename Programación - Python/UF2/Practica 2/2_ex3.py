def mesGransQue(l,n):
	total=0
	for i in l:
		if i>n:
			total+=1
	return total
x="s"
print("Escriu el elements de la llista: ")
l=[]
while x!="x":
	num=int(input())
	l.append(num)
	x=input("Vols continuar? (S/N): ")
	x=x.lower()
	if x=="n":
		x="x"
n=int(input("A parti de quine número que vols buscar?: "))
print(mesGransQue(l,n))