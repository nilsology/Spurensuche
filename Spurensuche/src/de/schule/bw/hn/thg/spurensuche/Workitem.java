package de.schule.bw.hn.thg.spurensuche;

public class Workitem {

	/**
	 * Initiating the attributes for the workitem-Class-Object
	 * @uml.property  name="interScore"
	 */
	private int interScore = 0;
	/**
	 * @uml.property  name="iSAdded"
	 */
	private boolean ISAdded = false;
	/**
	 * @uml.property  name="shTaken"
	 */
	private boolean shTaken = false;
	
	/**
	 * @uml.property  name="aufgabe"
	 */
	private String Aufgabe;
	
	/**
	 * @uml.property  name="finished"
	 */
	private boolean finished = false;
	/**
	 * @uml.property  name="seen"
	 */
	private boolean seen = false;
	
	/**
	 * @uml.property  name="score"
	 */
	private int Score;

	/**
	 * @uml.property  name="hinweis1"
	 */
	private String Hinweis1;
	/**
	 * @uml.property  name="hinweis1Shown"
	 */
	private boolean Hinweis1Shown = false;
	/**
	 * @uml.property  name="subtract1"
	 */
	private int Subtract1;
	
	/**
	 * @uml.property  name="hinweis2"
	 */
	private String Hinweis2;
	/**
	 * @uml.property  name="hinweis2Shown"
	 */
	private boolean Hinweis2Shown = false;
	/**
	 * @uml.property  name="subtract2"
	 */
	private int Subtract2;
	
	/**
	 * @uml.property  name="hinweis3"
	 */
	private String Hinweis3;
	/**
	 * @uml.property  name="hinweis3Shown"
	 */
	private boolean Hinweis3Shown = false;
	/**
	 * @uml.property  name="subtract3"
	 */
	private int Subtract3;
	
	/**
	 * @uml.property  name="bild"
	 */
	private String Bild;
	
	/**
	 * Getter for the IntermediateScore-Value
	 * @return
	 * @uml.property  name="interScore"
	 */
	public int getInterScore() {
		return interScore;
	}
	
	/**
	 * Setter for the IntermediateScore-Value
	 * @param  interS
	 * @uml.property  name="interScore"
	 */
	public void setInterScore(int interS) {
		interScore = interS;
	}
	
	/**
	 * (SUBTRACT) Setter for the IntermediateScore-Value
	 * @param sIS
	 */
	public void subInterScore(int sIS) {
		interScore -= sIS;
	}
	
	/**
	 * (ADD) Setter for the IntermediateScore-Value
	 * @param aIS
	 */
	public void addInterScore(int aIS) {
		interScore += aIS;
	}
	
	/**
	 * (BOOLEAN) Setter for the IntermediateScoreAdded-Value
	 * 
	 * set if the Intermediate Score has already been added to the HighScore-Value
	 * 
	 * @param ISa
	 */
	public void setInterScoreAdded(boolean ISa) {
		ISAdded = ISa;
	}
	
	/**
	 * (BOOLEAN) Getter for the IntermediateScoreAdded-Value
	 * 
	 * has the Intermediate Score already been added to the HighScore-Value
	 * 
	 * @return
	 */
	public boolean isInterScoreAdded() {
		return ISAdded;
	}
	
	/**
	 * Setter of the ScreenshotTaken-Value
	 * @return
	 */
	public boolean isScreenshotTaken() {
		return shTaken;
	}
	
	/**
	 * Getter of the ScreenshotTaken-Value
	 * @param shT
	 */
	public void setScreenshotIsTaken(boolean shT) {
		shTaken = shT;
	}
	
	/**
	 * Getter of Aufgabe-Value -> Aufgabenstellung
	 * @return
	 * @uml.property  name="aufgabe"
	 */
	public String getAufgabe() {
		return Aufgabe;
	}
	
	/**
	 * Setter of Aufgabe-Value -> Aufgabenstellung
	 * @param  
	 * @uml.property  name="aufgabe"
	 */
	public void setAufgabe(String aufgabe) {
		Aufgabe = aufgabe;
	}
	
	/**
	 * Getter of Score-Value
	 * @return  the score
	 * @uml.property  name="score"
	 */
	public int getScore() {
		return Score;
	}
	
	/**
	 * Setter of Score-Value

	 * Parse the String-Value to Integer-Value
	 * 
	 * @param score the score to set
	 */
	public void setScore(String score) {
		Score = Integer.parseInt(score);
	}
	
	/**
	 * Getter of Hinweis1-Value
	 * @return  the hinweis1
	 * @uml.property  name="hinweis1"
	 */
	public String getHinweis1() {
		return Hinweis1;
	}
	
	/**
	 * Setter of Hinweis1-Value
	 * @param hinweis1  the hinweis1 to set
	 * @uml.property  name="hinweis1"
	 */
	public void setHinweis1(String hinweis1) {
		Hinweis1 = hinweis1;
	}
	
