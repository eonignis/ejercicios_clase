"""lista=[["cosa 1", 2, [3], "loco"],["cosa A", 4, [1], "AaFAco"],["cosa X", 345, [2], "ZZZZZ"]]

listura=sorted(lista, key=lambda animal: animal[2])

print(lista)
print()
print()
print(listura)


autores=["Isaac Asimov", "Ray Bradbury", "Douglas Adams", "Motherfucking Mozart"]

autores.sort(key=lambda locura: locura.split(" ")[-1].lower())

print(autores)
"""
full_name=lambda fn,ln: fn.strip().title()+" "+ln.strip().title()
print(full_name("leOnHaRd        ","    eUlEr"))