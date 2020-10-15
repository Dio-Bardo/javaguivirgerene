# Encriptado Vigenere que guarde en un txt.

Se desarrollo un programa que implemento una aplicación con GUI para el cifrado de archivos de texto con el algoritmo de cifrado Vigenère.

Se creo un programa de cifrado simple. El proceso es muy sencillo. Se divide en dos partes. En primer lugar, cada letra mayúscula o minúscula debe desplazarse tres posiciones hacia la derecha, de acuerdo con la tabla ASCII: la letra ’a’ debe convertirse en la letra ’d’, la letra ’y’ debe convertirse en el carácter ’—’, etc. En segundo lugar, cada línea debe invertirse. Después de invertir, todos los caracteres de la mitad en adelante (truncado) deben moverse una posición a la izquierda en ASCII. En este caso, ’b’ se convierte en ’a’ y ’a’ se convierte en ’‘’.

Por ejemplo, si como entrada tenemos la cadena abcABC1 si la palabra resultante de la primera parte es ”defDEF1”, las letras ”DEF1”deben moverse una posición a la izquierda. Sin embargo, si la palabra resultante de la primera parte es ”tesA”, las letras ”sA”serán desplazadas. El resultado cifrado de la cadena es 1FECedc.

#CONTENIDO
Este proyecto con el nombre de modelo viene con 5 Clases la cuales son Controlador, InterfazVista, Vista, cipherDemo y Modelo. todos con extencion .java

#Pre-requisitos

Se necesita tener las librerias, el github y un IDE. NetBeans 8.2 y GIT

#funcionamiento del programa.


#Elementos visuales y funcionamiento.

1.-Primer cuadro de texto(Registra el nombre del archivo que se va a guardar).

2.-Segundo cuadro de texto(Registra el texto a cifrar, desifrar o guardar).

3.-Abrir archivo(Se busca el nombre del archivo que se ingreso antes para ver la informacion Registrada).

4.-Encripta(Se aplica el metodo usado para encriptar).

5.-Desencriptar(Se revierte el efecto de encriptar para obtener el texto original).

6.-Guardar(Se almacena la informacion en el archvio).

#~EJEMPLOS

Pueden utilizar estas cadenas como ejemplo.

Texto #3

abcABC1

vxpdylY .ph

vv.xwfxo.fd

-Cadenas resultantes (respectivamente)

3# rvzgV

1FECedc

ks. \n{frzx

gi.r{hyz-xx.

#Referencias
Libro: Como programar en java 7ma edicion

#Resultados
