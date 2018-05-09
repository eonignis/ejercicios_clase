import random
carta=["As","2","3","4","5","6","7","8","9","10","J","Q","K"]
palo=["Picas","Rombos","Tréboles","Corazones"]
random.shuffle(palo)
random.shuffle(carta)
print("Has sacado la carta ",carta[1]," de ",palo[1])