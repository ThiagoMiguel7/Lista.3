public class Pessoa {

    public String nome;
    public int cpf;
    public Endereco[] enderecos;
    public int i = 0;

    public Pessoa(String nome, int cpf, int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
        enderecos = new Endereco[qtdEnd];
    }

    public void addEndereco(Endereco end) {
        for (int y = 0; y < this.enderecos.length; y++) {
            if (this.enderecos[y] == null) {
                enderecos[y] = end;
                i++;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("Dados da pessoa");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println();
        System.out.println("Endereços: ");

        for(int y = 0; y < i; y++) {

            Endereco end = enderecos[y];

            System.out.println("Rua: " + end.rua);
            System.out.println("Numero: " + end.num);
            System.out.println("Bairro: " + end.bairro);
            System.out.println("-----------------------");
        }
    }

}