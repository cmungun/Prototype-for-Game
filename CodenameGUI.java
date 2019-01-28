/**
 * GUI Skeleton
 * 
 * Created by Rosy
 * Last updated on 18 Jan 2019, by Rosy
 * 
 * (Only for Eclipse) If code auto-complete is not working for JavaFX, refer to this site: 
 * https://www.chrisnewland.com/solved-eclipse-java-autocomplete-not-working-259
 * 
 * NOTE -> Be careful when adding imports, make sure you choose javafx and not java.awt
 */

package codenames;
	 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import codenames.codename2;

public class CodenameGUI extends Application {

	Text[][] text= new Text[5][5];
			       boolean turn = true;
			   static int    blue=0;
			      static int red =0;
	public void start(Stage primaryStage) {
		//constants
		int PADDING = 20;
		int NUM_CARDS = 5;
		int SIZE_CARDS = 100;
		
		


		try {
			
			//create a BorderPane
			BorderPane borderpane = new BorderPane();
			
			//create grid for the (25) main cards
			GridPane grid = new GridPane();

			//Create fonts for the texts
			Font font_cards = Font.font("Arial", 20);
			Font font_title = Font.font("Arial", 60);
			
			//Create a header
			Text head = new Text("codeNames");
			head.setFont(font_title);
			HBox header = new HBox(head); //Hbox for the header
			header.setAlignment(Pos.CENTER);
			
					//Create a button for players' turns
			Button turn_button = new Button("End turn");
			BorderPane.setMargin(turn_button, new Insets(50));
			
			Button Keycard = new Button("View KeyCard");
			//sample of event handler for the turn button
			turn_button.setOnAction(e ->{
				changeturn();
				
			});
			
			Keycard.setOnMousePressed((event)->{
				System.out.println("pressed");
				for (int i = 0; i < NUM_CARDS; i++) {
					for (int j = 0; j < NUM_CARDS; j++) {
					
					//	text = new Text(codename2.gridPanels[i][j].getWord().toString());
				switch(codename2.gridPanels[i][j].getColor()) {
				case("Red"): text[i][j].setFill(Color.RED);
				break;
				case("Blue"): text[i][j].setFill(Color.BLUE);
				break;
				case("Black"): text[i][j].setFill(Color.YELLOW);
				break;
				}
				}
				}
				});
			
			Keycard.setOnMouseReleased((event)->{
				for (int i = 0; i < NUM_CARDS; i++) {
					for (int j = 0; j < NUM_CARDS; j++) {
						//text = new Text(codename2.gridPanels[i][j].getWord().toString());
					text[i][j].setFill(Color.BLACK); 				
						}
				}
			}
			);
			
			//set the elements within the BorderPane
			borderpane.setCenter(grid); //set the grid as the center
			borderpane.setTop(header); //set header as top
			borderpane.setRight(turn_button);
			borderpane.setLeft(Keycard);
			//set grid padding and positioning
			grid.setPadding(new Insets(PADDING));
			grid.setHgap(PADDING);
			grid.setVgap(PADDING);
			grid.setAlignment(Pos.CENTER);
			
			for ( int i = 0; i < NUM_CARDS; i++) {
				for (int j = 0; j < NUM_CARDS; j++) {
					//System.out.println();
					//text sample
					text[i][j] = new Text(codename2.gridPanels[i][j].getWord().toString());
					
					//		text.setFill(value);
				//	text.setFont(font_cards,);
					
					//set alignment of text
					GridPane.setHalignment(text[i][j], HPos.CENTER);
					GridPane.setValignment(text[i][j], VPos.CENTER);
					
					//Cards in the grid
					//We could also use buttons instead of Rectangles
					Rectangle r = new Rectangle(SIZE_CARDS, SIZE_CARDS, Color.LIGHTGRAY);

				final int k =i;
				final int l =j;
			
					//sample of event handler for the cards
					//if a card is clicked, it changes color
			        r.setOnMouseClicked(e-> {
			              		
			        	if(blue !=8) {
			        	

		        		 
		        			 if(red!=9) {
		        			 
			              	if (turn== true) {
			              		 
				        			 
			              		if((codename2.gridPanels[k][l].getColor().equals("Black"))) {
			              			r.setFill(Color.YELLOW);
			              				System.out.println("GameOver");
			              				head.setText("GameOver");
			              				}
			              		else	if((codename2.gridPanels[k][l].getColor().equals("Wild"))) {
			              			r.setFill(Color.GRAY);
			              			head.setText("You hit a bystander");

			              				}
			              		else if((codename2.gridPanels[k][l].getColor().equals("Blue"))) {
			              			r.setFill(Color.BLUE);
			              			color("Blue");
			              				changeturn();
				              			head.setText("You hit your rival's agent");
}
			              		else {
			              			r.setFill(Color.RED);
			              			color("Red");
;
			              		}
			              	}else
			              		if((codename2.gridPanels[k][l].getColor().equals("Black"))) {
			              			r.setFill(Color.YELLOW);
			              				System.out.println("GameOver");			              			
			              				head.setText("GameOver");

			              				}
			              		else if((codename2.gridPanels[k][l].getColor().equals("Red"))) {
			              			r.setFill(Color.RED);
			              			color("Red");

			              				changeturn();
				              			head.setText("You hit your rival's agent");
}
			              		else	if((codename2.gridPanels[k][l].getColor().equals("Wild"))) {
		              			r.setFill(Color.GRAY);
		              			head.setText("You hit a bystander");
		              				}
			              		else {
			              			r.setFill(Color.BLUE);
			              			color("Blue");

			              		}
			              	
		        			 }		        				 if(red==9)head.setText("Red Wins");

			        	}else
	        				 if (blue==8)head.setText("Blue Wins");
			              	
			              
			        });
			        /**
			         * 
			         
			        r.setOnKeyPressed(e->{
			      	turn_button.fire();
			        });
			        */
			        //Major issue: it would be better if the text would be linked with the card/rectangle, 
			        //here they are "disconnected" from each other. 
			        //So do you think we should use buttons instead?
			        
			        //Example: clicking on the text does not trigger the action handler, 
			        //so we'd have to create 2 handlers for the text AND the rectangle, which doesn't 
			        //make sense with respect to our goal
					
			        //add elements to the grid
			        grid.add(r, i, j);
					grid.add(text[i][j], i, j);
				
				}
			}
			
			//Create a scene for the application
			Scene scene = new Scene(borderpane,1000,800);
			primaryStage.setTitle("CodeName");
			primaryStage.setScene(scene); //stage contains a scene
			primaryStage.show(); //display
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void color(String color) {
		if (color.equals("Blue")){
			blue++;
		}
		if (color.equals("Red")){
			red++;
		}
	}

	
	 private void changeturn() {
				 if(turn == true) 
					 turn = false;
				
					 else turn = true;
				 
	 }
	
	public static void main(String[] args) {
		codename2.main(args);
	
		launch(args);
		
System.out.println(red+""+blue);;

	}


	
	


	
}