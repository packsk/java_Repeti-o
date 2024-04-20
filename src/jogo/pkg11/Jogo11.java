/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogo.pkg11;

import javax.swing.JOptionPane;


   public class Jogo11 {

    public static void main(String[] args) {
        int golpe1 = 10;
        int golpe2 = 20;
        int golpe3 = 30;
        int golpe4 = 60;
//variavel = caracteristica
        String nome;
        int vida;
        String classe;
        int golpe = 0;
        int opcao;

        nome = JOptionPane.showInputDialog("Digite o nome do personagem");
        vida = Integer.parseInt(JOptionPane.showInputDialog("Digite uma vida"));
        classe = JOptionPane.showInputDialog("Digite a classe do personagem");

        JOptionPane.showMessageDialog(null, "Nome " + nome + "\nVida " + vida);

        //comeÃ§a aqui
        do {
            JOptionPane.showMessageDialog(null,"Escolha um golpe");
            JOptionPane.showMessageDialog(null,"1.Kamehameha" + "\n2.Hadouken" + "\n3.Golpe do macaco" + "\n4.Golpe duplo" );
          golpe =  Integer.parseInt(JOptionPane.showInputDialog("Digite o nÃºmero do golpe"));
  

            switch (golpe) {
                case 1:
                    vida = vida - golpe1;
                    break;
                case 2:
                    vida = vida - golpe2;
                    break;
                case 3:
                    vida = vida - golpe3;
                    break;
                case 4:
                    vida = vida - golpe4;
                    break;
            
            }
            if (vida > 0) {
                 JOptionPane.showMessageDialog(null,"Vida Atual" + vida);
            }else{
            JOptionPane.showMessageDialog(null,"GAME OVER â€ â€ â€ â€ ");
            }
           
            
        } while (vida > 0);

    }

}

    

