package game.session;

import java.util.HashMap;

import game.structure.cell.CellStatus;

/** class GameModeTranslation
 * questa e' una classe di utilita', contenente soltanto metodi statici, 
 * che permettera' di avere a disposione le traduzioni degli elementi di
 * gioco, in base alla modalita' che verra' selezionata nella sezione di
 * gioco vera e propria.
 * 
 * PG	ENEMY	GOLD	DANGER	SAFE	FORBIDDEN
 * @author ivonne
 */
public class GameModeTranslation {
	//stringa modalita' di gioco
	public final static String mode = "Sarai il cacciatore oppure il Wumpus?\n"
							+"[h - cacciatore] [w - wumpus]";
	//stringa descrizione comandi
	public final static String command_legend = "Ecco la lista dei comandi:\n"+
							"[q - quit] [g - game start] [s - score] [c - credits]";
	public final static String command_request = "Cosa vuoi fare?"; 
	//messaggi sullo stato della partita
	public final static String looser = new String("Hai perso :(");
	public final static String winner = new String("Hai vinto !!! =) ");
	//messaggi d'errore
	public final static String denied_move = new String("Posizione non consentita!");
	//messaggi di info
	public final static String credits = "E' Ivonne che ha tentato di sviluppare questo gioco...";
	//messaggi relativi al tentativo di colpire il nemico 
	public final static String wasted_shot ="Ooops...La tua arma ormai e' andata, come la possibilitÓ di battere il nemico!";
	public final static String failed_shot ="Che mira pessima...Non hai colpito niente!";
	public final static String hit="Yu-hu!Hai colpito il nemico!";
			
	
	
	
	/** HERO_SIDE
	 * Questa HashMap conterra' tutti gli elementi di gioco che costituiscono
	 * la modalita' eroe, cioe' quella in cui l'avventuriero deve sopravvivere
	 * al wumpus, durante la sua esplorazione del terreno di gioco.
	 * 
	 */
	public static final HashMap<CellStatus, String> hero_side_map = new HashMap<CellStatus, String>();
	
	/** WUMPUS_SIDE
	 * Questa HashMap conterra' tutti gli elementi di gioco che costituiscono
	 * la modalita' wumpus, cioe' quella in cui il wumpus deve sopravvivere
	 * al cacciatore.
	 */
	public static final HashMap<CellStatus, String> wumpus_side_map =new HashMap<CellStatus, String>();
	
	/** HERO_SIDE
	 * Questa HashMap conterra' tutti i messaggi che verranno utlizzati per
	 * dare informazioni sullo stato del gioco all'utente, nella modalita' eroe.
	 */
	public static final HashMap<CellStatus, String> hero_side_mex = new HashMap<CellStatus, String>();	
	
	/** WUMPUS_SIDE
	 * Questa HashMap conterra' tutti i messaggi che verranno utlizzati per
	 * dare informazioni sullo stato del gioco all'utente, nella modalita' wumpus.
	 */
	public static final HashMap<CellStatus, String> wumpus_side_mex = new HashMap<CellStatus, String>();
	
	/** metodo heroTranslation(): void
	 * 
	 */
	public static void initHeroTranslation() {
		hero_side_map.put(CellStatus.PG, "Avventuriero");
		hero_side_map.put(CellStatus.ENEMY, "Wumpus");
		hero_side_map.put(CellStatus.AWARD, "Tesoro");
		hero_side_map.put(CellStatus.DANGER, "Fossa");
		hero_side_map.put(CellStatus.SAFE, "Sicura");
		hero_side_map.put(CellStatus.FORBIDDEN, "Sasso");
		//per i messaggi
		initHeroMessages();
	}//end heroTranslation()
	
	/** metodo wumpusTranslation(): void
	 * 
	 */
	public static void initWumpusTranslation() {
		wumpus_side_map.put(CellStatus.PG, "Wumpus");
		wumpus_side_map.put(CellStatus.ENEMY, "Cacciatore");
		wumpus_side_map.put(CellStatus.AWARD, "Via di Fuga");
		wumpus_side_map.put(CellStatus.DANGER, "Trappola");
		wumpus_side_map.put(CellStatus.SAFE, "Sicura");
		wumpus_side_map.put(CellStatus.FORBIDDEN, "Sasso");
		//per i messaggi
		initWumpusMessages();
	}//end wumpusTranslation()

	//per i messagig di gioco
	
	/** metodo initHeroMessages(): void
	 * inizializza la mappa dei messaggi che verranno utilizzati nel gioco
	 * per fornire delle informazioni all'utente, nella modalita' eroe.
	 */
	private static void initHeroMessages() {
		hero_side_mex.put(CellStatus.PG, "Benvenuto avventuriero!\nAndiamo a caccia del Wumpus e dei suoi tesori.");
		hero_side_mex.put(CellStatus.ENEMY, "Ahi ahi, sei stato ferito dal Wumpus!");
		hero_side_mex.put(CellStatus.AWARD, "Hai trovato il tesoro del Wumpus!");
		hero_side_mex.put(CellStatus.DANGER, "Sei caduto nella fossa piena d'acqua...");
		hero_side_mex.put(CellStatus.SAFE, "");
		hero_side_mex.put(CellStatus.FORBIDDEN, "");
		hero_side_mex.put(CellStatus.ENEMY_SENSE, "Pufff! Che puzza...Il mostro deve essere vicino!");
		hero_side_mex.put(CellStatus.DANGER_SENSE, "Brrr, che aria fredda che arriva...");
	}//initHeroMessages()
	
	/** metodo initWumpusMessages(): void
	 * inizializza la mappa dei messaggi che verranno utilizzati nel gioco
	 * per fornire delle informazioni all'utente, nella modalita' wumpus.
	 */
	private static void initWumpusMessages() {
		wumpus_side_mex.put(CellStatus.PG, "Benvenuto Wumpus!\nAttenzione al cacciatore, scappa.");
		wumpus_side_mex.put(CellStatus.ENEMY, "Oh no, il cacciatore ti ha colpito!");
		wumpus_side_mex.put(CellStatus.AWARD, "Hai trovato una via di fuga, sbrigati!");
		wumpus_side_mex.put(CellStatus.DANGER, "Sei caduto in trappola...");
		wumpus_side_mex.put(CellStatus.SAFE, "");
		wumpus_side_mex.put(CellStatus.FORBIDDEN, "");
		wumpus_side_mex.put(CellStatus.ENEMY_SENSE, "Swiiiish...si muovono le foglie...c'e' qualcuno che ti osserva...");
		wumpus_side_mex.put(CellStatus.DANGER_SENSE, "Crick, crock...Il terreno e' instabile");
	}//initWumpusMessages()

}//end class
