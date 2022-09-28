import math
##Función Fibonacci del ejercicio 4.
def funcion_fibonacci(n):
	##Opción de codificación 1.
	##a =(1+(5**0.5))/2
	##b =(1-(5**0.5))/2
	##return ((a**n)-(b**n))/(5**0.5)
	##Opción de codificación 2.
	return ((((1+math.sqrt(5))/2)**n)-(((1-math.sqrt(5))/2)**n))/math.sqrt(5)
