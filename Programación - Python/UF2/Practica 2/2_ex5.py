def aprovats_mes50(l):
	apro=0
	sus=0
	for i in(l):
		if i>=5:
			apro+=1
		else:
			sus+=1
	if apro>=sus:
		return True
	else:
		return False

x="s"
print("Escriu les notes:")
l=[]
while x!="x":
	num=float(input())
	l.append(num)
	x=input("Vols continuar? (S/N): ")
	x=x.lower()
	if x=="n":
		x="x"
print(aprovats_mes50(l))
