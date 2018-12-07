import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatBot extends JFrame{

    //Typing Area:
    private JTextField txtEnter = new JTextField();
   
    //Chat Area:
    private JTextArea txtChat = new JTextArea();
    
    int decider;
   
    public ChatBot() {
        //Frame Attributes:
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("ChatBot");
       
        //txtEnter Attributes:
        txtEnter.setLocation(2, 540);
        txtEnter.setSize(590, 30);
       
        //txtEnter Action Event:
        txtEnter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                String uText = txtEnter.getText();
                txtChat.append("Toi: " + uText + "\n");
               uText=uText.trim();
                switch (uText) {
				case "salut": case "hi" :case "yo": case "slt":case"bonjour":
					
					 decider = (int) (Math.random()*4+1);
	                    if(decider == 1){
	                        botSay("slt");
	                    }
	                    else if(decider == 2){
	                        botSay("yo");
	                    }
	                    else if(decider == 3){
	                        botSay("bonjour");
	                    }
	                    else if(decider == 4){
	                        botSay("hey");
	                    }
					break;
				
				case "ça va": case "comment ça va": case "tu te sens bien":
					   decider = (int) (Math.random()*2+1);
	                    if(decider == 1){
	                        botSay("bien et toi");
	                    }
	                    else if(decider == 2){
	                        botSay("ça va");
	                    }
					break;
				case "bien":
					   decider = (int) (Math.random()*2+1);
	                    if(decider == 1){
	                        botSay("bien et toi");
	                    }
	                    else if(decider == 2){
	                        botSay("ça va");
	                    }
					break;
					
				case "tu veux du pain":
					   decider = (int) (Math.random()*2+1);
	                    if(decider == 1){
	                        botSay("connard");
	                    }
	                    else if(decider == 2){
	                        botSay("oui");
	                    }
					break;
					
				case "quelle est ta couleur préférée":
	                        botSay("bleu");
					break;
					
				case "":
					   decider = (int) (Math.random()*3+1);
	                    if(decider == 1){
	                        botSay("toujours là ???");
	                    }
	                    else if(decider == 2){
	                        botSay("allo");
	                    }
	                    else if(decider == 3){
	                        botSay("???");
	                    }
					break;
					
				case "il fait beau aujourd'hui":
					   decider = (int) (Math.random()*3+1);
	                    if(decider == 1){
	                        botSay("oui");
	                    }
	                    else if(decider == 2){
	                        botSay("pour Limoges oui");
	                    }
	                    else if(decider == 3){
	                        botSay("non pas trop");
	                    }
					break;
					
				case "je me sens mal":
					   decider = (int) (Math.random()*3+1);
	                    if(decider == 1){
	                        botSay("viens faire un calin");
	                    }
	                    else if(decider == 2){
	                        botSay("débrouille toi");
	                    }
	                    else if(decider == 3){
	                        botSay("moi aussi fait pas chier");
	                    }
					break;
					
				case "comment t'appelles tu":
	                  
	                        botSay("Chatbot");
					break;
					
				case "je t'aime":
					decider = (int) (Math.random()*3+1);
                    if(decider == 1){
                        botSay("oui");
                    }
                    else if(decider == 2){
                        botSay("moi aussi");
                    }
                    else if(decider == 3){
                        botSay("euuuuuuuuuh");
                    }
                    break;
                    
				case "quel age as tu":
					   decider = (int) (Math.random()*2+1);
	                    if(decider == 1){
	                        botSay("55 ans et 3 enfants");
	                    }
	                    else if(decider == 2){
	                        botSay("5 minutes");
	                    }
					break;
                    
				default:
					  decider = (int) (Math.random()*4+1);
	                    if(decider == 1){
	                        botSay("je n'ai pas compris");
	                    }
	                    else if(decider == 2){
	                        botSay("redis le stp");
	                    }
	                    else if(decider == 3){
	                        botSay("???");
	                    }
	                    else if(decider == 4){
	                        botSay("biensûr");
	                    }
					break;
				}
                
                txtEnter.setText("");
            }
        });
       
        //txtChat Attributes:
        txtChat.setLocation(15, 5);
        txtChat.setSize(560, 510);
        txtChat.setEditable(false);
       
        //Add Items To Frame:
        this.add(txtEnter);
        this.add(txtChat);
    }
   
    public void botSay(String s){
        txtChat.append("ChatBot: " + s + "\n");
    }
   
    public static void main(String[] args){
        new ChatBot();
    }
 

}
