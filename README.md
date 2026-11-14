# Tarea1Estructura
Sistema de Platos
Aplicación de consola desarrollada en Java 25 que permite registrar y visualizar platos de un restaurante mediante el uso de Records y arreglos tradicionales

#Estructura del proyecto
- `src/puce/edu/ec/platos/Platos.java`: Record con los atributos `id`, `nombre`, `categoria` y `precio`.
- `src/Main.java`: Menú interactivo por consola, validaciones y almacenamiento en arreglo

# Instrucciones de ejecución
1. Abrir el proyecto en IntelliJ IDEA con JDK 25 configurado o compilar desde terminal:
   bash
   javac -d out src/puce/edu/ec/platos/Platos.java src/Main.java
   java -cp out Main
