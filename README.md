![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Formativa 3 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Mauricio Francisco Valenzuela Fuentes
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Evaluación Fomativa N° 3 de la asignatura *Desarrollo Orientado a Objetos I*. Se trata de un sistema orientado a objetos desarrollado en Java, cuyo objetivo es gestionar un catálogo básico de destinos turísticos de la agencia *Llanquihue Tour*.

El sistema permite cargar información desde un archivo de texto, convertir cada línea del archivo en un objeto de la clase Tour, almacenar los objetos en una colección dinámica ArrayList y recorrer la colección para mostrar todos los tours disponibles. Además, se aplica una búsqueda mediante bucles para filtrar tours según su tipo.

Los tipos de tour considerados en el proyecto son:

Rutas gastronómicas
Paseos lacustres
Excursiones culturales
Tours personalizados

El proyecto aplica conceptos fundamentales de programación orientada a objetos, manejo de archivos, uso de colecciones, conversión de objetos a texto y separación lógica del código en paquetes.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 LlanquihueTourApp/
│
├── 📁 src/
│   ├── 📁 data/
│   │   └── GestorDatos.java
│   │
│   ├── 📁 model/
│   │   └── Tour.java
│   │
│   └── 📁 ui/
│       └── Main.java
│
└── 📁 resources/
    └── tours.txt

```

---

## 🧩 Organización por paquetes

1. model: Contiene la clase que representa el modelo principal del sistema.

Tour.java: Clase que representa un tour turístico. Contiene atributos como nombre, tipo, ubicación y precio para adulto.

2. data: Contiene la clase encargada de trabajar con los datos externos del sistema.

GestorDatos.java: Clase responsable de leer el archivo tours.txt, separar los datos de cada línea y crear objetos de tipo Tour.

3. ui: Contiene la clase principal del programa.

Main.java: Clase que ejecuta el sistema, carga la lista de tours, muestra el catálogo completo y filtra los tours por tipo.

---

## 📄 Formato del archivo de datos

El archivo tours.txt se encuentra dentro de la carpeta resources y contiene los datos separados por punto y coma ;.

Cada línea debe seguir el siguiente formato:

nombre;tipo;ubicacion;precioAdulto

Ejemplo:

Ruta Gastronómica de Frutillar;rutas gastronomicas;frutillar;15000
Paseo Lacustre Puerto Varas;paseos lacustres;puerto varas;22000
Museo Colonial Alemán;excursiones culturales;frutillar;12000
Tour Familiar Personalizado;tours personalizados;puerto varas;35000

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:
git clone https://github.com/mauvalenzuelaf-oss/LlanquihueTourApp.git

2. Abre el proyecto en IntelliJ IDEA.

3. Verifica que la estructura del proyecto contenga las carpetas src y resources.

4. Confirma que el archivo tours.txt esté ubicado en:
resources/tours.txt

5. Ejecuta el archivo Main.java desde el paquete ui.

6. Revisa la salida por consola. El sistema mostrará primero el catálogo completo de tours y luego una lista filtrada por tipo de tour.

---

## 🖥️ Ejemplo de salida esperada por consola

```plaintext
===== CATÁLOGO DE DESTINOS TURÍSTICOS LLANQUIHUE TOUR =====
Nombre: Ruta Gastronómica de Frutillar | Tipo: rutas gastronomicas | Ubicación: frutillar | Precio: $15000
Nombre: Sabores del Lago Llanquihue | Tipo: rutas gastronomicas | Ubicación: puerto varas | Precio: $18000
Nombre: Paseo Lacustre Puerto Varas | Tipo: paseos lacustres | Ubicación: puerto varas | Precio: $22000
Nombre: Museo Colonial Alemán | Tipo: excursiones culturales | Ubicación: frutillar | Precio: $12000

===== LISTA DE RUTAS GASTRONÓMICAS =====
Nombre: Ruta Gastronómica de Frutillar | Tipo: rutas gastronomicas | Ubicación: frutillar | Precio: $15000
Nombre: Sabores del Lago Llanquihue | Tipo: rutas gastronomicas | Ubicación: puerto varas | Precio: $18000
```

**Repositorio GitHub:** https://github.com/mauvalenzuelaf-oss/sistema-llanquihue-tour-java

**Fecha de entrega:** 15/06/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones |
