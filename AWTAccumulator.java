import java.awt.*;
import java.awt.event.*;

class AWTAccumulator extends Frame implements WindowListener, ActionListener{
	
	private int sum = 0; 
	Label lab=new Label("Enter an integer");
    TextField tf1=new TextField(10);
    
    Label lab1=new Label("Accumulator sum is");
    TextField tf2=new TextField(10);
    public AWTAccumulator(String title)
    {
    super(title);
    setLayout(new FlowLayout());
    add(lab);
    add(tf1);tf1.addActionListener(this);
    add(lab1);
    add(tf2);
    addWindowListener(this);
    setVisible(true);
    }
    public void windowClosing(WindowEvent arg0)  { 
		 System.exit(0);
	 }
    public void actionPerformed(ActionEvent ae) {
        
        int numberIn = Integer.parseInt(tf1.getText());
        sum += numberIn;      
        tf1.setText("");  
        tf2.setText(sum + ""); 
    }
    @SuppressWarnings("deprecation")
	public static void main(String args[])
    {
    	
    AWTAccumulator t=new AWTAccumulator("AWT Accumulator");
    t.setSize(250,110);
    t.show();
    }
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
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
