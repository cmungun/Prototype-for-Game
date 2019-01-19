package codenames;
/**
 * 
 * @author chavind
 *Every Grid will have a color and a word, the  attributes for the class
 */
public class GridDetails {
private String color;
private String word;
	/**
	 * Default Constructor 
	 */
	public GridDetails() {
		//super();
		this.color = "Wild";
		this.word = "Wild";
		}
	
	/**
	 * @return the color
	 */public GridDetails(String color, String word) {
		//super();
		this.color = color;
		this.word = word;
		}
		
	public String getColor() {
		return color;
	}
	
	
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}
	/**
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}
	
	public String toString() {
		return color +" "+word;
	}
	
}
