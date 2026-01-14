package app;

import model.*;

public class Main {

    public static void main(String[] args) {

        Pedido pedido1 = new PedidoComida(
                "#001",
                "Av. Los Leones 890",
                3
        );

        Pedido pedido2 = new PedidoEncomienda(
                "#002",
                "Calle San Diego 1550",
                8
        );

        Pedido pedido3 = new PedidoExpress(
                "#003",
                "Av. Vicuña Mackenna 3200",
                5
        );

        mostrarPedido(pedido1);
        mostrarPedido(pedido2);
        mostrarPedido(pedido3);
    }

    private static void mostrarPedido(Pedido pedido) {
        pedido.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: "
                + pedido.calcularTiempoEntrega() + " minutos\n");
    }
}

