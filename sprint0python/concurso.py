"""
Debe imprimir una pregunta de temática libre por pantalla con tres opciones:
 a), b) y c). El usuario podrá teclear su respuesta y sólo habrá una
 respuesta correcta. El programa imprimirá si la respuesta ha sido
 acertada o no.
 Cuando compruebes que funciona correctamente, haz commit y push.
"""
##Declaración de variables
puntos=0
##Presentación programa
print('Ejercicio 2:')
print(' ')##Separador
##Input 1
## Pregunta 1
print('Pregunta 1/3:¿De qué color es el caballo blanco de Santiago Apostol?')
print('a.:Gris')
print('b.:Fosforito')
print('c.:Blanco')
print(' ')##Separador
op = input('Tu respuesta: ')
##Procesamiento 1
while (op != 'a') & (op != 'b') & (op != 'c'): # Bucle while. Operador lógico and
	op = input('Tu respuesta. Debe ser a o b o c: ')
##Output 1
print(' ')##Separador
if op=='c':
	print('¡Acertaste! (+10 puntos)')
	puntos+=10
else:
	print('Fallaste (-5 puntos)')
	puntos-=5

print(' ')##Separador
##Input 2
## Pregunta 2
print('Pregunta 2/3:¿Qué animal es el que por la mañana camina a cuatro patas, al mediodía a dos y a la noche a tres?')
print('a.:Las hormigas borrachas.')
print('b.:El ser humano.')
print('c.:Las vacas del nivel de las vacas de Diablo.')
print(' ')##Separador
op = input('Tu respuesta: ')
##Procesamiento 2
while (op != 'a') & (op != 'b') & (op != 'c'): # Bucle while. Operador lógico and
	op = input('Tu respuesta. Debe ser a o b o c: ')
##Output 2
print(' ')##Separador
if op=='b':
	print('¡Acertaste! (+10 puntos)')
	puntos+=10
else:
	print('Fallaste (-5 puntos)')
	puntos-=5
	
print(' ')##Separador
##Input 3
## Pregunta 3
print('Pregunta 3/3:¿En que año Maria Pita derrotó a Francis Drake?')
print('a.:13 de mayo de 1589')
print('b.:14 de mayo de 1589')
print('c.:15 de mayo de 1589')
print(' ')##Separador
op = input('Tu respuesta: ')
##Procesamiento 3
while (op != 'a') & (op != 'b') & (op != 'c'): # Bucle while. Operador lógico and
	op = input('Tu respuesta. Debe ser a o b o c: ')
##Output 3
print(' ')##Separador
if op=='b':
	print('¡Acertaste! (+10 puntos)')
	puntos+=10
else:
	print('Fallaste (-5 puntos)')
	puntos-=5

print(' ')
##Output 4
print('Los puntos acumulados son: ' + str(puntos) + '/30.')
