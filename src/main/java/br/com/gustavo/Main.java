package br.com.gustavo;

import java.math.BigDecimal;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        try(var orderDispatcher = new KafkaDispatche<Order>()){
            try(var emailDispatcher = new KafkaDispatche<Email>()) {
                for (var i = 0; i < 10; i++) {
                    var userId = UUID.randomUUID().toString();
                    var orderId = UUID.randomUUID().toString();
                    var amount = BigDecimal.valueOf(Math.random() * 5000 + 1);
                    var order = new Order(userId, orderId, amount);
                    orderDispatcher.send("ECOMMERCE_SEND_EMAIL", userId, order);

                    var email = new Email("Tanks","Thank you for your order! We are processing your order");
                    emailDispatcher.send("ECOMMERCE_NEW_ORDER", userId, email);
                }
            }
        }
    }
}