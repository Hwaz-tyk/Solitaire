package resources;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Stack;


public class GUI extends JFrame implements ActionListener, MouseListener, MouseMotionListener{

	War game;
	// collections.shuffle();
   public GUI(War game){
	   this.game= game;
        //Create and set up the window.
       setTitle("War Cards");
       setSize(900,700);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       // this supplies the background
       try {
		System.out.println(getClass().toString());
		Image blackImg = ImageIO.read(getClass().getResource("background.jpg"));
		setContentPane(new ImagePanel(blackImg));

       }catch(IOException e) {
    	   e.printStackTrace();
       }
       
       /*******
        * This is just a test to make sure images are being read correctly on your machine. Please replace
        * once you have confirmed that the card shows up properly. The code below should allow you to play the solitare
        * game once it's fully created.
        */
		JLayeredPane firstPlayerPane = new JLayeredPane();
		getContentPane().add(firstPlayerPane);
		getContentPane().setLayout(null);
		firstPlayerPane.setBounds(0,0,200,400);
		firstPlayerPane.setOpaque(false);
		firstPlayerPane.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));
	    firstPlayerPane.setLayout(new FlowLayout());
		this.add(firstPlayerPane);



		//testing
       Card card = new Card(2, Card.Suit.Diamonds);
       System.out.println(card);
	   Card card2 = new Card(4, Card.Suit.Spades);
       System.out.println(card2);
	   Card card6 = new Card(2, Card.Suit.Hearts);
       System.out.println(card6);
	   Card card7 = new Card(2, Card.Suit.Clubs);
       System.out.println(card7);
	   Stack<Card> testing = new Stack();
	   testing.push(card);
	   testing.push(card2);
	   testing.push(card6);
	   testing.push(card7);
	   firstPlayerPane.add(drawPile(testing));
    //    firstPlayerPane.add(card2);
	//    card.setBounds(0,0,100,200);
	//    firstPlayerPane.add(card);
	   card.hide(); 
        this.setVisible(true);

		JLayeredPane secondPlayerPane = new JLayeredPane();
		getContentPane().add(secondPlayerPane);
		getContentPane().setLayout(null);
		secondPlayerPane.setBounds(700,165,200,400);
		secondPlayerPane.setOpaque(false);
		secondPlayerPane.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLUE));
	    secondPlayerPane.setLayout(new FlowLayout());
		this.add(secondPlayerPane);


	   Card card3 = new Card(2, Card.Suit.Diamonds);
       System.out.println(card3);
	   Card card4 = new Card(2, Card.Suit.Clubs);
       System.out.println(card4);
	   Card card10 = new Card(2, Card.Suit.Hearts);
       System.out.println(card3);
	   Card card11 = new Card(2, Card.Suit.Spades);
       System.out.println(card4);
	   Stack<Card> love = new Stack();
	   love.push(card3);
	   love.push(card4);
	   love.push(card11);
	   love.push(card10);
	   secondPlayerPane.add(drawPile(love));

		JLayeredPane battleFieldPane = new JLayeredPane();
		getContentPane().add(battleFieldPane);
		getContentPane().setLayout(null);
		battleFieldPane.setBounds(201,165,499,235);
		battleFieldPane.setOpaque(false);
		battleFieldPane.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.YELLOW));
	    battleFieldPane.setLayout(new FlowLayout());
		this.add(battleFieldPane);
    }
	
  public JLayeredPane drawPile(Stack<Card> stackIn) {

    Object cards[];

    cards = stackIn.toArray(); //please note we convert this stack to an array so that we can iterate through it backwards while drawing. You’ll need to cast each element inside cards to a <Card> in order to use the methods to adjust their position
	JLayeredPane cardStack = new JLayeredPane();
	getContentPane().add(cardStack);
	int height = 5;
	for(int i = cards.length-1; i > 0; i--){
		Card c = (Card)cards[i];
		c.setBounds(0, height, 100, 145);
		cardStack.add(c,0);
		height += 19;
	}
	cardStack.setPreferredSize(new Dimension(200, 400));
	cardStack.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.MAGENTA));
	return cardStack;
}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
