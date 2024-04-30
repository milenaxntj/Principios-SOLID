class Funcionario:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

    def calcular_salario(self):
        # Calcular o salário
        return self.salario

    def enviar_email(self, mensagem):
        # Enviar um e-mail
        print(f"Enviando e-mail para {self.nome}: {mensagem}")

