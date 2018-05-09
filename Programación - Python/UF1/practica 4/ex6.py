i=1
eleccion=int(input("Quants números va a introduir? "))
while i<=eleccion:
	num=float(input())
	if i==1:
		mitjana=0
		menor=num
		major=num
	if num<menor:
		menor=num
	if num>major:
		major=num
	mitjana=num+mitjana
	i+=1
mitjana=mitjana/eleccion
print("La mitjana és: ", mitjana,", el número major és: ",major,", i el menor és: ",menor)