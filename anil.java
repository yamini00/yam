import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

 class NewRec extends JFrame {
	public static void main(String[] args) {
		NewRec frameTabel = new NewRec();
	
	JPanel panel = new JPanel();
	JTextField name = new JTextField(50);
	JTextField rollno = new JTextField(10);
	JTextField branch = new JTextField(10);
	JTextField phoneno = new JTextField(10);
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	JLabel label5 = new JLabel();
	JButton submit = new JButton("Submit");
	JButton breset = new JButton("Reset");
	JButton back = new JButton("Back");
	NewRec(){
		label1.setText("!! INSERT NEW RECORD !!");
		label2.setText(" Name :- ");
		label3.setText(" Roll No. :- ");
		label4.setText(" Branch :- ");
		label5.setText(" Phone No. :- ");
		setTitle("Welcome to Student Managment System ");
		setSize(350,300);
		setLocation(300,280);
		panel.setLayout (null); 
		label1.setBounds(90,30,300,20);
		label2.setBounds(40,70,150,20);
		name.setBounds(120,70,150,20);
		label3.setBounds(40,100,150,20);
		rollno.setBounds(120,100,150,20);
		label4.setBounds(40,130,150,20);
		branch.setBounds(120,130,150,20);
		label5.setBounds(40,160,150,20);
		phoneno.setBounds(120,160,150,20);
		submit.setBounds(20,190,80,20);
		breset.setBounds(130,190,80,20);
		back.setBounds(240,190,80,20);
		panel.add(label1);
		panel.add(label2);
		panel.add(name);
		panel.add(label3);
		panel.add(rollno);
		panel.add(label4);
		panel.add(branch);
		panel.add(label5);
		panel.add(phoneno);
		panel.add(submit);
		panel.add(breset);
		panel.add(back);
		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		action();
	}
	public void action()
	{
		submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{    
				String line = null;
				String sname = name.getText();
				String sroll = rollno.getText();
				String sbranch = branch.getText();
				String sphone = phoneno.getText();
				String FILENAME = "student.txt";
				BufferedWriter bw = null;
				FileWriter fw = null;
				try 
				{
					File file = new File(FILENAME);
					// if file doesnt exists, then create it
					if (!file.exists())
						file.createNewFile();
					// true = append file
					fw = new FileWriter(file.getAbsoluteFile(), true);
					bw = new BufferedWriter(fw);						
					String i=" / ";
					bw.write(sname);
					bw.write(i);
					bw.write(sroll);
					bw.write(i);
					bw.write(sbranch);
					bw.write(i);
					bw.write(sphone);
					bw.write(i);
					bw.newLine();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				} 
				finally 
				{
					try 
					{
						if (bw != null)
							bw.close();
						if (fw != null)
							fw.close();
					} 
					catch (IOException ex) 
					{
						ex.printStackTrace();
					}
				}
				
			JOptionPane.showMessageDialog(null,"Record Saved");
			name.setText("");
			rollno.setText("");
			branch.setText("");
			phoneno.setText("");
			name.requestFocus();
		}	
	});
	//Reset Button
	breset.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				name.setText("");
				rollno.setText("");
				branch.setText("");
				phoneno.setText("");
				name.requestFocus();
			}
	});
	//Back Button
	back.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				Choice regFace =new Choice();
					regFace.setVisible(true);
					dispose();
			}
	});
	}
}  



class EditRec extends JFrame {

public static void main(String[] args) {
EditRec frameTabel = new EditRec();
}

JLabel welcome = new JLabel("Welcome to a EditRec Frame");
JPanel panel = new JPanel();

EditRec(){
super("Welcome");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null); 

welcome.setBounds(70,50,150,60);

panel.add(welcome);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

}

class DelRec extends JFrame {

public static void main(String[] args) {
DelRec frameTabel = new DelRec();
}

JLabel welcome = new JLabel("Welcome to a DelRec Frame");
JPanel panel = new JPanel();

DelRec(){
super("Welcome");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null); 

welcome.setBounds(70,50,150,60);

panel.add(welcome);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

}

 class ViewRec extends JFrame {

public static void main(String[] args) {
ViewRec frameTabel = new ViewRec();
}

JLabel welcome = new JLabel("Welcome to a ViewRec Frame");
JPanel panel = new JPanel();

ViewRec(){
super("Welcome");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null); 

welcome.setBounds(70,50,150,60);

panel.add(welcome);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

}






class Choice extends JFrame {

	public static void main(String[] args) 
	{
		Choice frameTabel = new Choice();
	}
	JButton bnew = new JButton(" New Record ");
	JButton bview = new JButton(" View Record ");
	JButton bedit = new JButton(" Edit Record ");
	JButton bdelete = new JButton(" Delete Record ");
	JPanel panel = new JPanel();
	Choice(){
		setTitle("Welcome to Student Managment System ");
		setSize(350,250);
		setLocation(300,280);
		panel.setLayout (null); 
		bnew.setBounds(100,50,120,20);
		bedit.setBounds(100,80,120,20);
		bdelete.setBounds(100,110,120,20);
		bview.setBounds(100,140,120,20);
		panel.add(bview);
		panel.add(bnew);
		panel.add(bnew);
		panel.add(bedit);
		panel.add(bdelete);
		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
		action();
	}

	public void action()
	{
		bnew.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				NewRec regFace =new NewRec();
				regFace.setVisible(true);
				dispose();
			}
		});
		//Edit Button
		bedit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				EditRec regFace =new EditRec();
				regFace.setVisible(true);
				dispose();
			}
		});
		//Delete Button
		bdelete.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				DelRec regFace =new DelRec();
				regFace.setVisible(true);
				dispose();
			}
		});
	}
}






class LoginForm extends JFrame {

	public static void main(String[] args) 
	{
		LoginForm frameTabel = new LoginForm();
	}
	JButton blogin = new JButton("Login");
	JPanel panel = new JPanel();
	JTextField txuser = new JTextField(15);
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JPasswordField pass = new JPasswordField(15);
	LoginForm()
	{
		label1.setText("Login Autentification");
		label2.setText("User Name :- ");
		label3.setText("Password :- ");
		setTitle("Welcome to Student Managment System ");
		setSize(350,250);
		setLocation(300,280);
		panel.setLayout (null); 
		label1.setBounds(110,30,300,20);
		label2.setBounds(40,70,150,20);
		txuser.setBounds(120,70,150,20);
		label3.setBounds(40,105,150,20);
		pass.setBounds(120,105,150,20);
		blogin.setBounds(130,140,80,20);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(blogin);
		panel.add(txuser);
		panel.add(pass);
		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		actionlogin();
	}
	public void actionlogin()
	{
		blogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				String puname = txuser.getText();
				String ppaswd = pass.getText();
				if(puname.equals("anil") && ppaswd.equals("000810")) 
				{
					Choice regFace =new Choice();
					regFace.setVisible(true);
					dispose();
				} 
				else 
				{
				JOptionPane.showMessageDialog(null,"Wrong Password / Username");
				txuser.setText("");
				pass.setText("");
				txuser.requestFocus();
				}
			}
});
}
}
