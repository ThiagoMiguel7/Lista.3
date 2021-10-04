public class Main {

        public static void main(String[] args) {

            Pessoa p = new Pessoa("Brendhowns", 112334332, 100);

            p.addEndereco(new Endereco("Av. Europa", "Jardim Europa", 110));
            p.addEndereco(new Endereco("Av. Brg. Faria Lima", "Itaim Bibi", 3477));

            p.mostraInfo();
        }


}
