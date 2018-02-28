"""lista=[["cosa 1", 2, [3], "loco"],["cosa A", 4, [1], "AaFAco"],["cosa X", 345, [2], "ZZZZZ"]]

listura=sorted(lista, key=lambda animal: animal[2])

print(lista)
print()
print()
print(listura)

G=(x:)"""

autores=["Isaac Asimov", "Ray Bradbury", "Douglas Adams", "Motherfucking Mozart"]

autores.sort(key=lambda locura: locura.split(" ")[-1].lower())

print(autores)