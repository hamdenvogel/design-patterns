# 🎯 Design Patterns em Java

**Implementações completas dos principais padrões de projeto GoF (Gang of Four) em Java**

[Sobre](#-sobre) •
[Estrutura](#-estrutura-do-projeto) •
[Padrões](#-padrões-implementados) •
[Como Usar](#-como-usar) •
[Recursos](#-recursos-adicionais)


## 📖 Sobre

Este repositório contém implementações práticas e didáticas dos **Design Patterns** (Padrões de Projeto) clássicos descritos no livro "Design Patterns: Elements of Reusable Object-Oriented Software" (Gang of Four).

Os padrões de projeto são soluções reutilizáveis para problemas comuns no desenvolvimento de software orientado a objetos. Este repositório organiza os padrões em três categorias principais:

- **Padrões Criacionais** (Creational Patterns)
- **Padrões Estruturais** (Structural Patterns)
- **Padrões Comportamentais** (Behavioral Patterns)

### 🎓 Objetivos do Projeto

- ✅ Demonstrar implementações práticas de cada padrão
- ✅ Fornecer exemplos claros e comentados
- ✅ Facilitar o aprendizado através de código real
- ✅ Servir como referência rápida para desenvolvedores

---

## 📁 Estrutura do Projeto

```
design-patterns/
│
├── 📂 creational-patterns-ref/      # Padrões Criacionais
│   └── projeto/
│       ├── src/
│       └── pom.xml
│
├── 📂 estructural-patterns-ref/     # Padrões Estruturais
│   └── projeto/
│       ├── src/
│       └── pom.xml
│
├── 📂 behavioral-patterns-ref/      # Padrões Comportamentais
│   └── projeto/
│       ├── src/
│       └── pom.xml
│
├── 📂 diagramas/                    # Diagramas UML dos padrões
│
└── 📄 Curso de Padrões (PDFs)       # Material de referência
```

---

## 🎨 Padrões Implementados

### 🏗️ Padrões Criacionais (Creational Patterns)

Lidam com a criação de objetos de forma controlada e flexível. 

| Padrão | Descrição | Quando Usar | Casos Reais |
|--------|-----------|-------------|-------------|
| **Singleton** | Garante uma única instância de uma classe | Quando apenas uma instância deve existir (ex: gerenciador de configuração) | Logger de aplicação, Pool de conexões com banco de dados, Gerenciador de cache (Redis/Memcached), Spring ApplicationContext |
| **Factory Method** | Define interface para criar objetos, mas deixa subclasses decidirem qual classe instanciar | Quando a classe não sabe antecipadamente qual classe concreta precisa criar | Frameworks de UI (botões diferentes para cada SO), Conexões de diferentes bancos de dados (MySQL, PostgreSQL, MongoDB), Document parsers (PDF, Word, Excel) |
| **Abstract Factory** | Fornece interface para criar famílias de objetos relacionados sem especificar suas classes concretas | Quando o sistema deve ser independente de como seus produtos são criados | Frameworks de UI cross-platform (Windows/Mac/Linux), Diferentes temas visuais (dark/light mode), Suporte multi-tenancy em SaaS |
| **Builder** | Separa a construção de um objeto complexo de sua representação | Quando o algoritmo de criação deve ser independente das partes que compõem o objeto | StringBuilder em Java, Construção de queries SQL (Hibernate Criteria), HTTP Request builders (OkHttp, RestTemplate), Construção de emails complexos |
| **Prototype** | Cria novos objetos copiando uma instância existente | Quando a criação de um objeto é custosa e você quer evitar recriá-lo | Clonagem de objetos de configuração, Cópia de documentos em editores, Cache de objetos complexos, Criação de células em planilhas (Excel) |

### 🔧 Padrões Estruturais (Structural Patterns)

Tratam da composição de classes e objetos.

| Padrão | Descrição | Quando Usar | Casos Reais |
|--------|-----------|-------------|-------------|
| **Adapter** | Permite que interfaces incompatíveis trabalhem juntas | Quando você quer usar uma classe existente mas sua interface não é compatível | Integração com APIs legadas, Wrapper para bibliotecas de terceiros, JDBC (adapta diferentes drivers de BD), Adapters de pagamento (PayPal, Stripe, PagSeguro) |
| **Bridge** | Separa abstração de implementação | Quando você quer evitar ligação permanente entre abstração e implementação | Drivers de banco de dados (JDBC), Sistemas multi-plataforma (AWT/Swing), Suporte a múltiplos formatos de renderização, APIs de notificação (Email, SMS, Push) |
| **Composite** | Compõe objetos em estruturas de árvore | Quando você quer representar hierarquias parte-todo | Árvore de arquivos e diretórios, Componentes de UI (containers e widgets), Estrutura organizacional de empresas, XML/JSON DOM parsers |
| **Decorator** | Adiciona responsabilidades a objetos dinamicamente | Quando você quer adicionar funcionalidades sem alterar a classe original | Java I/O Streams (BufferedReader, FileReader), Logging com diferentes níveis, Compressão/criptografia de dados, Middleware em frameworks web |
| **Facade** | Fornece interface unificada para um conjunto de interfaces | Quando você quer fornecer uma interface simples para um subsistema complexo | APIs de bibliotecas complexas, Facades de serviços REST, Camada de serviço em aplicações, Frameworks como Spring (simplifica JEE) |
| **Flyweight** | Usa compartilhamento para suportar grandes quantidades de objetos | Quando muitos objetos similares precisam ser criados | Pool de Strings em Java (String interning), Renderização de caracteres em editores de texto, Objetos de cache compartilhado, Ícones/imagens em interfaces gráficas |
| **Proxy** | Fornece um substituto ou placeholder para outro objeto | Quando você quer controlar o acesso a um objeto | Proxies de segurança/autenticação, Lazy loading de recursos, Proxies remotos (RMI, Web Services), Cache proxy, Virtual proxies para imagens grandes |

### 🎭 Padrões Comportamentais (Behavioral Patterns)

Focam na comunicação entre objetos. 

| Padrão | Descrição | Quando Usar | Casos Reais |
|--------|-----------|-------------|-------------|
| **Chain of Responsibility** | Evita acoplar remetente e receptor passando requisição por cadeia | Quando mais de um objeto pode tratar uma requisição | Filtros de servlets (Filter chain), Middlewares em Express.js, Sistema de aprovação hierárquica, Logging com múltiplos handlers |
| **Command** | Encapsula uma requisição como objeto | Quando você quer parametrizar objetos com operações | Sistema de Undo/Redo em editores, Fila de tarefas/jobs, Transações de banco de dados, Botões de interface (cada botão = comando) |
| **Iterator** | Fornece acesso sequencial aos elementos sem expor representação | Quando você quer acessar elementos sem expor a estrutura interna | Collections em Java (List, Set, Map), Cursores de banco de dados, Paginação de resultados, Stream API do Java 8+ |
| **Mediator** | Define objeto que encapsula como objetos interagem | Quando você quer reduzir acoplamento entre objetos que se comunicam | Chat rooms (mediador entre usuários), Controladores MVC, Torre de controle de aeroporto, Event buses em aplicações |
| **Memento** | Captura e externaliza estado interno de objeto | Quando você precisa salvar/restaurar o estado de um objeto | Undo/Redo em aplicações, Snapshots de transações, Salvamento de estados de jogos, Versionamento de documentos |
| **Observer** | Define dependência um-para-muitos entre objetos | Quando mudança em um objeto requer mudanças em outros | Event listeners em UI (onClick, onChange), Sistema de notificações, Pub/Sub em messaging (Kafka, RabbitMQ), Model-View binding em frameworks |
| **State** | Permite objeto alterar comportamento quando seu estado muda | Quando comportamento depende do estado e deve mudar em runtime | Máquinas de estado de pedidos (pendente, pago, enviado), Estados de conexão TCP, Workflows de aprovação, Estados de um documento (rascunho, publicado) |
| **Strategy** | Define família de algoritmos e os torna intercambiáveis | Quando você quer definir várias versões de um algoritmo | Algoritmos de ordenação (bubble, quick, merge), Estratégias de pagamento, Compressão de arquivos (ZIP, RAR, 7z), Cálculo de impostos por região |
| **Template Method** | Define esqueleto de algoritmo, delegando passos para subclasses | Quando você quer deixar subclasses redefinirem certos passos | Frameworks de testes (setUp, test, tearDown), Processamento de diferentes tipos de dados, Ciclo de vida de servlets, Spring Template classes (JdbcTemplate) |
| **Visitor** | Separa algoritmo da estrutura de objeto | Quando você quer adicionar operações sem alterar as classes | Compiladores (visitor para AST), Exportação de dados (XML, JSON, CSV), Análise de estruturas complexas, Validadores de objetos compostos |

---

## 🚀 Como Usar

### Pré-requisitos

- **Java** 8 ou superior
- **Maven** 3.6 ou superior
- IDE de sua preferência (Eclipse, IntelliJ IDEA, VS Code)

### Clonando o Repositório

```bash
git clone https://github.com/hamdenvogel/design-patterns.git
cd design-patterns
```

### Executando os Exemplos

Cada categoria de padrões possui seu próprio projeto Maven:

#### Padrões Criacionais
```bash
cd creational-patterns-ref/projeto
mvn clean install
mvn exec:java
```

#### Padrões Estruturais
```bash
cd estructural-patterns-ref/projeto
mvn clean install
mvn exec:java
```

#### Padrões Comportamentais
```bash
cd behavioral-patterns-ref/projeto
mvn clean install
mvn exec:java
```

### Importando na IDE

1. Abra sua IDE favorita
2. Importe como projeto Maven existente
3. Navegue até a pasta do padrão desejado
4. Execute os arquivos de exemplo

---

## 📚 Recursos Adicionais

### Material Incluído

- 📄 **PDFs do Curso**: Material didático completo sobre padrões de projeto
  - Curso de Padrões (Parte 1)
  - Curso de Padrões (Parte 2)
  - Curso de Padrões (Parte 3)

- 📊 **Diagramas UML**: Representações visuais dos padrões

### Referências Recomendadas

- 📖 [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612) - GoF
- 🌐 [Refactoring Guru - Design Patterns](https://refactoring.guru/design-patterns)
- 🎓 [Source Making - Design Patterns](https://sourcemaking.com/design_patterns)
- 💻 [Java Design Patterns](https://java-design-patterns.com/)

---

## 🤝 Contribuindo

Contribuições são bem-vindas! Se você deseja:

- 🐛 Reportar bugs
- 💡 Sugerir novos padrões ou melhorias
- 📝 Melhorar a documentação
- ✨ Adicionar novos exemplos

Por favor, abra uma **issue** ou envie um **pull request**.

---

## 📝 Licença

Este projeto é de código aberto e está disponível para fins educacionais.

---

## 👤 Autor

**hamdenvogel**

- GitHub: [@hamdenvogel](https://github.com/hamdenvogel)

---

## ⭐ Mostre seu apoio

Se este projeto foi útil para você, considere dar uma ⭐!

---

<div align="center">

**Feito com ❤️ para a comunidade de desenvolvedores Java**

</div>