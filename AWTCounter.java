import java.awt.*;
import java.awt.event.*;

class AWTCounter extends Frame implements WindowListener, ActionListener{
	Label lab=new Label("Counter");
    TextField tf1=new TextField(15);
    Button btnCounter=new Button("Counter");
    public AWTCounter(String title)
    {
    super(title);
    setLayout(new FlowLayout());
    btnCounter.addActionListener(this);
    add(lab);
    add(tf1);
    add(btnCounter);
    addWindowListener(this);
    setVisible(true);
    }
    public void windowClosing(WindowEvent arg0)  { 
		 System.exit(0);
	 }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AWTCounter t = new AWTCounter("AWT Counter");
		t.setSize(250,150);
	    t.show();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnCounter)
	    {
			int num=Integer.parseInt(tf1.getText())+1;
		    tf1.setText(String.valueOf(num));
	    }
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
