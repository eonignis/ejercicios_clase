import os
# Import para copiar y hacer cosas así
import shutil

# Cambiarle el nombre a un archivo
os.rename("nombre_del_archivo.txt", "nuevo_nombre.txt")

# Eliminar un archivo. Solo funciona para archivos, carpetas no
os.remove("nombre_del_archivo.txt")

# Copiar archivos
shutil.copy("nombre_del_archivo.txt", "nombre_del_nuevo_archivo.txt")

# Copytree copia todo el directorio indicado en un nuevo directorio
shutil.copytree("directorio_que_sea", "nombre_del_nuevo_directorio")

# Move mueve un archivo a un lugar indicado
shutil.move("nombre_del_archivo.txt", "nombre_del_destino")

# rmtree borra la carpeta y todos los directorios que hayan dentro de él
shutil.rmtree("nombre_del_directorio")

# Para crear carpetas sirve cualquier de las dos funciones
os.rmdir("nombre_del_directorio")
os.makedir("nombre_del_directorio")