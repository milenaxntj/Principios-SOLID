interface Pagamento {
    double calcularTotal(Compra compra);
}

class PagamentoCartao implements Pagamento {
    @Override
    public double calcularTotal(Compra compra) {
        // Lógica para calcular o total considerando descontos, taxas, etc.
        return compra.getValorTotal() - compra.getDesconto();
    }
}

class PagamentoBoleto implements Pagamento {
    @Override
    public double calcularTotal(Compra compra) {
        // Lógica para calcular o total considerando descontos, taxas, etc.
        return compra.getValorTotal() + compra.getTaxaBoleto();
    }
}

class Compra {
    private double valorTotal;
    private double desconto;
    private double taxaBoleto;

    // getters e setters omitidos para brevidade
}
