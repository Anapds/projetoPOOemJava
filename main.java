package sisaut.com.br;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando usuários
        PcD pcd1 = new PcD(1, "Alice", "alice@example.com", "senha123", 10, "Escola XYZ");
        PaiMae paiMae1 = new PaiMae(2, "Carlos", "carlos@example.com", "senha123", "123456789");

        // Login
        if (pcd1.fazerLogin("alice@example.com", "senha123")) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Falha no login.");
        }

        // Atualizar perfil
        pcd1.atualizarPerfil("Alice Maria", 11, "Escola ABC");

        // Cadastro de criança
        paiMae1.cadastrarCrianca(pcd1);

        // Marcar encontro
        Encontro encontro = new Encontro(1, new Date(), "Parque Central", pcd1);
        encontro.marcarEncontro(new Date(), "Parque Central");

        // Aprovar encontro
        paiMae1.aprovarEncontro(encontro);

        // Cancelar encontro
        encontro.cancelarEncontro();

        // Logout
        pcd1.fazerLogout();
    }
}