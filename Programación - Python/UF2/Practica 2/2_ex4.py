def pics(l):
	total=0
	for i in range(len(l)):
		if i==(len(l)-2):
			break;
		if l[i]<l[i+1] and l[i+1]>l[i+2]:
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
print(pics(l))

