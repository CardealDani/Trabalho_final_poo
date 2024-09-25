# Gerenciador de Tarefas

## Descrição

Este é um projeto desenvolvimento na Cadeira de Programação Orientada a Objeto, em que consiste num Gerenciamento de Tarefas que permite criar, listar e remover tarefas com diferentes níveis de prioridade. As tarefas podem ser classificadas como **Simples** ou **Importantes**. O sistema também permite associar tarefas a usuários e exibir detalhes das tarefas.

# Integrantes da Equipe
<br>
<table>
  <tr>
    <td style="text-align: center;">
      <a href="https://github.com/cacaffurtado" target="_blank"><img src="https://github.com/cacaffurtado.png"
          width="125" height="125" style="margin-right: 10px;"></a>
    </td>
    <td>
      <p><b>Carolina Furtado</b><br>≻<i>521590</i></p>
    </td>
  <td style="text-align: center;">
    <a href="https://github.com/junior-rod" target="_blank"><img src="https://github.com/junior-rod.png" width="125"
        height="125" style="margin-right: 10px;"></a>
  </td>
  <td>
    <p><b>Will Júnior</b><br>≻<i>535484</i></p>
  </td>
  <td style="text-align: center;">
    <a href="https://github.com/cardealdani" target="_blank"><img src="https://github.com/cardealdani.png" width="125"
        height="125" style="margin-right: 10px;"></a>
  </td>
  <td>
    <p><b>Daniel Cardeal</b><br>≻<i>541875</i></p>
  </td>
  </tr>
</table>
 <br>

## Funcionalidades

- Criar tarefas simples e importantes.
- Listar todas as tarefas.
- Remover tarefas.
- Exibir o total de tarefas criadas.
- Associações com usuários para tarefas importantes.

## Tecnologias Utilizadas

- **Linguagem**: Java
- **Ferramenta de Desenvolvimento**: IntelliJ IDEA

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

- `GerenciadorBase` (abstrata): Implementa a interface `Gerenciavel` e gerencia operações básicas de tarefas.
- `GerenciadorTarefas`: Herda de `GerenciadorBase` e contém um contador estático de tarefas criadas.
- `Tarefa`: Classe base para representar uma tarefa.
- `TarefaSimples`: Representa uma tarefa comum.
- `TarefaImportante`: Herda de `Tarefa` e representa tarefas com prioridade e responsável.
- `Usuario`: Representa um usuário que pode criar tarefas.
- `Prioridade` (Enum): Define três níveis de prioridade: `BAIXA`, `MEDIA`, e `ALTA`.

## Requisitos do Sistema

- **Java 8** ou superior.
- **IntelliJ IDEA** para executar o projeto.

## Como Executar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/CardealDani/Trabalho_final_poo.git

2. **Abra o projeto no IntelliJ**
- Vá em File > Open e selecione a pasta do projeto.

3. **Compilar o código**<br/>
- No painel lateral, abra a pasta src e clique com o botão direito no arquivo Main.java. Selecione Run 'Main.main()' para executar o programa.

