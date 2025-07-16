public class ControleCarro {
    private boolean ligado;
    private int velocidade, marcha;

    public ControleCarro() {
        this.ligado = false; //começa desligado
        this.velocidade = 0; //começa parado
        this.marcha = 0; //começa em marcha neutra
    }

    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;

    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public int getMarcha() {
        return marcha;
    }
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void ligar() {
        this.setLigado(true);
        System.out.println("Carro ligado!");
    }

    public void desligar(){
        if(this.getMarcha() == 0 && this.getVelocidade() == 0) {
            this.setLigado(false);
            System.out.println("Desligando o carro...");
        } else {
            System.out.println("O carro não pode ser desligado enquanto estiver em movimento. Por favor, reduza a velocidade para 0 km/h e deixa a marcha no neutro antes de desligar.");
        }
    }

    public void acelerar(){
        if (this.getLigado()) {
            if (this.getMarcha() == 0) {
                System.out.println("O carro está em marcha neutra. Por favor, troque para uma marcha antes de acelerar.");
            } else if (this.getVelocidade() < 120) {
                this.setVelocidade(this.getVelocidade() + 5);
                System.out.println("Acelerando...");
            } else{
                System.out.println("Velocidade máxima atingida. Não é possível acelerar mais.");
            }
        } else {
            System.out.println("O carro está desligado. Ligue-o primeiro.");
        }
    }

    public void desacelerar(){
        if (this.getLigado()) {
            if (this.getVelocidade() > 0) {
                this.setVelocidade(this.getVelocidade() - 5);
                System.out.println("Diminuindo a velocidade...");
                if (this.getVelocidade() == 0) {
                    this.setMarcha(0);
                    System.out.println("O carro parou");
                }
            } else {
                System.out.println("Velocidade mínima atingida. Não é possível diminuir velocidade.");
            }
        } else {
            System.out.println("O carro está desligado. Ligue-o primeiro.");
        }
    }

    public void statusVelocidade() {
        System.out.println(this.getVelocidade() + " km/h " );
    }

    public void trocarMarcha(int novaMarcha) {
        if (this.getLigado()) {
            int marchaRecomendada;
            if (this.getVelocidade() >= 0 && this.getVelocidade() <= 20) {
                marchaRecomendada = 1;
            } else if (this.getVelocidade() > 20 && this.getVelocidade() <= 40) {
                marchaRecomendada = 2;
            } else if (this.getVelocidade() > 40 && this.getVelocidade() <= 60) {
                marchaRecomendada = 3;
            } else if (this.getVelocidade() > 60 && this.getVelocidade() <= 80) {
                marchaRecomendada = 4;
            } else if (this.getVelocidade() > 80 && this.getVelocidade() <= 100) {
                marchaRecomendada = 5;
            } else if (this.getVelocidade() > 100 && this.getVelocidade() <= 120) {
                marchaRecomendada = 6;
            } else {
                System.out.println("Velocidade máxima atingida. Não é possível trocar marcha. Diminua a velocidade.");
                return;
            }

            // Só permite trocar para a marcha recomendada pela velocidade
            if (novaMarcha == this.marcha + 1 || novaMarcha == this.marcha - 1) {
                if (novaMarcha == marchaRecomendada) {
                    this.setMarcha(novaMarcha);
                    System.out.println("Marcha trocada para " + this.getMarcha());
                } else {
                    System.out.println("A marcha " + novaMarcha + " não é adequada para a velocidade atual (" + this.getVelocidade() + " km/h). Recomendada: " + marchaRecomendada);
                }
            } else if (novaMarcha == this.marcha) {
                System.out.println("Você já está na marcha " + this.getMarcha());
            } else {
                System.out.println("Não é possível pular marchas");
            }
        } else {
            System.out.println("O carro está desligado. Ligue-o primeiro.");
        }
    }

    public void virarDireita(){
        if(this.getLigado()){
            if (this.getVelocidade() > 0 && this.getVelocidade() <= 40) {
                System.out.println("Virando à direita...");
            } else {
                System.out.println("Não é possível virar à direita nessa velocidade");
            }
        } else {
            System.out.println("O carro está desligado. Ligue-o primeiro.");
        }
    }

    public void virarEsquerda(){
        if(this.getLigado()) {
            if (this.getVelocidade() > 0 && this.getVelocidade() <= 40) {
                System.out.println("Virando à esquerda...");
            } else {
                System.out.println("Não é possível virar à esquerda nessa velocidade");
            }
        } else{
            System.out.println("O carro está desligado. Ligue-o primeiro.");
        }
    }
}
