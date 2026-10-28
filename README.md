Resolución del ejercicio N°9 de la unidad 4 de progrramación 2.
Clase Abstracta (Transportista):

Funciona como la base común para todas las opciones logísticas. Define atributos compartidos de tarifas base.

Declara el método abstracto double calcularCostoEnvio(double pesoKg, double distanciaKm), obligando a cada subclase a definir su propia fórmula y factores multiplicadores de costo.

Clases Concretas (Opciones Logísticas):

CorreoTradicional: Aplica un cálculo de tarifas estándar ponderando el peso y la distancia a un costo moderado.

EnvioExpressAereo: Implementa factores multiplicadores elevados debido a la prioridad, velocidad y costos operativos del transporte aéreo.

TransporteMaritimo: Aplica un modelo de costos optimizado para cargas pesadas o grandes distancias mediante factores diferenciales marítimos.

Clase Coordinadora (CotizadorEnvios):

Actúa como el motor central de presupuestos. Recibe de forma polimórfica cualquier referencia de tipo Transportista y calcula la estimación de envío para un paquete dado, desacoplando la lógica de cotización de las reglas específicas de cada transportista.

Clase Principal (Main):

Se encarga de instanciar las distintas opciones logísticas, evaluar el costo de un mismo paquete (con idénticos valores de peso y distancia) a través del cotizador, y mostrar los resultados comparativos por consola.
<img width="540" height="518" alt="Captura de pantalla 2026-10-28 103132" src="https://github.com/user-attachments/assets/b14db984-123b-4008-b012-02c7f822f5a5" />
