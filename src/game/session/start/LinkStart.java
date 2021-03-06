package game.session.start;
//serie di import
import java.util.Scanner;
import game.player.Player;
import game.session.score.ScoreMemo;
import game.structure.text.GameMessages;
/** class LinkStart
 * classe che si occupa di avviare l'applicazione, 
 * chiedendo all'utente cosa voglia fare.
 * @author Ivonne
 */
public class LinkStart {
	//acquisizione input
	private static Scanner input = new Scanner(System.in);
	//acquisizione comando
	private static char command = ' ';
	//main
	public static void main(String [] args) {
		//avvio sessione di gioco
		do {
			//si elimina il file dei punteggi
			//ScoreMemo.deleteScoreFile();
			System.out.println("\nLoading the G4M3.......");
			//stampe all'utente
			System.out.println(GameMessages.command_legend);
			System.out.println(GameMessages.command_request);
			//acquisizione del comando
			command = input.next().charAt(0);
			//verifica del comando ricevuto
			if(command == 'c') {
				System.out.println(GameMessages.credits);
			}//fi credits
			else if(command == 's') {
				System.out.println("Riuscirai a battere questi punteggi?");
				ScoreMemo.readScoreFile();
			}//fi score
			else if(command == 'g') {
				//variabile ausiliaria per il tipo di giocatore
				boolean human = Player.chooseType();
				//verifica della scelta
				if(human) {
					Player.humanMode();
				}//fi
				else {
					Player.automaticMode();
				}//else
			}//fi game
			else if(command == 'q') {
				System.out.println("Chiusura del gioco...");
			}//fi quit
			//comando errato
			else {
				System.out.println("Comando errato!\n");
			}//esle	
		}while(command != 'q') ;//end while avvio dell'applicazione
		System.out.println("Ciao, alla prossima!");
	}//end main
}//end LinkStart
