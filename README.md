# 📚 Solutis School Dev Trail

Este repositório contém uma série de exercícios propostos pela Solutis School Dev Trail. Os exercícios foram resolvidos em Java, desenvolvidos por diferentes contribuintes para demonstrar suas habilidades na linguagem Java.
As questões foram realizadas usando a IDE IntelliJ, portanto a resolução se encontra dentro da pasta "src", sendo que cada questão começa com um "Q" e o seu numero de referência.

## 🤝 Contribuintes

O repositório é composto por 5 contribuintes, cada um responsável por resolver um número determinado de questões. Abaixo está a lista de contribuintes e o número de questões resolvidas por cada um:

- **Alice Lima Soares**: 21, 22, 31, 32, 33, 34, 35, 36, 37 e 59.
- **Danrley Silva de Jesus**: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 23 e 24.
- **Landerson Evangelista Miranda**: 25, 26, 38, 39, 40, 41, 42, 43, 44, 60 e 61.
- **Leandro de Almeida**: 27, 28, 45, 46, 47, 48, 49, 50, 51, 62 e 63.
- **Maria Eduarda Oliveira Sotério**: 29, 30, 52, 53, 54, 55, 56, 57, 58, 64 e 65.

## 📝 Questões

### Conjunto 1: programas seqüenciais com entrada, cálculo e saída
1. Determine qual é a idade que o usuário faz no ano atual. Para isso solicite o seu ano de
nascimento e o ano atual.
2. Calcule e exiba a quantidade de salários mínimos que um determinado funcionário ganha.
Para isto, peça o valor do seu salário e o valor do salário mínimo atual.
3. Solicite a quantidade de homens e de mulheres de uma turma da faculdade. Em seguida
calcule e exiba o percentual (separadamente) de homens e mulheres desta turma.
Obs.: em Java a divisão de valores inteiros dá como resultado um número inteiro, ao menos
que um dos números seja do tipo ponto flutuante (double, por exemplo). Para transformar
inteiro para double basta fazer um cast: “(double)x” - transforma “x” em double.
4. Determine e exiba a média aritmética de um aluno a partir de suas 4 notas.
5. Calcule e exiba o valor final de uma dívida. Para isto pergunte ao usuário o valor inicial do
débito, a quantidade de meses e os juros mensais. Use o calculo de juros simples.
6. Calcule e exiba área ocupada por um círculo cujo raio mede 5 metros. A área de um círculo
é ¶ multiplicado pelo raio elevado ao quadrado. Em Java o valor de ¶ está disponível em
Math.PI
7. Calcule e exiba a comissão de 10% de um garçom num restaurante a partir do valor da
despesa de um cliente.

