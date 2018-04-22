# JSON (exercícios)

**1. Quais são os valores (“literais”) admitidos em JSON? Não confunda com aqueles escritos entre aspas (sequências de caracteres).**
>true, false, null e numbers.
---
**2. Qual é o MIME type para arquivo contendo dados no formato JSON?**
>application/json.
---
**3. Você consegue identificar o problema no arquivo JSON abaixo?**
<pre>
{	"a":[1,3], 
	"bool": true,
	"null": nil,
	"n":123,
	"o":{"a":"b","c":"d" },
	"str":"a"
}
</pre>
>nill  não é um valor literal e não se encontra entre aspas.
---
**4. Qual seria um possível arquivo JSON contendo dados correspondentes a uma instância de um objeto da classe Bicycle (disponível [aqui](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html))?**
>{   
>  "cadence": 70,   
>  "gear": 15,   
>  "speed": 60   
>}
---
**5. Qual seria a representação em JSON de um objeto contendo as seguintes propriedades (e valores correspondentes)? Propriedades seguem em negrito.**
* a. lista de **cidades**: Goiânia e Trindade;   
>{ "cidades": ["Goiânia", "Trindade"] }
* b. **salada**: alface;
>{ "salada": "alface" }
* c. **altura**: 2,3;
>{ "altura": [2,3] }
* d. **sabor** preferido: (nenhum valor fornecido para esta propriedade);
>{ "sabor": null }
---
**6. Por meio do portal de serviços http://www.jsontest.com/ várias requisições podem ser realizadas e cujas respostas seguem no formato JSON. Por exemplo, o comando curl http://headers.jsontest.com produz como resultado, em formato JSON, todos os headers enviados na requisição. Usando o curl com a opção -v é possível verificar que, de fato, todos os headers enviados são retornados no formato JSON. Outra requisição é curl http://ip.jsontest.com que retorna o endereço IP da origem da requisição. Exercite os serviços oferecidos por esse portal.**
>![imagem](https://github.com/antoni-s/i-2018/blob/master/topico2/_docs/json-exercicios.png)
