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

c=1
while c==1:
	password=input("Introdueix la contrasenya: ")
	i=1
	n=password.count(" ")
	if len(password)>=8:
		if password.isalnum()==False and n==0:
			if password.isdigit()==False:
				if password.isalpha()==False:
					if password.islower()==False:
						if password.isupper()==False:
							c+=1
							i=32
	if i<9:
		print("La contrasenya triada no és segura")
print("Contrasenya vàlida")
