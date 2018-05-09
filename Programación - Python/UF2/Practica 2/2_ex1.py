def menys_de_3as(s):
	suma = 0
	for i in range(len(s)): 
		if s[i] == 'a':
			suma+=1
	if suma == 3:
		return False
	else:
		return True


s = input("Introduce una palabra: ")
c = menys_de_3as(s) 
print(c)