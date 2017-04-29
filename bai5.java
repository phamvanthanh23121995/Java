import java.awt.*;
import java.awt.event.*;
class bai5 extends Frame implements WindowListener, ActionListener{
	 Label lab=new Label("Counter");
	 TextField tf2=new TextField(5);
	 Label lab1=new Label("Ket Qua");
	 TextField tf3=new TextField(5);
	 Button btnup=new Button("Counter Up");
	 Button btndown=new Button("Counter Dow");
	 Button btnReturn=new Button("Return");
	 public bai5(String title)
	    {
	    super(title);
	    setLayout(new FlowLayout());
	    btnup.addActionListener(this);
	    btndown.addActionListener(this);
	    btnReturn.addActionListener(this);
	    add(lab);
	    add(tf2);
	    add(btnup);
	    add(btndown);
	    add(btnReturn);
	    add(lab1);
	    add(tf3);
	    addWindowListener(this);
	    setVisible(true);
	    }
	 public void windowClosing(WindowEvent arg0)  { 
		 System.exit(0);
	 }
   
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnup)
	    {
	    int num=Integer.parseInt(tf2.getText()) + 1;
	    tf3.setText(String.valueOf(num));
	    }
		if (e.getSource()==btndown)
	    {
	    int num=Integer.parseInt(tf2.getText()) - 1;
	    tf3.setText(String.valueOf(num));
	    }
		if (e.getSource()==btnReturn)
	    {
		tf2.setText(String.valueOf(""));
		tf3.setText(String.valueOf(""));
	    }
	}
	public static void main(String args[])
    {
    bai5 t=new bai5("AWT Counter");
    t.setSize(400,100);
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
