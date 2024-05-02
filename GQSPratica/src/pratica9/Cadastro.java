package pratica9;

public class Cadastro {
    private PessoaFisica[] pessoasFisicas;
    private PessoaJuridica[] pessoasJuridicas;
    private int numPessoasFisicas;
    private int numPessoasJuridicas;

    // Construtor
    public Cadastro() {
        pessoasFisicas = new PessoaFisica[100];
        pessoasJuridicas = new PessoaJuridica[100];
        numPessoasFisicas = 0;
        numPessoasJuridicas = 0;
    }

    // Métodos para cadastrar pessoas físicas e jurídicas
    public void cadastrarPessoaFisica(String nome, String cpf) {
        PessoaFisica novaPessoa = new PessoaFisica(nome, cpf);
        pessoasFisicas[numPessoasFisicas] = novaPessoa;
        numPessoasFisicas++;
    }

    public void cadastrarPessoaJuridica(String nome, String cnpj) {
        PessoaJuridica novaPessoa = new PessoaJuridica(nome, cnpj);
        pessoasJuridicas[numPessoasJuridicas] = novaPessoa;
        numPessoasJuridicas++;
    }

    // Métodos para imprimir os vetores de cadastro
    public void imprimirPessoasFisicas() {
        System.out.println("Pessoas Físicas:");
        for (int i = 0; i < numPessoasFisicas; i++) {
            System.out.println("Nome: " + pessoasFisicas[i].getNome() + ", CPF: " + pessoasFisicas[i].getCpf());
        }
    }

    public void imprimirPessoasJuridicas() {
        System.out.println("Pessoas Jurídicas:");
        for (int i = 0; i < numPessoasJuridicas; i++) {
            System.out.println("Nome: " + pessoasJuridicas[i].getNome() + ", CNPJ: " + pessoasJuridicas[i].getCnpj());
        }
    }

    // Método para pesquisar por CPF ou CNPJ
    public void pesquisar(String cpfOuCnpj) {
        boolean encontrado = false;
        for (int i = 0; i < numPessoasFisicas; i++) {
            if (pessoasFisicas[i].getCpf().equals(cpfOuCnpj)) {
                System.out.println("Pessoa Física encontrada:");
                System.out.println("Nome: " + pessoasFisicas[i].getNome() + ", CPF: " + pessoasFisicas[i].getCpf());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            for (int i = 0; i < numPessoasJuridicas; i++) {
                if (pessoasJuridicas[i].getCnpj().equals(cpfOuCnpj)) {
                    System.out.println("Pessoa Jurídica encontrada:");
                    System.out.println("Nome: " + pessoasJuridicas[i].getNome() + ", CNPJ: " + pessoasJuridicas[i].getCnpj());
                    encontrado = true;
                    break;
                }
            }
        }
        if (!encontrado) {
            System.out.println("CPF ou CNPJ não encontrado.");
        }
    }

    // Método para atualizar por CPF ou CNPJ
    public void atualizar(String cpfOuCnpj, String novoNome) {
        boolean encontrado = false;
        for (int i = 0; i < numPessoasFisicas; i++) {
            if (pessoasFisicas[i].getCpf().equals(cpfOuCnpj)) {
                pessoasFisicas[i].setNome(novoNome);
                System.out.println("Nome da pessoa física atualizado com sucesso.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            for (int i = 0; i < numPessoasJuridicas; i++) {
                if (pessoasJuridicas[i].getCnpj().equals(cpfOuCnpj)) {
                    pessoasJuridicas[i].setNome(novoNome);
                    System.out.println("Nome da pessoa jurídica atualizado com sucesso.");
                    encontrado = true;
                    break;
                }
            }
        }
        if (!encontrado) {
            System.out.println("CPF ou CNPJ não encontrado.");
        }
    }

    // Método para excluir por CPF ou CNPJ
    public void excluir(String cpfOuCnpj) {
        boolean encontrado = false;
        for (int i = 0; i < numPessoasFisicas; i++) {
            if (pessoasFisicas[i].getCpf().equals(cpfOuCnpj)) {
                for (int j = i; j < numPessoasFisicas - 1; j++) {
                    pessoasFisicas[j] = pessoasFisicas[j + 1];
                }
                numPessoasFisicas--;
                System.out.println("Pessoa física excluída com sucesso.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            for (int i = 0; i < numPessoasJuridicas; i++) {
                if (pessoasJuridicas[i].getCnpj().equals(cpfOuCnpj)) {
                    for (int j = i; j < numPessoasJuridicas - 1; j++) {
                        pessoasJuridicas[j] = pessoasJuridicas[j + 1];
                    }
                    numPessoasJuridicas--;
                    System.out.println("Pessoa jurídica excluída com sucesso.");
                    encontrado = true;
                    break;
                }
            }
        }
        if (!encontrado) {
            System.out.println("CPF ou CNPJ não encontrado.");
        }
    }