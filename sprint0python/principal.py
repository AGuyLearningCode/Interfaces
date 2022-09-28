"""
EJERCICIO 3:
Añade un archivo de código Python llamado fibonacci.py. Debe contener una
función llamada "funcion_fibonacci" que calcule el “enésimo” término de la sucesión
de Fibonacci recursivamente, dado por:
           /
          | n = 0 0
	f(n)=<  n = 1 1
	      | n > 1 f(n-1)+f(n-2)
	       \
"funcion_fibonacci" debe declarar que recibe 1 parámetro y devolver el valor
correcto.
Ahora, para probarla, añade un archivo principal.py. Desde ese archivo, importa la
función anterior empleando la siguiente línea:

Luego, en principal.py se solicitará por teclado un número al usuario y se llamará a
la función. Se imprimirá el resultado devuelto. Por ejemplo, si se teclea 7, se
imprime 13.
Cuando compruebes que funciona correctamente, haz commit y push.

Suc.Fib.: 0,1,1,2,3,5,8,13,21,34,55,89
Ciclos:   0 1 2 3 4 5 6  7  8  9
Código del ejercicio 3:
##Declaración de variables
c=0 #ciclos
v=0 #valor
aux=0
##Presentación del programa
print('Ejercicio 3: Cálculo del enésimo valor de fibonacci')
print(' ')
##Input
n=int(input('Introduce un número entero positivo: '))
while (n<0):
	n=input('El valor debe ser  igual o mayor que 0.')
##Procesamiento-Output
from fibonacci import funcion_fibonacci

print('El valor correspondiente de la sucesión es: '+str(funcion_fibonacci(n)))
XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
EJERCICIO 4:
4. Añade un archivo fibonacci2.py que sea análogo al anterior, pero éste calculará el
“enésimo” término de Fibonacci mediante la siguiente fórmula:

El nombre de la función debe ser distinto, por ejemplo funcion_fibonacci2.
Haz commit y push.
"""
##Importación de librerías
import time
##Presentación del programa
print('Ejercicio 4: Cálculo del enésimo valor de fibonacci')
print(' ')
##Declaración de variables globales
op='z'
n=0
start_time=0
end_time=0
elapsed_time=0
##Input
print('Elije el método de cálculo del valor dentro de la sucesión de fibonacci.')
print('a.:Ejecutar algoritmo por rangos.')
print('b.:Ejecutar algoritmo por inserción de dos valores.')
print(' ')##Separador
op = input('Introduzca la letra de la opción que desee ejecutar: ')
while (op != 'a') & (op != 'A') & (op != 'b') & (op != 'B'): # Bucle while. Operador lógico and
	op = input('Tu respuesta. Debe ser a o b: ')
##Procesamiento 3
if op=='a':
	start_time=time.time()
	##Código del ejercicio 3:
	##Presentación del programa
	print('Algoritmo por rangos.')
	print(' ')
	##Input
	n=int(input('Introduce un número entero positivo: '))
	while (n<0):
		n=input('El valor debe ser  igual o mayor que 0.')
	##Procesamiento-Output
	from fibonacci import funcion_fibonacci

	print('El valor correspondiente de la sucesión es: '+str(funcion_fibonacci(n)))
	end_time=time.time()
	elapsed_time=end_time-start_time
	print('El tiempo de ejecución ha sido: ' + str(elapsed_time) + ' s')
else:
	start_time=time.time()
	##Código del ejercicio 4:
	##Presentación del programa
	print('Algoritmo por inserción de dos valores.')
	print(' ')
	##Input
	n=int(input('Introduce un número entero positivo: '))
	while (n<0):
		n=input('El valor debe ser  igual o mayor que 0.')
	##Procesamiento-Output
	from fibonacci2 import funcion_fibonacci

	print('El valor correspondiente de la sucesión es: '+str(funcion_fibonacci(n)))
	end_time=time.time()
	elapsed_time=end_time-start_time
	print('El tiempo de ejecución ha sido: ' + str(elapsed_time) + ' s')
