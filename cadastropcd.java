package sisaut.com.br;

public class PcD extends Usuario {
    private int idade;
    private String escola;

    public PcD(int id, String nome, String email, String senha, int idade, String escola) {
        super(id, nome, email, senha);
        this.idade = idade;
        this.escola = escola;
    }

    public void atualizarPerfil(String nome, int idade, String escola) {
        setNome(nome);
        this.idade = idade;
        this.escola = escola;
        System.out.println("Perfil atualizado.");
    }

    // Getters e setters omitidos para brevidade
}

public class PcD {

}