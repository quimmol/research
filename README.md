# research

Repositorio personal de **investigación en seguridad**: notas, *write-ups*,
*proofs-of-concept*, scripts de análisis y experimentos varios acumulados
a lo largo del tiempo (reversing, vulnerabilidades, CTFs, bug bounty,
malware analysis, etc.).

Se mantiene público con fines **educativos** y de **investigación
defensiva**.

---

## ⚠️ Disclaimer

> **AVISO IMPORTANTE — LEER ANTES DE UTILIZAR CUALQUIER FICHERO**

Este repositorio puede contener **exploits funcionales**,
*proofs-of-concept*, *shellcode*, muestras de malware, *scripts*
ofensivos o material sensible extraído durante procesos de investigación.
Parte del contenido puede:

- Ser detectado como amenaza por antivirus/EDR (comportamiento esperado).
- Interactuar con software vulnerable de forma destructiva.
- Explotar CVEs conocidos o vulnerabilidades no parcheadas en el momento
  de su publicación.

El material se publica **exclusivamente** con propósito **educativo**, de
**divulgación técnica** y de **investigación defensiva** (análisis,
detección, formación, mejora de la seguridad).

### No uso ofensivo

Queda **estrictamente prohibido** utilizar el contenido de este
repositorio para:

- Atacar, comprometer o dañar sistemas, redes, aplicaciones o datos que
  no sean de tu propiedad o para los que no tengas **autorización expresa
  y por escrito** (bug bounty en ámbito, pentest contratado, laboratorio
  propio, CTF, etc.).
- Distribuir, redistribuir o desplegar los PoCs fuera de un entorno
  controlado.
- Cualquier actividad ilegal en la jurisdicción del usuario.

Al descargar, clonar o utilizar cualquier parte de este repositorio
aceptas ser **el único responsable** del uso que hagas del mismo.

### Sin garantías / sin responsabilidad

El material se ofrece **"tal cual" (AS IS)**, sin garantía de ningún
tipo, expresa o implícita, ni de funcionamiento, precisión o idoneidad
para un propósito concreto. El autor **no se hace responsable** de ningún
daño, pérdida de datos, incidente de seguridad, sanción legal o
consecuencia derivada del uso, mal uso o simple posesión de este
contenido.

Las opiniones y análisis reflejan un punto en el tiempo y **no
representan** la postura de ningún empleador, cliente o programa de bug
bounty asociado al autor.

### *Responsible disclosure*

Toda vulnerabilidad publicada aquí sobre software de terceros ha sido
(o se entiende que ha sido) reportada previamente al fabricante y, en su
caso, tiene CVE asignado o ha superado el plazo de *disclosure*
acordado. Si detectas material publicado por error o antes de tiempo,
contacta antes de difundirlo.

---

## Entorno recomendado

- Máquina virtual **aislada** (VirtualBox / VMware / QEMU), red en modo
  host-only cuando aplique, *snapshot* limpio antes de cada prueba.
- Nunca ejecutar PoCs contra infraestructura ajena sin autorización
  explícita.
- Muestras potencialmente maliciosas (si las hay) van dentro de archivos
  comprimidos con contraseña `infected`.

## Estructura

El repositorio se organiza por carpetas temáticas (por proyecto, por
CVE, por *target* o por CTF). Cada subdirectorio incluye, cuando aplica,
su propio `README.md` con contexto, referencias e IOCs.

## Reporte de problemas

Si encuentras contenido publicado por error (datos personales,
credenciales, información fuera de ámbito de un programa, muestras que
no deberían estar aquí, etc.) abre un *issue* o contacta directamente
antes de difundirlo.

## Licencia

Salvo indicación expresa en una subcarpeta, el material **propio**
(notas, scripts, documentación) se publica con fines educativos. El
contenido de terceros conserva la autoría original y se distribuye
únicamente a efectos de estudio; no se reclama titularidad alguna sobre
él.