	/**
	 * Getter of Hinweis2-Value
	 * @return  the hinweis2
	 * @uml.property  name="hinweis2"
	 */
	public String getHinweis2() {
		return Hinweis2;
	}
	
	/**
	 * Setter of Hinweis2-Value
	 * @param hinweis2  the hinweis2 to set
	 * @uml.property  name="hinweis2"
	 */
	public void setHinweis2(String hinweis2) {
		Hinweis2 = hinweis2;
	}
	
	/**
	 * Getter of Hinweis3-Value
	 * @return  the hinweis3
	 * @uml.property  name="hinweis3"
	 */
	public String getHinweis3() {
		return Hinweis3;
	}
	
	/**
	 * Setter of Hinweis3-Value
	 * @param hinweis3  the hinweis3 to set
	 * @uml.property  name="hinweis3"
	 */
	public void setHinweis3(String hinweis3) {
		Hinweis3 = hinweis3;
	}
	
	/**
	 * Getter of Bild-Value
	 * @return  the bild
	 * @uml.property  name="bild"
	 */
	public String getBild() {
		return Bild;
	}
	
	/**
	 * Setter of Bild-Value
	 * @param bild  the bild to set
	 * @uml.property  name="bild"
	 */
	public void setBild(String bild) {
		Bild = bild;
	}

	/**
	 * Getter of Subtract1-Value
	 * @return  the subtract1
	 * @uml.property  name="subtract1"
	 */
	public int getSubtract1() {
		return Subtract1;
	}

	/**
	 * Setter of Subtract1-Value
	 * 
	 * Parse String-Value to Integer-Value
	 * 
	 * @param subtract1 the subtract1 to set
	 */
	public void setSubtract1(String subtract1) {
		Subtract1 = Integer.parseInt(subtract1);
	}

	/**
	 * Getter of Subtract2-Value 
	 * @return  the subtract2
	 * @uml.property  name="subtract2"
	 */
	public int getSubtract2() {
		return Subtract2;
	}

	/**
	 * Setter of Subtract2-Value
	 * 
	 * Parse String-Value to Integer-Value
	 * 
	 * @param subtract2 the subtract2 to set
	 */
	public void setSubtract2(String subtract2) {
		Subtract2 = Integer.parseInt(subtract2);
	}

	/**
	 * Getter of Subtract3-Value
	 * @return  the subtract3
	 * @uml.property  name="subtract3"
	 */
	public int getSubtract3() {
		return Subtract3;
	}

	/**
	 * Setter of Subtract3-Value
	 * 
	 * Parse String-Value to Integer-Value
	 * 
	 * @param subtract3 the subtract3 to set
	 */
	public void setSubtract3(String subtract3) {
		Subtract3 = Integer.parseInt(subtract3);
	}

	/**
	 * Getter of finished-Value
	 * @return  the finished
	 * @uml.property  name="finished"
	 */
	public boolean isFinished() {
		return finished;
	}

	/**
	 * Setter of finished-Value
	 * @param finished  the finished to set
	 * @uml.property  name="finished"
	 */
	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	/**
	 * Getter of seen-Value
	 * @return  the seenState
	 * @uml.property  name="seen"
	 */
	
	public boolean isSeen() {
		return seen;
	}
	
	/**
	 * Setter of seen-Value
	 * @param the  seenState
	 * @uml.property  name="seen"
	 */
	public void setSeen(boolean seen) {
		this.seen = seen;
	}
	
	/**
	 * Getter of Hinweis1Shown-Value
	 * @return  the hinweis1Shown
	 * @uml.property  name="hinweis1Shown"
	 */
	public boolean isHinweis1Shown() {
		return Hinweis1Shown;
	}

	/**
	 * Setter of Hinweis1Shown-Value
	 * @param hinweis1Shown  the hinweis1Shown to set
	 * @uml.property  name="hinweis1Shown"
	 */
	public void setHinweis1Shown(boolean hinweis1Shown) {
		Hinweis1Shown = hinweis1Shown;
	}

	/**
	 * Getter of Hinweis2Shown-Value
	 * @return  the hinweis2Shown
	 * @uml.property  name="hinweis2Shown"
	 */
	public boolean isHinweis2Shown() {
		return Hinweis2Shown;
	}

	/**
	 * Setter of Hinweis2Shown-Value
	 * @param hinweis2Shown  the hinweis2Shown to set
	 * @uml.property  name="hinweis2Shown"
	 */
	public void setHinweis2Shown(boolean hinweis2Shown) {
		Hinweis2Shown = hinweis2Shown;
	}

	/**
	 * Getter of Hinweis3Shown-Value
	 * @return  the hinweis3Shown
	 * @uml.property  name="hinweis3Shown"
	 */
	public boolean isHinweis3Shown() {
		return Hinweis3Shown;
	}

	/**
	 * Setter of Hinweis3Shown-Value
	 * @param hinweis3Shown  the hinweis3Shown to set
	 * @uml.property  name="hinweis3Shown"
	 */
	public void setHinweis3Shown(boolean hinweis3Shown) {
		Hinweis3Shown = hinweis3Shown;
	}
	
}
