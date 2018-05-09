horas_curro=float(input("¿Cuantas horas has trabajado? "))
paga_hora=float(input("¿Cuanto cobras por hora? "))
if horas_curro>35:
	horas_extra=horas_curro-35
	paga_extra=paga_hora*1.5
	importe_final=paga_extra+horas_curro*paga_hora
else:
	importe_final=paga_hora*horas_curro
print("Cobrarás: ",importe_final,"€")