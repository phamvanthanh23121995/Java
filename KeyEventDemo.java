import java.awt.*;
import java.awt.event.*;

class KeyEventDemo extends Frame implements WindowListener, ActionListener{

	Label lab=new Label("Enter Text:");
    TextField tf1=new TextField(10);
    TextArea area=new TextArea("You Have Typed A");
	
    public KeyEventDemo(String title)
    {
    super(title);
    setLayout(new FlowLayout());
    add(lab);
    add(tf1);
    add(area);
    addWindowListener(this);
    setVisible(true);
    }
    public void windowClosing(WindowEvent arg0)  { 
		 System.exit(0);
	 }
    public void actionPerformed(ActionEvent ae)
    {
     
    }
    @SuppressWarnings("deprecation")
	public static void main(String args[])
    {
    KeyEventDemo t=new KeyEventDemo("KeyEvent Demo");
    t.setSize(500,300);
    t.show();
    }
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
