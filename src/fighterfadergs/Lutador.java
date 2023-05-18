
package fighterfadergs;

public class Lutador  {
    
    public String nome, nacionalidade;
    public String[] frases;
    public int idade;
    public float peso, altura;
    public boolean modoDeuses;

    //Getter e Setter:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isModoDeuses() {
        return modoDeuses;
    }

    public void setModoDeuses(boolean modoDeuses) {
        this.modoDeuses = modoDeuses;
    }
  
    //Exibição de Status dos lutadores:
    public void LutadorStatus(){
        System.out.println("===================================================");
        System.out.println("Personagem:");
        System.out.println("");
        System.out.println("Nome: "+this.nome);
        System.out.println("Origem: "+this.nacionalidade);
        System.out.println("Idade: "+this.idade);
        System.out.println("Peso: "+this.peso);
        System.out.println("Altura: "+this.altura);
        System.out.println("");
        System.out.println("---------------------------------------------------");
        System.out.println("Frases de efeito:");
        System.out.println("");
        System.out.println("Frase 1: "+this.frases[0]);
        System.out.println("Frase 2: "+this.frases[1]);
        System.out.println("---------------------------------------------------");
        System.out.println("Tipo:");
        System.out.println("");
        if(this.modoDeuses == true){
         System.out.println("Esse lutador é considerado um dos deuses/vilões da FADERGS!");   
        }  else {
            System.out.println("Esse lutador é um dos nossos heróis!");
        }
        System.out.println("===================================================");
    }
   
   // ------------------------------------------ VILÕES (COMEÇO) ------------------------------------------  
    
    //Pinguin
    public void lutadorTP(){
        this.nome = "The Penguin";
        this.nacionalidade = "Antartica";
        this.idade = 45;
        this.peso = 72f;
        this.altura = 1.68f;
        this.modoDeuses = true;
        frases = new String[2];
        frases [0] = "Você só sabe Java, não vai conseguir ganhar de mim!";
        frases [1] = "Sinta a verdadeira fúria da mosca branca da FADERGS!";
        
    }
    
    public void thePenguinStatus(){
        lutadorTP();
        LutadorStatus();
    }
    
    //IceMan
    public void lutadorIM(){
        this.nome = "The Iceman";
        this.nacionalidade = "Polo Norte";
        this.idade = 50;
        this.peso = 62f;
        this.altura = 1.73f;
        this.modoDeuses = true;
        frases = new String[2];
        frases [0] = "Sobreviva ao caloroso frio do ar condicionado!";
        frases [1] = "Eu programei as mais baixas temperaturas desse jogo.";
    }
    
    public void theIcemanStatus(){
        lutadorIM();
        LutadorStatus();
    }
    
    //GrillMan
    public void lutadorGM(){
        this.nome = "The GrillMan";
        this.nacionalidade = "Brazil";
        this.idade = 40;
        this.peso = 67f;
        this.altura = 1.75f;
        this.modoDeuses = true;
        frases = new String[2];
        frases [0] = "Se encontrar a chave do meu apartamento, você vira meu churrasco!";
        frases [1] = "Vou dar a primeira porrada, antes que você descubra o porque!";
    }
    
    public void theGrillManStatus(){
        lutadorGM();
        LutadorStatus();
    }
    
    //AdsAlto
    public void lutadorAA(){
        this.nome = "The AdsAlto";
        this.nacionalidade = "Países Baixos";
        this.idade = 45;
        this.peso = 61f;
        this.altura = 1.66f;
        this.modoDeuses = true;
        frases = new String[2];
        frases [0] = "Você não consegue bater no maior dos deuses? Ai dedé!";
        frases [1] = "Se fizer eu te responder no WHATSAPP, eu te consagro como um dos deuses!";
    }
    
    public void theAdsAltoStatus(){
        lutadorAA();
        LutadorStatus();
    }
    // ------------------------------------------ VILÕES (FIM) ------------------------------------------   
    
    // ------------------------------------------ HERÓIS (COMEÇO) ------------------------------------------ 
    public void lutadorMarcus(){
        this.nome = "Marcus";
        this.nacionalidade = "EUA";
        this.idade = 19;
        this.peso = 69f;
        this.altura = 1.78f;
        this.modoDeuses = false;
        frases = new String[2];
        frases [0] = "Irei torturar os deuses com perguntas, até que eles me deem seu posto!";
        frases [1] = "Hacker do exército, prodigio em ascenção, irei prever os movimentos dos deuses antes que pensem em executa-los";
    }
    
    public void theLutadorMarcus(){
        lutadorMarcus();
        LutadorStatus();
    }
    
}
