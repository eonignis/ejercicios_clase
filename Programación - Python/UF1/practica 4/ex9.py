i=0
negatiu=0
num=int(input("Quants números vas a introduir? "))
while i<num:
	number=float(input("Dona'm el número "+str(i+1)+": "))
	if number<0:
		negatiu+=1
	i+=1
print("Has escrit ",negatiu," números negatius.")