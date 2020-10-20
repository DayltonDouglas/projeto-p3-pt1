package projeto.p3;
import projeto.p3.Carro.*;
import projeto.p3.Motos;
class Locadora {
    private final Cliente[] vetor;
    private final Carro[] vetor2;
    private final Moto[] vetor3;
    private int cont;
    
    public Locadora() {
        vetor = new Cliente[200];
        vetor2 = new Carro[200];
        vetor3 = new Moto[200]
        cont = 0;
    }
    public static void exibModelo(Modelo[] m) {
        m = Modelo.values();
        int i = 0;
        do {
            System.out.println("" + m[i].getModelo());
            i++;
        } while (i < m.length);
    }
    public static void exibModeloMoto(ModeloMoto[] mt) {
        mt = ModeloMoto.values();
        int i = 0;
        do {
            System.out.println("" + m[i].getModeloMoto());
            i++;
        } while (i < mt.length);
    }
    public static void exibPreco(Preco[] p) {
        p = Preco.values();
        int i = 0;
        while (i < p.length) {
            System.out.println(" " + p[i].getPreco());
        }
    }
    public static void exibPrecoMoto(PrecoMoto[] pm) {
        pm = PrecoMoto.values();
        int i = 0;
        while (i < p.length) {
            System.out.println(" " + p[i].getPrecoMoto());
        }
    }
    public static void exibModPre(Modelo[] m, Preco[] p) {
        int i = 0;
        m = Modelo.values();
        p = Preco.values();
        while (i < m.length) {
            System.out.println("Modelo do Carro : " + m[i].getModelo() + "\n Preço do Carro:  " + p[i].getPreco());
        }
    }
    public static void exibModPreMoto(ModeloMoto[] mt, PrecoMoto[] pm , Capacete[] cp) {
        int i = 0;
        mt = ModeloMoto.values();
        pm = PrecoMoto.values();
        cp = Capacete.values();
        while (i < mt.length) {
            System.out.println("Modelo de Moto : " + mt[i].getModeloMoto() + "\n Preço da moto:  " + pm[i].getPrecoMoto() + "\n Preço do capacete: " + cp[i].getCapacete());
        }
    }
    public boolean consultar(Modelo[] m) {
        for (Carro consulta : vetor2) {
            if (consulta.equals(m) == true) {
                System.out.println(consulta);
                return true;
            }else{
            }
        }
        return false;
    }
    public boolean removerCliente(String nome) {
        for (Cliente umCliente : vetor) {
            if (umCliente != null) {
                umCliente = null;
                return true;
            }else{
            }
        }
        return false;
    }
    public boolean depositar(double ValorDeposito, double Valor) {
        Cliente selecionada = null;
        for (Cliente clientes : vetor) { // 1 ERRO AQUI
            if (clientes != null && clientes.getDeposito() == ValorDeposito) {
                selecionada = clientes;
                return true;
            }
        }
        if (selecionada == null) {
        return false;
        }
        selecionada.deposita((float) Valor);
        return true;
    }
    public void exibirModelo(Modelo[] m) {
        m = Modelo.values();
        int i = 0;
        do {
            System.out.println("" + m[i].getModelo());
            i++;
        } while (i < m.length);
    }
    public void alugarCarro(String carro, Modelo[] m, Preco[] p, double preco) {
        for (int i = 0; i < m.length; i++) {
            if (m[i].getModelo().compareToIgnoreCase(carro) == 0) {
                int aux = i;
                if (aux == i) {
                    if (p[aux].getPreco() == preco) {
                        System.out.println("O modelo é : " + carro + " \nO Preco é: " + preco);
                    }else{
                        System.out.println("Preco digitado errado!!");
                    }
                }
            } else {
                System.out.println("Carro não encontrado");
            }
        }
    }
    public void alugarMoto(String moto, ModeloMoto[] mt, PrecoMoto[] pm,Capacete[]cp, double precoMoto, double capacete ) {
        for (int i = 0; i < m.length; i++) {
            if (m[i].getModeloMoto().compareToIgnoreCase(moto) == 0) {
                int aux = i;
                if (aux == i) {
                    if (pm[aux].getPrecoMoto() == precoMoto && cp[aux].getCapacete() == capacete) {
                        System.out.println("O modelo é : " + carro + " \nO Preco é: " + precoMoto "\nO Preco do capacete é: " + capacete);
                    }else{
                        System.out.println("Preco digitado errado!!");
                    }
                }
            } else {
                System.out.println("Moto não encontrada");
            }
        }
    }
}

