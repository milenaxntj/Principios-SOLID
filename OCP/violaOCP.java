public class PaymentProcessor
{
    public void ProcessPayment(string paymentType, decimal amount)
    {
        if (paymentType == "creditcard")
        {
            // Processamento para cartão de crédito
        }
        else if (paymentType == "boleto")
        {
            // Processamento para boleto
        }
        else if (paymentType == "banktransfer")
        {
            // Processamento para transferência bancária
        }
        // Outros tipos de pagamento...
    }
}
