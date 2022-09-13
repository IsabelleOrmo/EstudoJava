public class Professores extends Funcionario {
    String leciona;
    String sala;

    //get e set

    public String getLeciona() {
        return this.leciona;
    }

    public void setLeciona(String leciona) {
        this.leciona = leciona;
    }

    public String getSala() {
        return this.sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    // construtores

    public Professores () {
        
    }

    public Professores (String leciona, String sala){
        this.leciona=leciona;
        this.sala=sala;
    }

   

}
