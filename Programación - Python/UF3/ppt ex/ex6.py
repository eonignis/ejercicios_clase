f=open("texto_ingles.txt","w+")

#	A
text=["All paid jobs absorb and degrade the mind.\n",
"If Beethoven had been killed in a plane crash at the age of 22, it would have changed the history of music... and of aviation.\n",
"I do not have a psychiatrist and I do not want one, for the simple reason that if he listened to me long enough, he might become disturbed.\n"]
f.writelines(text)
print(f.read())

#	B
f.seek(0)
print(f.readline())

#	C
f.seek(0)
f.seek(37)
print(f.readline())

#	El E no funciona

#	G
f.seek(60)
print(f.readline())

#	H
print(f.tell())

f.close()