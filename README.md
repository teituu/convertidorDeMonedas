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

cd conversor-monedas
mvn clean package

java -jar target/conversor-monedas.jar

## 🌐 Monedas soportadas
Moneda	Código	País
Dólar Estadounidense	USD	Estados Unidos
Peso Argentino	ARS	Argentina
Real Brasileño	BRL	Brasil
Peso Colombiano	COP	Colombia
Peso Mexicano	MXN	México

## 📚 Tecnologías utilizadas
Java 17

Maven - Gestión de dependencias

JSON.org - Procesamiento de datos JSON

ExchangeRate-API - Fuente de tasas de cambio

## 📌 Requisitos
Java 17 o superior

Conexión a Internet

Maven (para compilación)

