import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class AtendimentoDeFilas {
    public Queue<Cliente> filaClientes;
    public Funcionario[] funcionarios;
    public Random random;

    public AtendimentoDeFilas(int numFuncionarios) {
        filaClientes = new LinkedList<>();
        funcionarios = new Funcionario[numFuncionarios];
        random = new Random();

        for (int i = 0; i < numFuncionarios; i++) {
            funcionarios[i] = new Funcionario("Funcionário " + (i + 1));
        }
    }


    public void adicionarCliente(Cliente cliente) {
        filaClientes.add(cliente);
        System.out.println(cliente.getNome() + " entrou na fila.\n");
    }

    
    public void atenderClientes() {
        while (!filaClientes.isEmpty()) {
            Cliente clienteAtual = filaClientes.poll();
            int funcionarioIndex = random.nextInt(funcionarios.length);
            Funcionario funcionario = funcionarios[funcionarioIndex];

            int tempoAtendimento = random.nextInt(6) + 5; 

            System.out.println("Atendendo " + clienteAtual.getNome() + "\n" + clienteAtual.getNome() + " atendido pelo " + funcionario.getNome() + 
                    ": com tempo de " + tempoAtendimento + " segundos.\n");

           
        }

        System.out.println("Todos os clientes foram atendidos.");
    }

    public static void main(String[] args) {
        AtendimentoDeFilas atendimentoDeFilas = new AtendimentoDeFilas(5); 

        atendimentoDeFilas.adicionarCliente(new Cliente("Cliente 1"));
        atendimentoDeFilas.adicionarCliente(new Cliente("Cliente 2"));
        atendimentoDeFilas.adicionarCliente(new Cliente("Cliente 3"));
        atendimentoDeFilas.adicionarCliente(new Cliente("Cliente 4"));
        atendimentoDeFilas.adicionarCliente(new Cliente("Cliente 5"));
        atendimentoDeFilas.adicionarCliente(new Cliente("Cliente 6"));
        atendimentoDeFilas.adicionarCliente(new Cliente("Cliente 7"));

        
        atendimentoDeFilas.atenderClientes();
    }
}
