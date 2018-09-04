package flowbutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrameb extends JFrame{
	
	JLabel label1=new JLabel("Do You Love Me？");
	JPanel panel1=new JPanel();
	//JPanel panel2=new JPanel();
	JButton button1=new JButton("YES");
	JButton button2=new JButton("NO");
	
	MyFrameb(String title,int x,int y,int w,int h){
		setTitle(title);
		setBounds(x,y,w,h);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		
		label1.setFont(new Font("华文细黑",Font.PLAIN,26));
		button1.setBackground(Color.PINK);
		button1.setBorderPainted(false);
		button1.setFocusPainted(false);
		button1.setFont(new Font("华文细黑",Font.PLAIN,18));
		button2.setBackground(Color.PINK);
		button2.setBorderPainted(false);
		button2.setFocusPainted(false);
		button2.setFont(new Font("华文细黑",Font.PLAIN,18));
		button1.addActionListener(new Listener());
		button2.addMouseListener(new MListener());
		panel1.setBackground(Color.PINK);
		panel1.add(label1);
		panel1.add(button1);
		panel1.add(button2);
		
		add(panel1);
	}
	
	class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(button1)){
				JOptionPane.showMessageDialog(null, "                       Me Too٩(๑❛ᴗ❛๑)۶","Love Message",JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
	
	class MListener implements MouseListener{
		/*
		public void mouseDragged(MouseEvent em) {
		}
		public void mouseMoved(MouseEvent em) {
		}
		*/
		public void mouseEntered(MouseEvent em){
			Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
			int width = (int)screensize.getWidth();
			int height = (int)screensize.getHeight();
			//int x=width/2-250;
			//int y=height/2-175;
			int a=(int)(Math.random()*width);
			int b=(int)(Math.random()*(height-100));
			button2.setLocation(a,b);
			//button2.setBounds(a,b,c,d);
		}
		public void mouseClicked(MouseEvent arg0) {
		}
		public void mouseExited(MouseEvent arg0) {
		}
		public void mousePressed(MouseEvent arg0) {
		}
		public void mouseReleased(MouseEvent arg0) {
		}
	}
}
public class FlowButton {
	public static void main(String[] args) {
		Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screensize.getWidth();
		int height = (int)screensize.getHeight();
		int x=width/2-250;
		int y=height/2-175;
		MyFrameb mf=new MyFrameb("Answer This",x,y,500,350);
		mf.setVisible(true);
	}
}
