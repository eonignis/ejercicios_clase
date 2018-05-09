m=-1
n=-1
while m<0:
	m=int(input("Escriu la grandària del segment: "))
	while m<0:
		print ("No ha escrit un número enter positiu!")
		m=int(input("Escriu la grandària del segment: "))
while n<0:
	n=int(input("Escriu el número de segments: "))
	while n<0:
		print ("No ha escrit un número enter positiu!")
		n=int(input("Escriu el número de segments: "))
for i in range(m):
	print ("*"*n,end=("	"))