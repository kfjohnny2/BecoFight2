import javax.swing.JOptionPane;

/**
 *
 * @author Johnnylee Bryan Marques da Rocha
 */
public class Jogador {
    private String nome;
    private int hp;
    private int forca;
    private static final int bufete = 3;
    private static final int maozada = 4;
    private static final int bicuda = 5;
    private static final int rodo = 8;
    private static final int haduken = 15;

    public Jogador(String nome, int hp, int forca) {
        this.nome = nome;
        this.hp = hp;
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean darbufete(Jogador j){
        if (this.forca >= bufete){
            j.hp -= 5 + (int) (Math.random()* bufete);
            this.forca -= bufete;
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null,"Força insuficiente para o BUFETE \n" +
                    "Escolha outro golpe");
            return false;
        }

    }
    public boolean darmaozada(Jogador j){
       if(this.forca >= maozada){
            j.hp -=  8 + (int) (Math.random()* maozada);
            this.forca -= maozada;
            return true;
       }
       else{
           JOptionPane.showMessageDialog(null,"Força insuficiente para a MÃOZADA \n" +
                    "Escolha outro golpe");
           return false;
       }

    }
    public boolean darbicuda(Jogador j){
       if(this.forca >= bicuda){
            j.hp -= 12 + (Math.random()* bicuda);
            this.forca -= bicuda;
            return true;
       }
       else{
           JOptionPane.showMessageDialog(null,"Força insuficiente para a BICUDA \n" +
                    "Escolha outro golpe");
           return false;
       }
    }
    public boolean darrodo(Jogador j){
         if(this.forca >= rodo){
            j.hp -= 15 + (Math.random()* rodo);
            this.forca -= rodo;
            return true;
       }
       else{
             JOptionPane.showMessageDialog(null,"Força insuficiente para o RODO \n" +
                    "Escolha outro golpe");
           return false;
       }
    }
    public boolean darhaduken(Jogador j){
        if(this.forca >= haduken){
            j.hp -= 20 + (Math.random()* haduken);
            this.forca -= haduken;
            return true;
       }
       else{
            JOptionPane.showMessageDialog(null,"Força insuficiente para o HADUKEN \n" +
                    "Escolha outro golpe");
           return false;
       }
    }
    public boolean defesa(){
       this.forca += 10;
       if (this.forca > 30){
           this.forca = 30;
       }
       return true;
    }

    public boolean Verificajogo(){
        if (this.hp > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void novoJogo(){
        this.hp = 100;
        this.forca = 30;

    }
    public String escolherNome(){
        String sNome = "";
        sNome = JOptionPane.showInputDialog("Digite o seu nome");

        if(sNome==null){
            JOptionPane.showMessageDialog(null, "Digite seu nome por favor!");
        }
 else{
     setNome(sNome);
 }
        return sNome;
    }



    }