import javax.swing.*;

public class CobaGUI extends JFrame
{
	JLabel usernameLb, passwordLb, roleLb;
	JTextField usernameTf;
	JPasswordField passwordPf;
	JComboBox roleCb;
	JCheckBox showCk;
	JButton cancelBt, loginBt;
	JLabel imageLb;
	
	public CobaGUI() //constructor
	{
		initComponent();
		setComponent();
		viewComponent();
	}

	//inisialisasi semua komponen
	public void initComponent()
	{
		usernameLb = new JLabel("Username");
		passwordLb = new JLabel("Password");
		roleLb = new JLabel("Role");
		usernameTf = new JTextField();
		passwordPf = new JPasswordField();
		roleCb = new JComboBox();
		showCk = new JCheckBox("Show/hide password");
		cancelBt = new JButton("Cancel");
		loginBt = new JButton("Login");
		imageLb = new JLabel(new ImageIcon("anggrek.jpg"));
	}

	//pasang komponen ke JFrame
	public void setComponent()
	{
		setSize(300, 600); //width 300, height 600
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //tekan X maka close
		setLayout(null); //x,y
		setResizable(false); //tidak dapat di-resize
		setLocationRelativeTo(null);
		setTitle("Aplikasi Login BINUS");
		setIconImage(new ImageIcon("binus.jpg").getImage());
		
		imageLb.setBounds(10,120,265,157);
		add(imageLb);
		
		usernameLb.setBounds(10,300,130,20); // x,y,w,h
		add(usernameLb);
		usernameTf.setBounds(150,300,130,20);
		add(usernameTf);
		
		passwordLb.setBounds(10,330,130,20);
		add(passwordLb);
		passwordPf.setBounds(150,330,130,20);
		add(passwordPf);
		
		showCk.setBounds(10,360,230,20);
		add(showCk);
		
		roleLb.setBounds(10,390,130,20);
		add(roleLb);
		roleCb.setBounds(150,390,130,20);
		add(roleCb);
		
		cancelBt.setBounds(10,420,130,30);
		add(cancelBt);
		loginBt.setBounds(150,420,130,30);
		add(loginBt);
		
		roleCb.addItem("Student");
		roleCb.addItem("Lecturer");
		roleCb.addItem("Parent");
		roleCb.addItem("Staff");
	}

	//visibel/show
	public void viewComponent()
	{
		setVisible(true);
	}

	public static void main(String[]args)
	{
		new CobaGUI();
	}
}