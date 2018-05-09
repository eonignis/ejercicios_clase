lista=[]
for i in range(5):
	palabra=input("Dame una palabra: ")
	lista.append(palabra.swapcase())
lista.sort()
print(lista)
print(lista[0].swapcase())