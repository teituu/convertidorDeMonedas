# 💱 Conversor de Monedas con API

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![License](https://img.shields.io/badge/License-MIT-green)

Aplicación Java para conversión de divisas en tiempo real usando tasas de cambio actualizadas desde una API externa.

## 🌟 Características principales
- Conversión entre 5 monedas diferentes
- Interfaz de línea de comandos intuitiva
- Tasas de cambio actualizadas desde [ExchangeRate-API](https://www.exchangerate-api.com)
- Código modular y bien estructurado
- Manejo básico de errores

## 🛠️ Instalación y uso
1. Clonar repositorio:
```bash
git clone https://github.com/teituu/convertidorDeMonedas
```

## Compilar proyecto:

```bash
cd conversor-monedas
mvn clean package
```
Ejecutar:

```bash
java -jar target/conversor-monedas.jar

```
## 🌐 Monedas soportadas
1.-Moneda	Código	País
2.-Dólar Estadounidense	USD	Estados Unidos
3.-Peso Argentino	ARS	Argentina
4.-Real Brasileño	BRL	Brasil
6.-Peso Colombiano	COP	Colombia
7.-Peso Mexicano	MXN	México

## 📚 Tecnologías utilizadas
Java 17

1.-Maven - Gestión de dependencias

2.-JSON.org - Procesamiento de datos JSON

3.-ExchangeRate-API - Fuente de tasas de cambio

## 📌 Requisitos
1.-Java 17 o superior

2.-Conexión a Internet

3.-Maven (para compilación)

