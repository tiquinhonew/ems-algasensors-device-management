# EMS - AlgaSensors Device Management

Microserviço responsável pelo gerenciamento de dispositivos sensores no sistema EMS AlgaSensors.

## Funcionalidades

- Cadastro de novos sensores
- Atualização de informações dos sensores
- Remoção de sensores
- Ativação e desativação de sensores
- Consulta de sensores cadastrados

## Tecnologias Utilizadas

- Java 21
- Spring Boot 3.5.x
- JPA/Hibernate
- H2 Database (para desenvolvimento)
- Lombok
- Gradle

## Como Executar

1. Clone o repositório principal (caso ainda não tenha feito):
   ```sh
   git clone --recurse-submodules git@github.com:tiquinhonew/ems-algasensors-device-management.git
   ```

2. Acesse a pasta do microserviço:
   ```sh
   cd microservices/device-management
   ```

3. Execute o serviço:
   ```sh
   ./gradlew bootRun
   ```

O serviço estará disponível em `http://localhost:8080`.

## Endpoints Principais

- `POST /devices` – Cadastrar novo sensor
- `GET /devices` – Listar sensores
- `GET /devices/{id}` – Consultar sensor por ID
- `PUT /devices/{id}` – Atualizar sensor
- `DELETE /devices/{id}` – Remover sensor
- `PATCH /devices/{id}/activate` – Ativar sensor
- `PATCH /devices/{id}/deactivate` – Desativar sensor

## Configuração

O microserviço utiliza o banco de dados H2 em memória para desenvolvimento. As configurações podem ser ajustadas no arquivo `application.yml`.

## Testes

Para rodar os testes automatizados:
```sh
./gradlew test
```

## Licença

MIT License © Douglas Moraes