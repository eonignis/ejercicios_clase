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