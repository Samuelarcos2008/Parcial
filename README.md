# Parcial 1 - Programación 2: Sistema de Gestión de Operarios

**Cliente:** Docente de Programación 2  
**Desarrollado por:** Samuel Arcos Correa  
**Tecnologías:** Java (JDK 17+), Visual Studio Code / Apache NetBeans, Git/GitHub  

---

## 1. Descripción General
Sistema de información en Java desarrollado para el registro y gestión de operarios dentro de una organización. El proyecto aplica los principios fundamentales de la Programación Orientada a Objetos (POO), tales como **Encapsulamiento**, **Herencia**, **Sobreescritura de Métodos** y **Validación de Datos**.

---

## 2. Requerimientos Funcionales (RF)

| Código | Requerimiento |
| :--- | :--- |
| **RF-01** | Registrar los datos generales de un empleado/empresa: nombre, edad, sueldo y fecha de contrato. |
| **RF-02** | Registrar los datos propios del operario: dirección de residencia, correo electrónico y jornada laboral (Diurno o Nocturno). |
| **RF-03** | El operario debe incluir los datos generales mediante la herencia de la superclase `Empresa`. |
| **RF-04** | Cargar los datos desde la clase `Main` de forma directa (sin uso del teclado / `Scanner`). |
| **RF-05** | Mostrar la información detallada de cada operario mediante el método `visualizar()`. |
| **RF-06** | Contar con un registro mínimo de 2 usuarios en la ejecución del programa. |

---

## 3. Requerimientos No Funcionales (RNF)

| Código | Requerimiento |
| :--- | :--- |
| **RNF-01** | Desarrollar el proyecto en Visual Studio Code o Apache NetBeans. |
| **RNF-02** | El proyecto debe llamarse `Parcial` y las clases deben estar organizadas en el paquete `Heredar`. |
| **RNF-03** | La solución debe constar de 3 clases principales: `Empresa`, `Operario` y `Main`. |
| **RNF-04** | Los atributos de la superclase `Empresa` deben ser privados (aplicando Encapsulamiento). |
| **RNF-05** | Garantizar la integridad de los datos mediante validaciones en los métodos *setters*. |

---

## 4. Restricciones del Sistema

* **Herencia Estricta:** La clase `Operario` debe heredar (`extends`) de la superclase `Empresa`.
* **Rango de Jornada:** La jornada laboral del operario solo puede ser `"Diurno"` o `"Nocturno"`.
* **Carga de Datos:** No se permite la interacción por teclado para la carga de información.
* **Integridad de Datos:** No se aceptan nombres ni direcciones vacíos, sueldos negativos, edades fuera del rango legal (18 a 100 años), fechas futuras ni correos con formato inválido.

---

## 5. Matriz de Trazabilidad

| Requerimiento | Ubicación en el Código / Implementación |
| :--- | :--- |
| **RF-01, RNF-04** | `Empresa.java` (Atributos privados: `nombre`, `edad`, `sueldo`, `fechaContrato`). |
| **RF-02, RF-03** | `Operario.java` (Clase que utiliza `extends Empresa`). |
| **RF-04, RF-06** | `Main.java` (Instanciación directa de operarios). |
| **RF-05** | Método `visualizar()` implementado en `Empresa` y sobreescrito (`@Override`) en `Operario`. |
| **RNF-05** | Validaciones dentro de los *setters*. |

---

## 6. Modelo de Dominio (Diagrama de Clases)

```text
       +-----------------------------------------+
       |                 Empresa                 |  (Superclase)
       +-----------------------------------------+
       | - nombre: String                        |
       | - edad: int                             |
       | - sueldo: double                        |
       | - fechaContrato: LocalDate              |
       +-----------------------------------------+
       | + Empresa(nombre, edad, sueldo, fecha)  |
       | + get/setNombre()                       |
       | + get/setEdad()                         |
       | + get/setSueldo()                       |
       | + get/setFechaContrato()                |
       | + visualizar(): void                    |
       +-----------------------------------------+
                            ▲
                            │  (Herencia: extends)
                            │
       +-----------------------------------------+
       |                Operario                 |  (Subclase)
       +-----------------------------------------+
       | - direccion: String                     |
       | - correo: String                        |
       | - jornadaLaboral: String                |
       +-----------------------------------------+
       | + Operario(nombre, edad, sueldo, ...)   |
       | + get/setDireccion()                    |
       | + get/setCorreo()                       |
       | + get/setJornadaLaboral()               |
       | + visualizar(): void (@Override)        |
       +-----------------------------------------+
