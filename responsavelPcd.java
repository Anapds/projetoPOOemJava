package sisaut.com.br;

public class PaiMae extends Usuario {
    private String telefone;

    public PaiMae(int id, String nome, String email, String senha, String telefone) {
        super(id, nome, email, senha);
        this.telefone = telefone;
    }

    public void cadastrarCrianca(PcD pcd) {
        System.out.println("Criança cadastrada: " + pcd.getNome());
    }

    public void aprovarEncontro(Encontro encontro) {
        encontro.setAprovado(true);
        System.out.println("Encontro aprovado.");
    }

    // Getters e setters
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}