### Conjunto 2: programas com estruturas condicionais
8. Transforme um número Racional (formado por numerador e denominador) para um número
Real. Antes de dividir, verifique se o denominador é diferente de zero. Emita uma
mensagem de alerta ao usuário se for zero.
9. Verifique se o usuário é maior de idade ou não.
10. Um banco concede empréstimo a seus clientes no valor máximo de 30% do valor do seu
salário liquido. Receba o valor do salário bruto, o valor dos descontos e o valor do possível
empréstimo de um cliente, em seguida avise se ele poderá ou não fazer o empréstimo.
11. A partir da idade informada de um cidadão diga se ele não pode votar (idade inferior a 16),
ou se o voto é facultativo (idade menor ou igual a 16, ou maior ou igual a 65), ou ainda se o
voto é obrigatório.
12. A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, ficou de
recuperação ou foi reprovado. A média de aprovação é >= 7.0; a média de recuperação
é >= 5.0 e < 7.0; e a média do reprovado é < 5.0
13. Acrescente no problema anterior possibilidade dele fazer prova final em caso de
recuperação. Neste caso a nota de aprovação passa a ser >= 5.0
14. Receba do usuário o nome de um mês. Exiba o número equivalente.
Obs.: para comparar Strings em Java deve-se usar o método equals ou equalsIgnoreCase,
mas nunca o operador “==”. Por exemplo, para comparar a variável nome com “Maria”
deve-se usar: if(nome.equals(“Maria”) ...
15. Verifique a validade de uma data de aniversário (solicite apenas o número do dia e do mês).
Além de falar se a data está ok, informe também o nome do mês.
Dica: meses com 30 dias: abril, junho, setembro e novembro.
16. Acrescente no exercício anterior se a pessoa nasceu no 1º, 2º, 3º ou 4º trimestre.
17. Acrescente no exercício anterior a apresentação do signo do horóscopo da pessoa.
18. Inclua no exercício anterior a solicitação do ano de nascimento e também da data de hoje. A
partir destas informações, apresente a idade atual desta pessoa.
19. Exiba dois números fornecidos pelo usuário em ordem crescente.
20. Solicite o nome e a idade de duas pessoas. Em seguida exiba o nome da pessoa mais
velha e o nome da pessoa mais nova.
21. Exiba o valor do empréstimo possível para um funcionário de uma empresa.
Sabe-se:

| Cargo    | % do salário |
| -------- | ------------ |
|Diretoria |  30%         |
| Gerência | 25%          |
| Operacional | 20%       |

22. Verifique se duas datas de aniversário (dia e mês) são iguais.
23. Verifique quem entre duas pessoas faz aniversário primeiro. Exiba o nome do primeiro
aniversariante considerando que estamos no dia 1 de janeiro. Use como entrada o nome, o
dia e o mês de nascimento de cada pessoa.
24. Faça a verificação da validade de uma data completa (dia, mês e ano).
Obs. um ano é bissexto, cujo mês de fevereiro possui 29 dias, se o resto da divisão do ano
por 4 e também por 100 for zero, ou ainda se o resto da divisão por 400 for zero. Os meses
com 30 dias são 4, 6, 9 e 11, os demais tem 31 dias.
Obs. Resto da divisão em Java é calculado com o operador %.
25. Valide um horário composto de horas, minutos e segundos.
26. Receba 2 horários e exiba a diferença entre eles em segundos. A entrada destes horários
pode ocorrer em qualquer ordem.
Dica: transforme os dois horários para segundos.
27. Descubra e apresente o maior entre três números fornecidos pelo usuário. Caso eles sejam
iguais, avise ao usuário.
28. Coloque em ordem crescente três números quaisquer.
Como desafio, tente depois fazer uma solução com apenas 3 estruturas de decisão.
29. Receba do usuário dois pontos do plano cartesiano. Estes pontos devem representar os
vértices superior esquerdo e inferior direito de um retângulo paralelo aos eixos x e y.
Primeiramente informe se estes pontos podem constituir um retângulo, ou seja:
- se é um retângulo
- se é uma reta horizontal
- se é uma reta vertical
- se é um ponto
Depois, calcule e exiba área deste retângulo.
Em seguida, receba outro ponto e exiba a posição dele em relação ao retângulo.
Uma das 10 seguintes situações é possível:
- acima e à esquerda
- acima
- acima e à direita
- embaixo e à esquerda
- embaixo
- embaixo e à direita
- à esquerda
- à direita
- dentro do retângulo
- na linha do retângulo
30. Receba dois retângulos através dos seus quatro vértices. Cada vértice é um ponto e é
formado por duas coordenadas x e y. Faça a crítica destes pontos, pois eles não podem se
sobrepor. Observe que o usuário pode fornecê-los em qualquer ordem. Em seguida informe
se os dois retângulos se interceptam em algum lugar.

### Conjunto 3: programas com estruturas de repetição
31. Exiba mil vezes o número 100.
32. Exiba todos os números de 1 a 500, um ao lado do outro com um espaço em branco de
separação.
33. Exiba todos os números pares de 10 a 200.
34. Exiba 50 números sorteados de 1 a 100 para o usuário.
35. Exiba uma quantidade de números sorteados determinada pelo usuário. Peça também que
o usuário determine a faixa do sorteio.
36. Exiba todos os números ímpares existentes entre dois números informados pelo usuário.
Dica: use o operador % para calcular o resto da divisão entre dois números.
37. Calcule o fatorial de um número.
38. Verifique se um número é primo ou não.
39. Verifique se um número é perfeito, ou seja, se a soma dos seus divisores (exceto o próprio
número) é igual a ele mesmo.
40. Solicite ao usuário a idade de cada um componente de um grupo de pessoas. A quantidade
de pessoas também será determinada por ele.
Após o término da entrada, apresente:
a. a média das idades,
b. a maior idade,
c. a menor idade,
d. a quantidade de pessoas maior de idade.
41. Crie um jogo para o usuário descobrir um número sorteado de 1 a 100. A cada tentativa
dele, forneça uma dica falando se o número é maior ou menor. Quando ele descobrir exiba
uma mensagem de parabéns e mostre em quantas tentativas ele conseguiu.
42. Aproveitando o algoritmo do exercício anterior, exiba uma lista de 40 grupos de números
sorteados de 0 a 59. Cada grupo possui 3 números e deve exibido em ordem crescente.
43. Calcule a média aritmética de 500 valores fornecidos pelo usuário.
44. Modifique o problema anterior para que a quantidade de valores também seja fornecida pelo
usuário.
45. Determine o maior valor de uma lista de 100 números fornecidos pelo usuário.
46. Determine a quantidade de homens e mulheres (separadamente) que são maiores de
idade, baseado numa lista de 200 pessoas.
47. Leia uma relação de pacientes de uma clínica, cada um com o nome, o sexo, o peso, a
idade e a altura. Para sinalizar o fim da lista será fornecido “fim” no nome do último
paciente.
Exiba um relatório contendo:
i. a quantidade de pacientes.
ii. a média de idade dos homens.
iii. a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
iv. a quantidade de pessoas com idade entre 18 e 25.
v. o nome do paciente mais velho.
vi. o nome da mulher mais baixa.
vii. – neste item, você cria uma situação interessante constrói o algoritmo correspondente.
48. Descida se um aluno será aprovado, reprovado por nota ou reprovado por faltas. Use o
sistema de avaliação da FAESA. Pergunte ao usuário a quantidade de notas para cálculo
da média semestral, sendo que todas elas possuem o mesmo peso.
49. Exiba os 50 primeiros números da seqüência de Fibonacci
(1,1,2,3,5,8,13,21,34,55,89,144,233,377,...).
50. Imprima exatamente o n-ezimo termo da seqüência de Fibonacci.
51. Exiba os n primeiros termos da seqüência de Tribonacci (soma dos três anteriores). Inicia
com 1,1 e 2.
52. A história do rei que e tornou pobre: após perder uma aposta com um súdito, ele teve que
pagar uma quantia muito grande em sacos de arroz. A aposta feita anteriormente era que
se o súdito ganhasse o rei teria que pagar um grão de arroz colocado na primeira casa de
um tabuleiro de xadrez. Na segunda casa teria que pagar o dobro, ou seja, dois grãos de
arroz, e assim sucessivamente até a casa número 64. Exiba quantos grãos de arroz este
súdito teria que ganhar, somando todas as 64 casas.
Depois tente exibir a quantia de sacos de arroz?
53. Exiba a tabuada de um número fornecido pelo usuário. Por exemplo se ele digitar o número 5, então
será mostrado:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
54. Apresente uma tabela de conversão de reais em dólares. Ela deve ser totalmente
configurável, ou seja o usuário pode informar o valor inicial e final, o valor de incremento e o
valor de 1 dólar. Apresente os números no formato monetário com duas casas decimais.
55. A operadora de celular Vai-Vai possui um plano com o valor mensal de 50,00 que permite
100 minutos por mês para qualquer número. Além disso, ela oferece 50 minutos a mais
para ligações destinadas a um número da própria Vai-Vai. Ainda neste plano ela tem uma
promoção onde cada minuto gasto para telefone fixo consome somente a metade. O valor
do minuto excedente para outras operadoras é de 0.65, e para a própria Vai-Vai é 0.20.
Faça um programa que permita ao usuário entrar com o tipo de ligação (‘o’ = outras
operadoras, ‘v’ = a própria Vai-Vai, ou ‘f’ = telefone fixo) e a quantidade de minutos. A cada
entrada, deve-se informar o quanto que ele tem de saldo e o valor a pagar. Faça isto
enquanto ele indicar que existem mais ligações a serem digitadas.
56. Crie um programa para simular uma urna de votação para exatamente 3 candidatos. Logo
no início deve-se perguntar ao usuário os nomes dos candidatos. Permita votos em branco.
Ao término de toda a entrada, apresente o nome, a quantidade de votos e o percentual de
cada candidato. Apresente também a quantidade e o percentual dos votos em branco e
quem foi o ganhador da eleição.
57. Exiba todas as datas de um calendário que estão entre duas datas informadas pelo usuário
(dia, mês e ano). Suponha que as duas datas informadas sejam válidas.
58. Leia uma data e uma quantidade de dias, em seguida exiba esta data somada pela
quantidade de dias fornecida. Exemplo: 29/04/2007 + 3 = 02/05/2007.

### Conjunto 4: programas com estruturas de repetição aninhadas
59. Exiba as 10 tabuadas (de 1 a 10).
60. Apresente uma tabela contendo a evolução do valor de uma dívida ao longo dos meses e anos a
partir de janeiro de 2007. Solicite o valor da dívida, a taxa de correção e a quantidade de anos.
Por exemplo, para uma dívida de R$ 100,00 ao longo de 2 anos e com uma taxa de correção de 1.8
% ao mês:

| Anos | Jan    | Fev    | Mar    | Abr    | Mai    | Jun    | Jul    | Ago    | Set    | Out    | Nov    | Dez    |
|------|--------|--------|--------|--------|--------|--------|--------|--------|--------|--------|--------|--------|
| 2007 | 100,00 | 101,80 | 103,63 | 105,50 | 107,40 | 109,33 | 111,30 | 113,30 | 115,34 | 117,42 | 119,53 | 121,68 |
| 2008 | 123,87 | 126,10 | 128,37 | 130,68 | 133,03 | 135,43 | 137,87 | 140,35 | 142,87 | 145,45 | 148,06 | 150,73 |


61. Desenhe a seguinte pirâmide de asteriscos. O usuário determina a quantidade de linhas.
```plaintext
*
**
***
****
*****
******
*******
********
*********
**********
***********
************
...
```
62. Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas.
```
01
02 02
03 03 03
04 04 04 04
05 05 05 05 05
06 06 06 06 06 06
07 07 07 07 07 07 07
08 08 08 08 08 08 08 08
09 09 09 09 09 09 09 09 09
10 10 10 10 10 10 10 10 10 10
11 11 11 11 11 11 11 11 11 11 11
...
```
63. Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas.
```
01
01 02
01 02 03
01 02 03 04
01 02 03 04 05
01 02 03 04 05 06
01 02 03 04 05 06 07
01 02 03 04 05 06 07 08
01 02 03 04 05 06 07 08 09
01 02 03 04 05 06 07 08 09 10
01 02 03 04 05 06 07 08 09 10 11
...
```
64. Desenhe a seguinte seqüência de triângulos. O usuário determina a quantidade de
triângulos.
```
*
*
**
*
**
***
*
**
***
****
*
**
***
****
*****
*
**
***
****
*****
******
*
**
***
****
*****
******
*******
...
```

65. Desenhe a seguinte pirâmide de asteriscos. O usuário determina a quantidade de linhas.
```
       *
      ***
     *****
    *******
   *********
  ***********
 *************
***************
...
```
