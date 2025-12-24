# 📱 GitHub Portfolio Search App

Este é um aplicativo Android simples desenvolvido em Kotlin que permite ao usuário buscar e visualizar os repositórios públicos de qualquer perfil do GitHub. O app salva o nome do usuário localmente e oferece opções para compartilhar ou abrir os repositórios no navegador.

---

## 🚀 Funcionalidades

- Entrada de nome de usuário do GitHub
- Persistência do nome com `SharedPreferences`
- Listagem dos repositórios públicos via API do GitHub
- Compartilhamento de links dos repositórios
- Abertura dos repositórios no navegador
- Redefinição do nome de usuário salvo

---

## 🧩 Estrutura do Projeto

- `MainActivity.kt`: Tela principal com entrada de usuário e lógica de busca
- `RepositoryAdapter.kt`: Adapter do RecyclerView para exibir os repositórios
- `GitHubService.kt`: Interface Retrofit para comunicação com a API do GitHub
- `Repository.kt`: Modelo de dados para representar um repositório
- `repository_item.xml`: Layout de cada item da lista
- `activity_main.xml`: Layout da tela principal

---

## 📌 TODOs Implementados

| Nº   | Descrição                                                                 |
|------|---------------------------------------------------------------------------|
| 1    | Recuperar os IDs da tela com `findViewById`                              |
| 2    | Configurar o clique do botão "Confirmar"                                 |
| 3    | Salvar o nome do usuário com `SharedPreferences`                         |
| 4    | Exibir o nome salvo no `EditText` ao abrir o app                         |
| 5    | Configurar Retrofit com `GsonConverterFactory`                           |
| 6    | Fazer chamada à API do GitHub e tratar resposta                          |
| 7    | Configurar o Adapter e passar a lista de repositórios                    |
| 8    | Realizar o bind dos dados no `ViewHolder`                                |
| 9    | Retornar o tamanho da lista no Adapter                                   |
| 10   | Implementar o `ViewHolder` com `TextView` e botão de compartilhamento    |
| 11   | Compartilhar link do repositório via `Intent.ACTION_SEND`               |
| 12   | Abrir link do repositório no navegador via `Intent.ACTION_VIEW`         |

---

## 🛠️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/dio-portfolio-proj.git


2. Abra o projeto no Android Studio ou VS Code com extensão Android.

3. Execute o app em um emulador ou dispositivo físico.


🔗 API Utilizada
GitHub REST API v3


📷 Interface
A tela principal contém:

Campo de texto para nome do usuário

Botão "Confirmar"

Lista de repositórios com botão de compartilhar

🤝 Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.