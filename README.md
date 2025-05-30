=========================
📌 API_CHAVEACESSO (Autenticação)
=========================

✅ Gerar uma nova chave de acesso
- Método: POST
- URL: http://localhost:8082/auth/gerar
- Body: Vazio
- Headers: Nenhum necessário

✅ Obter a última chave gerada
- Método: GET
- URL: http://localhost:8082/auth/chave
- Headers: Nenhum necessário

=========================
📌 API_PRODUTOS (Gerenciamento de Produtos)
=========================

✅ Criar um produto
- Método: POST
- URL: http://localhost:8081/produtos
- Headers:
  Key: Chave-Acesso
  Value: SUA_CHAVE_GERADA_AQUI
- Body (JSON):
{
  "nome": "Notebook Gamer",
  "valor": 4500.00,
  "dataCadastro": "2025-05-26T15:00:00"
}

✅ Listar todos os produtos
- Método: GET
- URL: http://localhost:8081/produtos
- Headers:
  Key: Chave-Acesso
  Value: SUA_CHAVE_GERADA_AQUI

✅ Buscar um produto específico pelo ID
- Método: GET
- URL: http://localhost:8081/produtos/{id}
- Headers:
  Key: Chave-Acesso
  Value: SUA_CHAVE_GERADA_AQUI

✅ Atualizar um produto
- Método: PUT
- URL: http://localhost:8081/produtos/{id}
- Headers:
  Key: Chave-Acesso
  Value: SUA_CHAVE_GERADA_AQUI
- Body (JSON):
{
  "nome": "Notebook Gamer Atualizado",
  "valor": 4800.00,
  "dataCadastro": "2025-05-26T15:00:00"
}

✅ Excluir um produto
- Método: DELETE
- URL: http://localhost:8081/produtos/{id}
- Headers:
  Key: Chave-Acesso
  Value: SUA_CHAVE_GERADA_AQUI

=========================
📌 API_CLIENTES (Gerenciamento de Clientes)
=========================

✅ Criar um cliente
- Método: POST
- URL: http://localhost:8081/clientes
- Headers:
  Key: Chave-Acesso
  Value: SUA_CHAVE_GERADA_AQUI
- Body (JSON):
{
  "nome": "Lucas Silva",
  "telefone": "11999999999",
  "dataCadastro": "2025-05-26T15:00:00"
}

✅ Listar todos os clientes
- Método: GET
- URL: http://localhost:8081/clientes
- Headers:
  Key: Chave-Acesso
  Value: SUA_CHAVE_GERADA_AQUI

✅ Buscar um cliente específico pelo ID
- Método: GET
- URL: http://localhost:8081/clientes/{id}
- Headers:
  Key: Chave-Acesso
  Value: SUA_CHAVE_GERADA_AQUI

✅ Atualizar um cliente
- Método: PUT
- URL: http://localhost:8081/clientes/{id}
- Headers:
  Key: Chave-Acesso
  Value: SUA_CHAVE_GERADA_AQUI
- Body (JSON):
{
  "nome": "Lucas Silva Atualizado",
  "telefone": "11988887777",
  "dataCadastro": "2025-05-26T15:00:00"
}

✅ Excluir um cliente
- Método: DELETE
- URL: http://localhost:8081/clientes/{id}
- Headers:
  Key: Chave-Acesso
  Value: SUA_CHAVE_GERADA_AQUI

=========================
Comandos para testar no MySQL
=========================

✅ Ver todos os dados das chaves de acesso geradas:
SELECT * FROM chaves_acesso;

✅ Buscar a última chave gerada:
SELECT * FROM chaves_acesso ORDER BY id DESC LIMIT 1;

✅ Excluir uma chave manualmente pelo ID:
DELETE FROM chaves_acesso WHERE id = 1;
