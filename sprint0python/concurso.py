"""
Debe imprimir una pregunta de temática libre por pantalla con tres opciones:
 a), b) y c). El usuario podrá teclear su respuesta y sólo habrá una
 respuesta correcta. El programa imprimirá si la respuesta ha sido
 acertada o no.
 Cuando compruebes que funciona correctamente, haz commit y push.
"""

print('¿De qué color es el caballo blanco de Santiago Apostol?')
print('a.:Gris')
print('b.:Fosforito')
print('c.:Blanco')
op = input('Tu respuesta: ')

while (op != 'a') & (op != 'b') & (op != 'c'): # Bucle while. Operador lógico and
	op = input('Tu respuesta. Debe ser a o b: ')

if op=='c':
	print('¡Acertaste!')
else:
	print('Fallaste')
