# ine5426-compiladores

Este projeto trata do desenvolvimento de um compilador didático
para a disciplina de Construção de Compiladores (INE5426) do
Curso de Bacharelado em Ciências da Computação da Universidade
Federal de Santa Catarina (UFSC), e foi desenvolvido pelos alunos
João Fellipe Uller, Leonardo Kreuch e Uriel Kindermann Caminha.

Para o desenvolvimento desse compilador, também é utilizada a
ferramenta ANTLR, em sua versão 4.9.1, para a geração dos analisadores
léxico e sintático, a partir da definição de uma gramática de entrada.

Nas próximas subseções, daremos uma breve descrição a respeito da
compilação e da execução do presente projeto.

## Preparação do ambiente

O presente projeto é desenvolvido na linguagem Java, compatível com
**OpenJDK, versão 11.0.10**. Para compilação e execução do programa principal,
utiliza-se um sistema de Makefiles compatíveis com a especificação **GNU Make 4.2.1**.

Além das duas ferramentas citadas anteriormente, nenhuma outra dependência é necessária
para a correta execução do programa, uma vez que as classes utilizadas estão todas
disponíveis na versão nativa do Java para Linux, havendo apenas a necessidade de que a
mesma esteja com suas variáveis de ambiente corretamente configuradas.

O pacote da ferramenta *ANTLR, versão 4.9.1*, acompanha o código fonte do projeto, de modo
que não seja preciso a existência do mesmo no CLASSPATH do usuário, não havendo assim a
necessidade de download do mesmo.

## Compilando

Para fazer a compilação do programa, a partir da raiz do projeto, pode ser utilizado
o comando ```make```, ou ```make all```.

A primeira parte do target all fará uma limpeza dos binários do projeto e dos arquivos
gerados pelo ANTLR, de modo a garantir que todas as classes sejam recompiladas.
Em seguida, o utilitário fará uma cópia do arquivo da gramática que servirá de base
para o programa compilador e invocará a ferramenta ANTLR para que a mesma gere os
analisadores léxico e sintático, de acordo com o tipo da gramática especificada.
Por padrão, a gramática compilada é a gramática ```ConvCC```, gramática especificada
para o presente projeto. Por último, o utilitário Make fará a compilação de todas as
classes do projeto, incluindo aquelas geradas pelo ANTLR, resultando num arquivo
executável caso a compilação das classes aconteça sem nenhum erro.

NOTA: É possível especificar a gramática fonte no momento
da compilação passando o parâmetro ```GRAMMAR=<gramatica_alvo>``` no ```make all```.
Exemplo: ```make all GRAMMAR=basic_gramm```. É importante notar que o nome da gramática
especificada deve ter uma pasta de mesmo nome existindo no diretório ```examples/```, além
de um arquivo ```<gramatica_alvo>.g4``` dentro desta pasta que define a gramática, caso
contrário um erro de Nome de Gramática Inválido será exibido e a compilação será abortada.
**IMPORTANTE:** Esta funcionalidade existe apenas para fins de teste de desenvolvimento. Para
a avaliação do projeto que utiliza a gramática ```ConvCC``` não existe a necessidade de
definição adicional nenhuma além dos comandos ```make``` ou ```make all``` em sua versão
padrão.

## Executando

Após compilado, para fazer a execução do programa deve se utilizar o comando ```make run```,
utilizando o parâmetro ```ARGS=<caminho_do_arquivo_de_teste>``` para selecionar o arquivo
que servirá de entrada para o exercício-programa. Importante: O caminho do arquivo de teste
passado como argumento deve ser *relativo à raiz do projeto*. Os programas teste disponibilizados
para a linguagem Conv_CC estão disponíveis na pasta ```examples/conv_cc```.

Para fazer o processo de compilação do arquivo ```feira.ccc```, disponibilizado como um dos
três programas para teste: ```make run ARGS=examples/conv_cc/feira.ccc```.

Para o programa ```vet.ccc```: ```make run ARGS=examples/conv_cc/vet.ccc```.

Por fim, para o programa ```matriz.ccc```: ```make run ARGS=examples/conv_cc/matriz.ccc```.

## Arquivos de teste CCC

Como apresentado na seção anterior, os programas teste para a linguagem ConvCC encontram-se no
diretório ```examples/conv_cc```, e consiste nos arquivos ```feira.ccc```, ```vet.ccc``` e
```matriz.ccc```. O arquivo ```conv_cc.g4``` é o que contém a gramática que define a linguagem
ConvCC e serve de entrada para a ferramenta ANTLR, não sendo, portanto, passível de ser utilizado
como programa de teste.
