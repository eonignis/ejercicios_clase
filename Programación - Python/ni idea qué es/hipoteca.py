import_prestec=float(input("Introduce el importe del préstamo: "))
ingresos_anuals=float(input("Introduce los ingresos anuales: "))
cost_taxat=float(input("Introduce el coste tasado del piso: "))
termini_pagament=float(input("Introduce el terminio del pago: "))
if import_prestec<(cost_taxat*0.8):
	print("yes")
	import_mensual=import_prestec*2/(termini_pagament*12)
	ingresos_mensuals=ingresos_anuals/12

	if import_mensual<=(ingresos_mensuals*0.5):
		print("Hipoteca concedida. El import mensual a pagar será: ",import_mensual)
	else:
		print("Hipoteca NO concedida")
else:
	print("Hipoteca NO concedida")