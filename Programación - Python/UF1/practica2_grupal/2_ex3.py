x,y=input("Introdueix la primera peça de dominó, separant els números amb espais: ").split()

a,b=input("Introdueix la segona peça de dominó, separant els números amb espais: ").split()
if x==a or x==b:
	print("Les peçes encaixen!")
elif y==a or y==b:
	print("Les peçes encaixen!")
else:
	print("Les peçes no encaixen :(")