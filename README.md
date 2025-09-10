--App para gerir atividades desportivas--

A estrutura geral do projeto passa pelas seguintes camadas:
    
    Models - Definem as entidades JPA que representam as tabelas da base de dados
    Repositories - Interfaces que comunicam com a base de dados via Spring Data JPA
    Services - Camada de lógica de negócio, que interage com os repositórios
    Controllers - Recebem as requisições HTTP e preparam os dados para as views (Thymeleaf)
    Resources - Contém os templates HTML, imagens e arquivos estáticos