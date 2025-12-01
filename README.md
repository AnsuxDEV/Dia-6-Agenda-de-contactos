# 📒 Proyecto 6 – Agenda de Contactos

## 📌 Descripción
Este proyecto consiste en una agenda interactiva en consola que permite gestionar contactos de manera sencilla. El usuario puede añadir, mostrar, buscar y eliminar contactos desde un menú principal. Cada contacto está compuesto por **nombre, teléfono y email**, lo que introduce el uso de **clases y objetos** en Java para organizar la información.

---

## 🧱 Funcionalidades
- Menú principal con opciones:
  - Añadir contacto (nombre, teléfono, email).  
  - Mostrar todos los contactos.  
  - Buscar contacto por nombre.  
  - Eliminar contacto por nombre.  
  - Salir del programa.  
- Almacenamiento en una **lista dinámica (`ArrayList`)**.  
- Validación básica de entradas (ej. evitar agenda vacía al mostrar).  
- Salida formateada para mostrar los datos de cada contacto.  

---

## 🧠 Aprendizajes
- Uso de **Programación Orientada a Objetos (POO)**: creación de la clase `Contacto`.  
- Manejo de **colecciones de objetos** con `ArrayList`.  
- Implementación de métodos para modularizar el código (`añadirContacto`, `buscarContacto`, etc.).  
- Validaciones más complejas (ej. evitar duplicados, comprobar agenda vacía).  
- Uso de `@Override` para redefinir el método `toString()` y mostrar los contactos en formato legible.  

---

## ▶️ Ejemplo de ejecución
```
=== Agenda de Contactos ===
1 - Añadir contacto
2 - Mostrar contactos
3 - Buscar contacto
4 - Eliminar contacto
5 - Salir
Seleccione una opción: 1
Nombre: Sergio
Teléfono: 600123456
Email: sergio@mail.com
Contacto añadido correctamente.

Pulse Enter para continuar...
```

---

## 📌 Próximos pasos
- Añadir validación para evitar contactos duplicados.  
- Guardar los contactos en un archivo `.txt` o `.csv` para persistencia.  
- Implementar edición de contactos (modificar teléfono o email).  
- Extender la agenda con más campos (dirección, notas, etc.).  
- Integrar con una base de datos (ej. SQLite o MySQL) para gestión avanzada.  

---
