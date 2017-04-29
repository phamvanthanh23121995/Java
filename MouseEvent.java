import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class MouseEvent extends Frame implements WindowListener, ActionListener,MouseListener {
	private TextField tfMouseX; 
	   private TextField tfMouseY;
	   
	    public  MouseEvent ()
	    {
	       addWindowListener(this);
	       setLayout( new FlowLayout());
	      add(new Label("X-Click: "));
	      tfMouseX = new TextField(10); 
	      tfMouseX.setEditable(false);  
	      add(tfMouseX);         
	      add(new Label("Y-Click: "));
	      tfMouseY = new TextField(10);
	      tfMouseY.setEditable(false);  
	      add(tfMouseY);   
	        tfMouseX.addMouseListener(this);
	        tfMouseY.addMouseListener(this);
	      setTitle("MouseEvent Demo");
	      setSize(350, 100);          
	      setVisible(true); 
	      addMouseListener(this);  
	    }
		 public void windowOpened(WindowEvent arg0)  {   }
		 public void windowClosing(WindowEvent arg0)  { 
			 System.exit(0);
		 }
		 public void windowClosed(WindowEvent arg0)  {	 }
		 public void windowIconified(WindowEvent arg0)  {}
		 public void windowDeiconified(WindowEvent arg0) {	 }
		 public void windowActivated(WindowEvent arg0) {};
		 public void windowDeactivated(WindowEvent arg0) {};
	   public void mouseClicked(MouseEvent evt) {
	      tfMouseX.setText(evt.getX() + "");
	      tfMouseY.setText(evt.getY() + "");
	   }
	   public static void main(String[] args) {
	      new MouseEvent();  
	   }
	   public void mousePressed(MouseEvent evt) { }
	   public void mouseReleased(MouseEvent evt) { }
	   public void mouseEntered(MouseEvent evt) { }
	   public void mouseExited(MouseEvent evt) { }
	    @Override
	    public void actionPerformed(ActionEvent e) {
	      
	    }
		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
}
