#Importacion de librerias
from statistics import median_high

#Definicion de Valores.
lista = []
MaxNotas = 3

#Variable i para enumerar automaticamente el numeral de la lista.
i = 1

#Definicion de Clases.
#Clase Notas para definir el sistema y sus atributos
class Notas:

    def alta():
        print('La nota mas alta es {}'.format(max(lista)))
    def promedio():
        print('El promedio es {}'.format(median_high(lista)))
    def baja():
        print('La Nota mas baja {}'.format(min(lista)))

#Procesamiento
#Ciclo 'Mientras', en base a la variable de las 3 notas solicitadas.
while (MaxNotas > 0):
    Nota = float(input('Ingrese la nota {}:'.format(i))) #Use un float para considerar valores con puntuacion.
    lista.append(Nota)
    i = i+1
    MaxNotas = MaxNotas-1

#Use las funciones definidas de min y max integradas en el sistema para asi determinar los numeros en la lista.
'''
Buscando una funcion que se acomodara al promedio, encontre en la libreria stadistics la funcion
median_high, que encuentra la media de una lista sin cambiar valores u ajustarlos a un numero general (rendondear).

Segun la especificacion de este valor, tecnicamente el uso que se esta dando no es del todo correcto y en otros
casos no funcionaria de la misma forma. Pero en este caso especifico es perfecto al tener solo 3 numeros a revisar
'''

#Salida
Notas.promedio()
Notas.baja()
Notas.alta()