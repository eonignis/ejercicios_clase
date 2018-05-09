enter=int(input("Escriu un enter: "))
llista=[1324,234,72,35,8373,9374,712,8,999,-1]
majors=[]
menors=[]
igual=[]
for i in llista:
	if i<enter:
		menors.append(i)
	if i==enter:
		igual.append(i)
	if i>enter:
		majors.append(i)
print("La llista de numeros menors a ",enter," és: ",menors)
print("La llista de numeros iguals a ",enter," és: ",igual)
print("La llista de numeros majors a ",enter," és: ",majors)