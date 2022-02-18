<h2> Desafio Notas e Moedas </h2>

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.


# Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

# Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.

| Exemplos de Entrada     | Exemplos de Saída |
| ----------- | -------------------------------|
| 576.73     | NOTAS: |
|            |  5 nota(s) de R$ 100.00| 
|            |  1 nota(s) de R$ 50.00|
|            | 1 nota(s) de R$ 20.00|
|            |  0 nota(s) de R$ 10.00|
|            |  1 nota(s) de R$ 5.00|
|            |  0 nota(s) de R$ 2.00|
|             |1 moeda(s) de R$|
|             |1.00|
|             | Moedas: |
|             |  1 moeda(s) de R$ 0.50|
|             | 0 moeda(s) de R$ 0.25|
|             |  2 moeda(s) de R$ 0.10|
|             | 0 moeda(s) de R$ 0.05|
|             | 3 moeda(s) de R$ 0.01|
|             |


<h2> Notação Ciêntífica</h2>

Números em ponto flutuante podem ser bastante extensos para mostrar. Nesses casos, é conveniente usar a notação científica.

Você deve escrever um programa que, dado um número em ponto flutuante, mostre este número na notação científica: sempre mostre o sinal da mantissa; sempre mostre 4 casas decimais na mantissa; use o caractere 'E' para separar a mantissa do expoente; sempre mostre o sinal do expoente; e mostre o expoente com pelo menos 2 dígitos.

# Entrada
A entrada é um número em ponto flutuante de dupla precisão X (de acordo com o padrão IEEE 754-2008). Nunca haverá um número com mais de 110 caracteres nem com mais de 6 casas decimais.

# Saída
A saída é o número X em uma única linha na notação científica detalhada acima. Veja os exemplos abaixo.

| Exemplos de Entrada     | Exemplos de Saída|
| ----------- | ----------- |
| 3.141592     | 	+3.1416E+00      |
|1.618033   | +1.6180E+00        |
|602214085774747474747474  | +6.0221E+23
|-0.000027   |  -2.7000E-05|
