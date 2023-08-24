- [Español](#Estudio-sobre-Apache-Kafka)
- [English](#Study-on-Apache-Kafka)

# Estudo sobre Apache Kafka

Neste documento, exploraremos o funcionamento do Apache Kafka e entenderemos seus conceitos fundamentais.

## Procedimento

### Baixa a última versão do Scala e Kafka

Antes de começar, baixaremos a última versão do Scala e Kafka em [sitio web oficial de Kafka](https://kafka.apache.org/downloads).

### Execução do Apache Kafka

Siga esses passos para executar Apache Kafka:

1. Descompacte o zip que baixou.
2. Abra um terminal dentro da psta zipada.

Após isso, inicie o serviço do ZooKeeper:

```bash 
bin/zookeeper-server-start.sh config/zookeeper.properties
```

inicie o serviço do Kakfa:

```bash 
bin/kafka-server-start.sh config/server.properties
```
aquí temos a orden recomendado para importar e executar os módulos:

> Importe o módulo COMMOM-KAFKA. <br>
> Importe o módulo SERVICE-EMAIL. <br>
> Importe o módulo SERVICE-FRAUD-DETECTOR. <br>
> Importe o módulo SERVICE-LOG. <br>
> Importe o módulo SERVICE-NEW-ORDER. <br>

---
# Estudio sobre Apache Kafka

En este documento, exploraremos el funcionamiento de Apache Kafka y entenderemos sus conceptos fundamentales.

## Procedimiento

### Descarga de la última versión de Scala y Kafka

Antes de empezar, descarguemos la última versión de Scala y Kafka desde el [sitio web oficial de Kafka](https://kafka.apache.org/downloads).

### Ejecución de Apache Kafka

Sigue estos pasos para ejecutar Apache Kafka:

1. Descomprime el paquete que descargaste.
2. Abre una terminal dentro de la carpeta descomprimida.

A continuación, inicia el servicio de ZooKeeper:

```bash 
bin/zookeeper-server-start.sh config/zookeeper.properties
```

inicia el servicio de Kakfa:

```bash 
bin/kafka-server-start.sh config/server.properties
```
aquí tienes el orden recomendado para importar y executar los módulos:

> Importa el módulo COMMOM-KAFKA. <br>
> Importa el módulo SERVICE-EMAIL. <br>
> Importa el módulo SERVICE-FRAUD-DETECTOR. <br>
> Importa el módulo SERVICE-LOG. <br>
> Importa el módulo SERVICE-NEW-ORDER. <br>

---

# Study on Apache Kafka

In this document, we will explore the workings of Apache Kafka and understand its fundamental concepts.

## Procedure

### Downloading the Latest Version of Scala and Kafka

Before we begin, let's download the latest version of Scala and Kafka from the [official Kafka website.](https://kafka.apache.org/downloads).

### Running Apache Kafka

Follow these steps to run Apache Kafka:

1. Unzip the downloaded package.
2. Open a terminal within the extracted folder.

Next, start the ZooKeeper service:

```bash 
bin/zookeeper-server-start.sh config/zookeeper.properties
```

Then, start the Kafka service:

```bash 
bin/kafka-server-start.sh config/server.properties
```
Here is the recommended order for importing and running the modules:

> Import the module COMMOM-KAFKA. <br>
> Import the module SERVICE-EMAIL. <br>
> Import the module SERVICE-FRAUD-DETECTOR. <br>
> Import the module SERVICE-LOG. <br>
> Import the module SERVICE-NEW-ORDER. <br>




