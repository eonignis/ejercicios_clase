hores_treballades=float(input("Cuantas horas has trabajado? "))
metres_instalats=float(input("Cuantos metros has instalado? "))
preu_hora=30
metre_cable=0.5
metre_total=metres_instalats*metre_cable
hora_total=hores_treballades*preu_hora
precio_bruto=hora_total-metre_total
iva=precio_bruto*1.21
print("El precio bruto son ",precio_bruto,"€, y con IVA son ",iva,"€")