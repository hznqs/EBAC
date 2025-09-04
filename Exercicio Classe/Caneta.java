public Class Caneta{

    private int codigo;

    private String marca;

    private String nome;

    private String cor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String mostrarInformacoes(){
        return "Marca: " + getMarca() + "\nNome: " + getNome() + "\nCor: " + getCor()
    }

}

