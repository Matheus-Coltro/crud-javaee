# crud-javaee
Web Java EE application
# CRUD de Usuários - Java EE + Hibernate + PrimeFaces

Projeto **CRUD** de usuários, desenvolvido com **Java EE**, **Hibernate (JPA)**, **PrimeFaces** e **PostgreSQL**.

Objetivo simples de servir como exemplo prático de integração entre **back-end JavaEE** e **banco de dados relacional** usando **Hibernate ORM**, além do teste de deploy por meio do servidor **WildFly**.

---

## 🚀 Tecnologias Utilizadas

- **Java EE (Jakarta Faces)**
- **Hibernate / JPA (Java Persistence API)**
- **EJB (Enterprise JavaBeans)** 
- **PrimeFaces 8.0**
- **PostgreSQL**
- **Maven**
- **WildFly / JBoss** (deploy)
- **JSF (JavaServer Faces)**

---

## 📂 Estrutura do Projeto

crud-usuarios/
 ├── src/main/java/
 │    ├── model/           # Entidade Usuario
 │    ├── dao/             # Camada de acesso a dados (UsuarioDAO)
 │    └── bean/            # ManagedBean (UsuarioBean) -> comunicação com a view
 │
 ├── src/main/resources/
 │    └── META-INF/persistence.xml   # Configuração do JPA/Hibernate (Camada de persistência)
 │
 ├── src/main/webapp/
 │    ├── WEB-INF/
 │    │   ├── web.xml      # Configurações da aplicação
 │    │   └── usuarios.xhtml  # Página JSF (formulário CRUD)
 │
 ├── pom.xml               # Configuração do Maven (dependências)
 └── README.md             # Documentação

---

## 🗄️ Banco de Dados

O projeto utiliza **PostgreSQL**.  
Crie um banco de dados e configure suas credenciais no arquivo:

📌 `src/main/resources/META-INF/persistence.xml`

Exemplo:
<property name="javax.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/crud_javaee"/>
<property name="javax.persistence.jdbc.user" value="postgres"/>
<property name="javax.persistence.jdbc.password" value="postdba"/>
<property name="javax.persistence.jdbc.driver" value="org.postgresql.Driver"/>

---

## ⚙️ Como Executar o Projeto

1. **Clonar o repositório**
   bash
   $ git clone https://github.com/Matheus-Coltro/crud-javaee.git
   $ cd crud-javaee/crud-usuarios

2. **Compilar e empacotar com Maven**
   cmd
   mvn clean package

   Isso irá gerar o arquivo `.war` em `target/crud-usuarios.war`.

3. **Deploy no servidor de aplicações**  
   - Copie o `.war` para a pasta .\standalone\deployments do **WildFly/JBoss**.
   - Inicie o servidor e acesse no navegador:
   `http://localhost:8080/crud-usuarios`


---

## 👨‍💻 Funcionalidades

- ➕ Criar novo usuário  
- 📖 Listar usuários cadastrados  
- ✏️ Editar informações de usuário  
- ❌ Excluir usuário  

A interface utiliza **PrimeFaces** para uma melhor experiência.

---

## 📜 Licença

Este projeto é apenas um material de estudo, integrando múltiplas tecnologias para uma mesma aplicação.