diccionario={}
archivo=open("archivo.txt", "r")


def guardar_datos (diccionario, nomArchivo):
	linea=nomArchivo.readline()
	while linea!="":
		lista=linea.split(":")
		lista[1]=lista[1].rstrip("\n")
		diccionario[lista[0]]=lista[1]
		linea=nomArchivo.readline()	

guardar_datos(diccionario, archivo)
print(diccionario)
archivo.close()



































def modificarMillonari(title, millonaris, acciones):
    clear()
    i = 1
    print(title)
    print("| ID   | Nom i Cognoms                  |" )
    print("| ---- | ------------------------------ |" )

    for millonari in millonaris:
        print("| ({0:2}) | {1:30} |".format(i, millonari.get("name"), millonari.get("age")))
        i = i+1
    millonetiToEdit = validateNum("\nID del millonari que vol modificar? ", "int", errortext="ID invalid")
    if not millonetiToEdit > 0 and not millonetiToEdit <= i:
        print("ID no valid, torni a provar")
        return modificarMillonari(title, millonaris, acciones)
    clear()
    name = validateText("Nom i cognoms? ", "Nom invalid.")
    age = validateNum("Edat? ", "int", errortext="Edat invalida")
    stocks = []
    for company in acciones:
        text = "Quantes accions te en {}? ".format(company.get("name"))
        stock = validateNum(text , "int", errortext="Numero invalid.")
        if stock != 0:
            stocks.append({"company":company.get("id"), "stockOwned": stock})
    clear()
    nouMillonari = {"name": name, "age": age, "stocks": stocks}
    
    for i in range(0, len(millonaris)):
        if millonaris[i].get("name") == millonaris[millonetiToEdit-1].get("name"):
            millonaris[i] = nouMillonari
    
    input("\nPressioni qualsevol tecla per tornar.")

# FUNCTIONS
def clear():
    from os import system
    from sys import platform
    if platform == "linux" or platform == "darwin":
        system("clear")
    elif platform == "win32":
        system("cls")


