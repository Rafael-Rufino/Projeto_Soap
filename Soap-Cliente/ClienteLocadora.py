from zeep import Client

class Filmes: 
    pass ##O pass fuciona como ser fosse um placeholder e 
         # os campos pode ser atribuidos conform for utilizado

def novoFilme():
    filme = Filmes()
    filme.titulo = input('Digite o titulo do filme: ')
    filme.anoLancamento = input('Informe o ano de lancamento: ')
    filme.idioma = input('Informe o idioma do filme: ')
    filme.genero = input('Informe o genero do filme: ')
    filme.sinopse = input('Digite a sinopse do filme: ')
    return filme

def main():
     ## O zeep importa XML para o cliente consumir o serviço 
    client = Client('http://localhost:9876/Filmes/?wsdl')
    # Menu para interacao
    print('-=-=-=-=-=- LOCADORA -=-=-=-=-=-')
    while True:
        print('\nMenu:\n')
        print('[1] Inserir filme')
        print('[2] Listar filmes')
        print('[0] Sair')
        opcao = input('\nSelecione uma opcao: ')
        if opcao == '1':
            # Acessar os metodos do WebService
            filmes = novoFilme()
            client.service.insereFilme(filmes.titulo, filmes.anoLancamento, filmes.idioma, filmes.genero, filmes.sinopse)
        elif opcao == '2':
            filme = client.service.retornaFilmes()
            for filmes in filme:
                print('')
                print("Codigo:",filmes.codigo)
                print("Titulo:",filmes.titulo)
                print("Ano de Lançamento:",filmes.anoLancamento)
                print("Idioma:",filmes.idioma)
                print("Genero:",filmes.genero)
                print("Sinospe:",filmes.sinopse)
              
              
        elif opcao == '0':
            break
        else:
            print('Opção invalida!')
if __name__ == '__main__':
    main()