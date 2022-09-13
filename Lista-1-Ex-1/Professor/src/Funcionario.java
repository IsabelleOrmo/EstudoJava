public class Funcionario {
    String nome;
    String email;
    double salario;

    // calculos de salario

    public void salarioAnual(double salarioAnual){
        salarioAnual=12*salario;
    }

    public double bonusAnual(){
        salario=salario+(salario*0.1);
        return salario;
    }


    //get e set
    
    public double getSalario() {
        if (salario<0){ //impede que o salario seja negativo
            return 0;
        } else {
            return this.salario;
        }
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // construtores

    public Funcionario (){

    }

    public Funcionario(String email, String nome){
        this.email=email;
        this.nome=nome;
    }

}
