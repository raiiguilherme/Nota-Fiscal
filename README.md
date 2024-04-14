# Microsserviços de Cliente e de Nota Fiscal

Neste exemplo, criei do zero dois microsserviços, um de cliente (este que por sua vez possui dominios de Cliente, Compras e Produtos) e um de geração de notas fiscais.

## Funcionamento:

  * Entrando na url: "localhost:8085/clientes" e passando no corpo da requisição um nome e um cpf, é possivel criar um cliente.
 * Logo após criar um cliente, é possivel criar uma compra para esse cliente na url: "localhost:8085/clientes/compra/{cpf}" passando o cpf na url.
 * Após criar a compra, ela estará associada a um cliente. É possivel observar isso dando um get na url "localhost:8085/clientes" passando o cpf do cliente via parametros.

### Nota fiscal:
  Entrando na url:"localhost:8086/nota/criar" e passando o cpf do cliente via parametros, é possivel criar uma nota fiscal e associar ela a um cliente e a ultima compra feita por este cliente,
  como notas fiscais sao geradas sempre para a ultima comrpa feita, foi dessa forma que implementei.

  * A resposta deve ser algo como:
   * {
	"codigoNotaFiscal": "75a04751-8def-4606-bb90-1ac7f8ad46b8",
	"id_cliente": 11,
	"id_compra": 17
  }


  
