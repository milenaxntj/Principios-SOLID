# Principios SOLID

Trabalho de Engenharia de Software sobre princípios de projeto, incluindo SOLID.

## 1. Princípio da Responsabilidade Única (SRP)

O princípio da responsabilidade única propõe que uma classe deve ter uma única responsabilidade, ou seja, um único motivo para ser modificada. Um sistema deve possuir classes que se concentram em aspectos específicos, como classes de apresentação (interface com o usuário) e classes de regras de negócio (computações, processamentos, etc.). Portanto, é importante separar as responsabilidades de apresentação e de regras de negócio em classes distintas para manter o código mais organizado, coeso e de fácil manutenção. Essa separação também facilita a reutilização de código e a aplicação de testes automatizados.

No exemplo [violaSRP.py](https://github.com/milenaxntj/Principios-SOLID/blob/main/SRP/violaSRP.py) a classe `Funcionario` tem responsabilidade de calcular salário e enviar emails, violando o SRP, pois tem mais de uma razaão para mudar: Se o cálculo de salário mudar ou se a forma de enviar emails mudar. 

Já corrigindo, no exemplo [aplicaSRP.py](https://github.com/milenaxntj/Principios-SOLID/blob/main/SRP/aplicaSRP.py) cada classe tem uma responsabilidade e segue o SRP. 

## 2. Princípio da Segregação da Interface (ISP)

O principio define que interfaces tem que ser pequenas, coesas e especificas para cada tipo de clientes, para que clientes evitem depender de interfaces com métodos que eles não vão usar. Ao aplicar o ISP, as interfaces são divididas em conjuntos menores e mais específicos de métodos, atendendo às necessidades individuais de cada cliente. Isso promove um design mais flexível, onde as classes só precisam implementar as interfaces relevantes para elas, reduzindo o acoplamento e facilitando a manutenção e evolução do sistema.

No exemplo [violaISP.java](https://github.com/milenaxntj/Principios-SOLID/blob/main/ISP/violaISP.java) em `Admninistrador` e em `UsuarioNormal` essas classes são obrigadas a implementar todos os métodos de `Usuario` mesmo que `UsuarioNormal` não utilize todas as funcionalidades que `Admnistrador` use.  

Já corrigido em [aplicaISP.java](https://github.com/milenaxntj/Principios-SOLID/blob/main/ISP/aplicaISP.java) As interfaces são segregadas em conjuntos menores e evita que as classes etnham que implementar métodos que não vão utilizar. 

## 3. Princípio de Inversão de Dependências (DIP)

Esse princípio sugere que as classes de alto nível não devem depender das classes de baixo nível. Ambas devem depender de abstrações. Além disso, abstrações não devem depender de detalhes. Detalhes devem depender de abstrações visando reduzir o acoplamento entre módulos de software, tornando o sistema mais flexível, fácil de manter e de testar. Ele também ajuda a promover a reutilização de código, uma vez que classes de alto nível não estão diretamente ligadas a implementações específicas de classes de baixo nível.

No exemplo [violaDIP.java](https://github.com/milenaxntj/Principios-SOLID/blob/main/DIP/violaDIP.java) a classe `ControleRemoto` está diretamente ligada às implementações concretas `Televisao` e `Lampada`, o que dificulta a extensão e reutilização do código. Já corrigido em [aplicaDIP.java](https://github.com/milenaxntj/Principios-SOLID/blob/main/DIP/aplicaDIP.java) a classe `ControleRemoto` depende apenas da abstração `DispositivoEletronico` permitindo que o mesmo controle remoto ligue diversos dispositivos sem alterar o código da classe `ControleRemoto`.

## 4. Princípio Aberto/Fechado (OCP)

Esse princípio defende que uma classe deve estar fechada para modificações e aberta para extensões. Ele afirma que uma entidade de software (classe, módulo, função, etc.) deve ser aberta para extensão, mas fechada para modificação. Isso significa que você deve poder estender o comportamento de uma entidade sem modificar seu código-fonte original. O OCP incentiva o uso de herança, interfaces e composição para permitir que novos comportamentos sejam adicionados sem modificar o código existente.

Neste exemplo [violaOCP.java](https://github.com/milenaxntj/Principios-SOLID/blob/main/OCP/violaOCP.java), se quisermos adicionar um novo tipo de pagamento, teria que modificar a classe `PaymentProcessor`, violando o OCP. Na abordagem de [aplicaOCP.java](https://github.com/milenaxntj/Principios-SOLID/blob/main/OCP/aplicaOCP.java), é possível adicionar um novo tipo de pagamento sem modificações na classe `PaymentProcessor`.


