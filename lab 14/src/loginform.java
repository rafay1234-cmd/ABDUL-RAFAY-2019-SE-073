

	import java.awt.Color;
	import java.awt.Container;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPasswordField;
	import javax.swing.JTextField;


	public class loginform extends JFrame implements ActionListener{
		
		Container c;
		JLabel username=new JLabel("username");
		JLabel password =new JLabel ("Password");
		JTextField user_tf=new JTextField();
		JPasswordField pass_pf=new JPasswordField();
		JButton b=new JButton("LOGIN");

		loginform(){
			c=this.getContentPane();
			c.setBackground(Color.YELLOW);
			c.setLayout(null);
			
			username.setBounds(100,100,200,30);
			password.setBounds(100,200,200,30);
			user_tf.setBounds(200,100,200,30);
			pass_pf.setBounds(200,200,200,30);
			b.setBounds(140,370,100,40);
			b.addActionListener(this);
			
			Font f=new Font("Arial",Font.BOLD,20);
			
			username.setFont(f);
			password.setFont(f);
			user_tf.setFont(f);
			pass_pf.setFont(f);
			b.setFont(f);
			
			c.add(username);
			c.add(password);
			c.add(user_tf);
			c.add(pass_pf);
			c.add(b);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b) {
			String user=user_tf.getText();
			String pass=pass_pf.getText();
			if(user.equals("abdul")&& pass.equals("1234")) {
				 c.setBackground(Color.green);
			}
			else {
				
				JLabel warn=new JLabel("WArRning.............your user name and passwprd is not correct");
				warn.setBounds(100,370,400,400);
				
				c.add(warn);
			   c.setBackground(Color.RED);
			}
			
		}

	}
	
}
