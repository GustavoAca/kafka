package br.com.gustavo;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(propertires());
        String value = "132123,76533,8472321231";
        ProducerRecord<String, String> record = new ProducerRecord<>("ECOMMERCE_NEW_ORDEM",value,value);
        Callback getCallback = (data, ex) -> {
                if (ex != null) {
                    ex.printStackTrace();
                    return;
                }
                System.out.println("Sucesso enviado " + data.topic() + ":::: partition " + data.partition() + "/ offset " + data.offset() + "/ timestamp " + data.timestamp());
            };

        var email = "Thank you for your order! We are processing your order";
        var emailRecord = new ProducerRecord<>("ECOMMERCE_SEND_EMAIL", email,email);

        producer.send(record, getCallback).get();
        producer.send(emailRecord, getCallback).get();
    }


    private static Properties propertires() {
        var properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"127.0.0.1:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        return properties;
    }
}