#	<=== Variables ===>
laboratori=[["pol",("hematies",4430000),("basofils",0.5),("calci",9)],
["Josep",("hematies",5130000),("hematocrit",40)],
["Enrica",("hematies",4800000),("calci",11.2),("colesterol",2.3)],
["Paco",("calci",10.6),("glucosa",0.9)],
["Lidia",("hematies",4620000),("hematocrit",50),("basofils",0.7)],
["Pau",("calci",10.1),("glucosa",1.5),("colesterol",2.5)]]
dic_laboratori={}


#	<=== Funciones ===>
def analitica(lab):
	diccionario={}
	for i in lab:
		posicion1=lab.index(i)
		for j in lab[posicion1]:
			posicion2=lab[posicion1].index(j)
			name=j[0]
			for k in lab[posicion1][1]:
				diccionario[name]=lab[posicion1][1][1]
	return(diccionario)


#	<=== Código ===>
dic_laboratori=analitica(laboratori)
print(dic_laboratori)