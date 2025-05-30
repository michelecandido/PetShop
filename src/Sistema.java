public class Sistema {
    private Cliente[] clientes;
    private int totalClientes;

    public Sistema(int quantInicial) {
        this.clientes = new Cliente[quantInicial];
        this.totalClientes = 0;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void maisClientes() {
        if(totalClientes >= clientes.length) {
            Cliente[] addEspaco = new Cliente[clientes.length + 10];
            for(int i = 0; i < clientes.length; i++) {
                addEspaco[i] = clientes[i];
            }
            clientes = addEspaco;
        }
    }

    public boolean addCliente(Cliente clienteNovo) {
        for(int i = 0; i < clientes.length; i++) {
            if(clientes[i] == null) {
                clientes[i] = clienteNovo;
                return true;
            }
        }
        return false;
    }
}