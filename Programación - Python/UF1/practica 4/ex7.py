width=int(input("Introdueix l'amplada del rectangle: "))
height=int(input("Introdueix l'alçada del rectangle: "))
i=1
while i<=height:
	if i==1 or i==height:
		print("*"*width)
	else:
		print("*"," "*(width-4),"*")
	i+=1