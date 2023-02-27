Você foi contratado para desenvolver um sistema de venda de ingressos para shows e eventos. Esse sistema deve conter as seguintes regras:

Armazenar dados de evento: o evento deve ter como atributos, nome, dados, valor único, capacidade máxima e uma lista de ingressos vendidos. Essas informações são obrigatórias.

Armazenar dados de Ingresso: todo ingresso deve ser nominal, portanto deve ter o nome, CPF e o evento relacionado.

Devem existir 3 categorias de ingresso: Ingresso Pista, Ingresso VIP e Ingresso Camarote.

Nas classes de Ingressos, deve existir um método de cálculo do valor do ingresso, onde Pista é o valor único do evento, no VIP deve-se adicionar 30% sobre o valor único do evento e no Camarote adicionar 60%.

Para Ingresso, é preciso também um método mostrar resumo, onde mostrará o nome e o CPF do dono do ingresso e os dados do evento, como nome do evento e os dados.

Para cada tipo de ingresso, crie um método imprimirValor que retorna o tipo de ingresso com o valor calculado.

Para Evento deve existir um método venderIngresso, o qual irá adicionar o ingresso criado na lista, verificando se não excede a capacidade máxima do evento.

Para Evento, deve existir também um método para mostrar a quantidade de receita vendida.

Para o funcionamento do programa, poderá ser criada uma classe main para que se crie os objetos e executem os métodos, sem ter a necessidade da criação de uma interação com o usuário
