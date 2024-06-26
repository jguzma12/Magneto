# Prueba magneto - Pruebas Web E2E #

Proyecto que contiene pruebas E2E automatizadas para el proyecto Prueba magneto

En este readme, se explicarán las diferentes configuraciones necesarias para que se pueda ejecutar el proyecto correctamente.

## Prerrequisitos ##

- IDE
- JDK 11 o superior
- Gradle 8.5



## Ejecución de Pruebas ##

### **Localmente**

Sigue estos pasos para ejecutar las pruebas localmente:

1. Clona este repositorio en tu máquina local.
2. Navega hasta el directorio del proyecto clonado.
3. Configura las variables de entorno en el archivo `env.properties` según sea necesario.
4. Abre una terminal en el directorio del proyecto.
5. Ejecuta los siguientes comandos:

#### **Ejecutar Todos los Runners**

```bash
gradle clean test -Dproperties=serenity.conf -Dfile.encoding=UTF-8 aggregate
```

#### **Ejecutar Runner Especifico**

```bash
gradle clean test --tests nombreClaseRunner -Dproperties=serenity.conf -Dfile.encoding=UTF-8 aggregate
```

#### **Ejecutar Escenario Especifico por Etiqueta**

```bash
gradle clean test -Dproperties=serenity.conf -Dcucumber.filter.tags="@nombreEtiqueta" -Dfile.encoding=UTF-8 aggregate
```
#### **Pruebas funcionales**
1. Una empresa está dedicada a la producción y entrega de tostadores de pan. ¿Qué test cases crearías para validar que la tostadora es de buena calidad?
 
- **Feature**: Encendido de la Tostadora
- 
  Scenario: Verificar que la tostadora se enciende correctamente

  Given la tostadora está conectada a una fuente de energía

  When presiono el botón de encendido

  Then la luz indicadora de encendido se enciende
- **Feature**: Tostado Uniforme
  
  Scenario: Verificar que la tostadora tuesta el pan de manera uniforme

  Given la tostadora está encendida

  And he colocado una rebanada de pan en la tostadora

  When ajusto el nivel de tostado a medio

  And inicio el ciclo de tostado

  Then el pan debe estar tostado uniformemente por ambos lados
- **Feature**: Desconexión Automática

  Scenario: Verificar que la tostadora se apaga automáticamente después de un tiempo determinado sin uso

  Given la tostadora está encendida sin pan

  When espero 5 minutos

  Then la tostadora se apaga automáticamente

- **Feature**: Seguridad de Sobrecalentamiento

  Scenario: Verificar que la tostadora se apaga automáticamente si se detecta sobrecalentamiento

  Given la tostadora está encendida y en uso repetido

  When la temperatura de la tostadora se eleva por encima del umbral de seguridad

  Then la tostadora se apaga automáticamente

  
2. ¿Dónde la tostadora se podría dañar? Encuéntrale un bug y repórtalo con los campos básicos que debe tener un bug. ¿Cuál sería el ciclo de ese bug que estás reportando?
- En el ultimo caso de prueba supongamos que la tostadora no se apago automaticamente por lo cual seria un bug que podria dañar la tostadora.
- # Bug Report

**Bug ID:** 001

## Título:
Falla en el apagado automatico de la tostadora

## Severidad:
Alta

## Prioridad:
Alta

## Descripción:
Después de completar el ciclo de tostado, la tostadora tiene una alta temperatura y no se apaga automaticamente.

## Pasos para Reproducir:
1. Colocar una rebanada de pan en la tostadora.
2. Ajustar el nivel de tostado a medio.
3. Iniciar el ciclo de tostado.
4. Esperar a que termine el ciclo.

## Resultado Esperado:
El pan debe ser expulsado automáticamente una vez terminado el ciclo la tostadora debe apagarse automaticamente.

## Resultado Actual:
El pan sale de la tostadora y esta continua aumentado la temperatura y no se apaga automáticamente.

## Adjuntos:
- Fotos de la tostadora antes y despues del ciclo de tostado.
- Video del ciclo completo mostrando la falla.

## Entorno:
- **Modelo de Tostadora:** TosterX-2000
- **Versión del Firmware:** 1.02
- **Fecha y Hora de Prueba:** 2024-06-26 10:00 AM
## Ciclo de vida del bug

1. Reporte del Bug: El QA reporta el bug en el sistema de seguimiento de bugs con todos los detalles necesarios.
2. Asignación: El bug es asignado a un desarrollador para su revisión.
3. Análisis: El desarrollador analiza el bug y determina la causa raíz del problema.
4. Resolución: El desarrollador implementa una solución y actualiza el firmware o el diseño de la tostadora.
5. Verificación: El QA verifica que la solución ha resuelto el problema mediante pruebas adicionales.
6. Cierre: Si el bug está resuelto, se cierra el reporte. Si persiste, se reabre para más análisis.


3. Encuentras un bug y ves que el assert esperado es diferente al encontrado. ¿Cómo reportarías ese bug?
# Reporte de Bug

**Bug ID:** 002

## Título:
El nivel de tostado medio no alcanza el tiempo esperado

## Severidad:
Media

## Prioridad:
Media

## Descripción:
El ciclo de tostado ajustado al nivel medio se completa en 2 minutos en lugar de los 3 minutos esperados.

## Pasos para Reproducir:
1. Colocar una rebanada de pan en la tostadora.
2. Ajustar el nivel de tostado a medio.
3. Iniciar el ciclo de tostado.
4. Cronometrar el tiempo hasta la finalización del ciclo.

## Resultado Esperado:
El ciclo de tostado debe durar 3 minutos.

## Resultado Actual:
El ciclo de tostado dura solo 2 minutos.

## Adjuntos:
- Capturas de pantalla del cronómetro antes y después del ciclo de tostado.
- Video mostrando la duración del ciclo.

## Entorno:
- **Modelo de Tostadora:** TosterX-2000
- **Versión del Firmware:** 1.02
- **Fecha y Hora de Prueba:** 2024-06-26 11:00 AM


