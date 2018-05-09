user=""
while user.isalpha()==False and user.isdigit()==False and (len(user)>=12 or len(user)<=6):
	user=input("Introdueix el teu nom d'usuari: ")
	if len(user)>12 or len(user)<6:
		print ("El nom de usuari ha de contenir almenys 6 caràcters i com a màxim 12")
	if user.isalnum()==True:
		if user.isalpha()==True:
			print("El nom d'usuari al menys ha de contenir un número")
			user=""
		if user.isdigit()==True:
			print("El nom d'usuari al menys ha de contenir una lletra")
			user=""
print("Ha registrat el seu nom d'usuari com a: ",user)