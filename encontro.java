package sisaut.com.br;

import java.time.LocalDateTime;

public class Encontro {
    private int id;
    private LocalDateTime data;
    private String local;
    private PcD pcd;
    private boolean aprovado;

    public Encontro(int id, LocalDateTime data, String local, PcD pcd) {
        this.id = id;
        this.data = data;
        this.local = local;
        this.pcd = pcd;
        this.aprovado = false;
    }

    public void marcarEncontro(LocalDateTime data, String local) {
        if (this.data == null) { // Verifica se o encontro já está marcado
            this.data = data;
            this.local = local;
            System.out.println("Encontro marcado.");
        } else {
            System.out.println("Encontro já está marcado.");
        }
    }

    public void cancelarEncontro() {
        if (this.data != null) { // Verifica se o encontro já está cancelado
            this.data = null;
            this.local = null;
            System.out.println("Encontro cancelado.");
        } else {
            System.out.println("Encontro já está cancelado.");
        }
    }

    // Getters e setters atualizados para LocalDateTime
}