import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;

/**
 * Created by Malone-Ibra on 5/4/2019.
 *
 */
public class Login extends JFrame{
    public String userName;
    private JComboBox <String> dbType;
    private JTextField userNameTextField = new JTextField(20);
    private JPasswordField passwordField = new JPasswordField(20);
    private JLabel warningLabel = new JLabel();
    private JMenu userMenu;
    private JMenu settingsMenu;
    private JMenu connection;
    public JMenuBar menuBar;
    private JPanel panel4;
    private JPanel jPanel;
    private JPanel panel8;
    private JPanel panel5;
    private JPanel panel7;
    Color blackBackground = new Color(45,48,53);
    Color textColor = new Color(255,255,255);
    Color textEditorBorder = new Color(105, 108, 113);
    Color textEditor = new Color(34,37,42);
    Color inverseTextEditor = new Color(60, 60, 60);
    private Login(String title){
        super(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initMainWindow();
    }
    private void initMainWindow(){
        Font forte = new Font("forte",Font.BOLD,75);
        Font forte1 = new Font("forte",Font.PLAIN,16);


        Color buttonColor = new Color(117, 114, 155);

        //Menu
        JMenuItem database = new JMenuItem("Database");
        database.setForeground(textColor);
        database.setBackground(blackBackground);
        settingsMenu = new JMenu("Settings");
        settingsMenu.setForeground(textColor);
        settingsMenu.add(database);
        JMenuItem checkConnection = new JMenuItem("refresh ");
        checkConnection.setForeground(textColor);
        checkConnection.setBackground(blackBackground);
        JMenuItem closeConnection = new JMenuItem("close ");
        closeConnection.setForeground(textColor);
        closeConnection.setBackground(blackBackground);
        connection = new JMenu("Connection");
        connection.setForeground(textColor);
        connection.add(checkConnection);
        connection.add(closeConnection);
        JMenuItem exit = new JMenuItem("Exit");
        exit.setBackground(blackBackground);
        exit.setForeground(textColor);
        userMenu = new JMenu("Users");
        userMenu.setForeground(textColor);
        userMenu.add(exit);
        menuBar = new JMenuBar();
        menuBar.setBackground(blackBackground);
        menuBar.setBorder(BorderFactory.createLineBorder(textEditor));
        menuBar.add(connection);
        menuBar.add(settingsMenu);
        menuBar.add(userMenu);
        this.setJMenuBar(menuBar);

        //Title
        JLabel loginLabel = new JLabel("DARK LOGIN PAGE");
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        loginLabel.setVerticalAlignment(SwingConstants.TOP);
        loginLabel.setBackground(blackBackground);
        loginLabel.setForeground(textColor);
        loginLabel.setFont(forte);
        jPanel = new JPanel(new GridLayout(3,1,10,0));
        jPanel.setBackground(blackBackground);
        JSeparator separator = new JSeparator();
        separator.setBackground(textEditor);
        separator.setForeground(textEditor);
        jPanel.add(separator);
        jPanel.add(loginLabel);
        jPanel.add(new JLabel());
        //Warning Label
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        panel.setBackground(blackBackground);
        panel.add(new JLabel());
        panel.add(warningLabel);
        //Database
        JLabel dbLabel = new JLabel(" Data-Base:");
        dbLabel.setForeground(textColor);
        dbLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        dbLabel.setFont(forte1);
        String [] db = {"<none configured>",""};
        dbType = new JComboBox<>(db);
        dbType.setFont(new Font("verdana",Font.PLAIN,12));
        dbType.setBorder(BorderFactory.createLineBorder(textEditorBorder));//
        dbType.setBackground(inverseTextEditor);
        dbType.setForeground(textColor);
        JButton configButton = new JButton(". . .");
        configButton.setBackground(inverseTextEditor);
        configButton.setForeground(textColor);
        configButton.setBorder(BorderFactory.createLineBorder(textEditor));
        JPanel panel0 = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        panel0.setBackground(blackBackground);
        panel0.add(dbLabel);
        panel0.add(dbType);
        panel0.add(configButton);
        //UserName
        JLabel userNameLabel = new JLabel("USER-NAME:");
        userNameLabel.setForeground(textColor);
        userNameLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        userNameLabel.setFont(forte1);
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        panel1.setBackground(blackBackground);
        userNameTextField.setFont(new Font("verdana",Font.PLAIN,16));
        userNameTextField.setBorder(BorderFactory.createLineBorder(textEditorBorder));//
        userNameTextField.setBackground(inverseTextEditor);
        userNameTextField.setForeground(textColor);
        userNameTextField.setCaretColor(Color.white);
        panel1.add(userNameLabel);
        panel1.add(userNameTextField);
        //Password
        JLabel passwordLabel = new JLabel("PASS-WORD:");
        passwordLabel.setForeground(textColor);
        passwordLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        passwordLabel.setFont(forte1);
        passwordField.setFont(new Font("verdana",Font.PLAIN,16));
        passwordField.setBorder(BorderFactory.createLineBorder(textEditorBorder));
        passwordField.setForeground(textColor);
        passwordField.setBackground(inverseTextEditor);
        passwordField.setCaretColor(Color.white);
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        panel2.setBackground(blackBackground);
        panel2.add(passwordLabel);
        panel2.add(passwordField);
        //login
        JButton loginButton = new JButton("LOG IN");
        loginButton.setPreferredSize(new Dimension(80,40));
        loginButton.setFont(new Font("verdana",Font.PLAIN,14));
        loginButton.setBackground(inverseTextEditor);
        loginButton.setForeground(textColor);
        loginButton.setBorder(BorderFactory.createLineBorder(textEditor));
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        panel3.setBackground(blackBackground);
        panel3.add(new JLabel());
        panel3.add(loginButton);
        panel3.add(new JLabel());

        panel4 = new JPanel(new GridLayout(5,1,10,-10));
        panel4.setBackground(blackBackground);
        panel4.add(panel);
        panel4.add(panel0);
        panel4.add(panel1);
        panel4.add(panel2);
        panel4.add(panel3);
        panel5 = new JPanel();
        panel5.setBackground(blackBackground);
        panel7 = new JPanel(new GridLayout(4,1,10,40));
        panel7.setBackground(blackBackground);
        for(int j = 1;j<=4;j++){
            panel7.add(new JLabel());
        }
        panel8 = new JPanel();
        panel8.setBackground(blackBackground);

        //add to the frame
        Container contentPane = this.getContentPane();
        contentPane.setBackground(blackBackground);
        contentPane.setLayout(new BorderLayout(100,0));
        contentPane.add(jPanel,BorderLayout.NORTH);
        contentPane.add(panel4,BorderLayout.CENTER);
        contentPane.add(panel5,BorderLayout.EAST);
        contentPane.add(panel7, BorderLayout.SOUTH);
        contentPane.add(panel8,BorderLayout.WEST);

        //listeners
        database.addActionListener(e->dataBaseSettings());
        loginButton.addActionListener(e->login());
    }
    private void login(){
        userName = userNameTextField.getText().trim();

        if (userName.equals("")){
            warningLabel.setForeground(Color.RED);
            warningLabel.setText("Username is null");
        }else {
            warningLabel.setForeground(Color.BLUE);
            warningLabel.setText("Authenticating...");
        }
    }
    private void dataBaseSettings(){
        Font forte1 = new Font("forte",Font.PLAIN,16);
        Font forteTitle = new Font("forte",Font.PLAIN,26);
        //Main Label
        JLabel newDbSetUpLabel = new JLabel("NEW DATABASE SETUP");
        newDbSetUpLabel.setBackground(blackBackground);
        newDbSetUpLabel.setForeground(textColor);
        newDbSetUpLabel.setHorizontalAlignment(SwingConstants.CENTER);
        newDbSetUpLabel.setFont(forteTitle);
        //Select Database Type
        JLabel dbTypeLabel = new JLabel("Database Type");
        dbTypeLabel.setForeground(textColor);
        String [] dbTypes = {"MARIA DB ", "ORACLE ", " mySQLITE", "mySQL"};
        JComboBox <String> dbTypeComboBox = new JComboBox<>(dbTypes);
        dbTypeComboBox.setFont(new Font("verdana",Font.PLAIN,12));
        dbTypeComboBox.setBorder(BorderFactory.createLineBorder(textEditorBorder));//
        dbTypeComboBox.setBackground(inverseTextEditor);
        dbTypeComboBox.setForeground(textColor);
        JPanel dbTypePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        dbTypePanel.setBackground(blackBackground);
        dbTypePanel.add(dbTypeLabel);
        dbTypePanel.add(dbTypeComboBox);
        JPanel topPanel = new JPanel(new BorderLayout(0,10));
        topPanel.setBackground(blackBackground);
        topPanel.add(newDbSetUpLabel, BorderLayout.NORTH);
        topPanel.add(dbTypePanel,BorderLayout.CENTER);
        //HOST Configuration
        JLabel hostLabel = new JLabel("Host Configuration");
        hostLabel.setBackground(blackBackground);
        hostLabel.setForeground(textColor);
        hostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        hostLabel.setFont(forte1);
        //local-HOST
        JCheckBox localHostCheckBox = new JCheckBox("Local Host");
        localHostCheckBox.setBackground(blackBackground);
        localHostCheckBox.setForeground(textColor);
        JPanel localHostPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        localHostPanel.setBackground(blackBackground);
        localHostPanel.add(localHostCheckBox);
        //Remote Host
        JLabel hostNameLabel = new JLabel("Host: ");
        hostNameLabel.setForeground(textColor);
        JTextField hostTextField = new JTextField(10);
        hostTextField.setFont(new Font("verdana",Font.PLAIN,16));
        hostTextField.setBorder(BorderFactory.createLineBorder(textEditorBorder));//
        hostTextField.setBackground(inverseTextEditor);
        hostTextField.setForeground(textColor);
        hostTextField.setCaretColor(Color.white);
        JPanel host = new JPanel(new FlowLayout(FlowLayout.CENTER));
        host.setBackground(blackBackground);
        host.add(hostNameLabel);
        host.add(hostTextField);
        //DB Name
        JLabel dbNameLabel = new JLabel("Database Name: ");
        dbNameLabel.setForeground(textColor);
        JTextField dbNameTextField = new JTextField(12);
        dbNameTextField.setFont(new Font("verdana",Font.PLAIN,16));
        dbNameTextField.setBorder(BorderFactory.createLineBorder(textEditorBorder));//
        dbNameTextField.setBackground(inverseTextEditor);
        dbNameTextField.setForeground(textColor);
        dbNameTextField.setCaretColor(Color.white);
        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(blackBackground);
        panel1.add(dbNameLabel);
        panel1.add(dbNameTextField);
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.setBackground(blackBackground);
        panel.add(host);
        panel.add(panel1);
        JPanel hostPanel = new JPanel(new BorderLayout());
        hostPanel.setBackground(blackBackground);
        hostPanel.add(hostLabel,BorderLayout.NORTH);
        hostPanel.add(localHostPanel,BorderLayout.CENTER);
        hostPanel.add(panel,BorderLayout.SOUTH);
        //Test Connection
        JLabel testConnLabel = new JLabel("Test Connection");
        testConnLabel.setForeground(textColor);
        testConnLabel.setFont(forte1);
        testConnLabel.setHorizontalAlignment(SwingConstants.CENTER);
        //UserName
        JLabel userLabel = new JLabel("USER: ");
        userLabel.setForeground(textColor);
        JTextField userTextField = new JTextField(12);
        userTextField.setFont(new Font("verdana",Font.PLAIN,16));
        userTextField.setBorder(BorderFactory.createLineBorder(textEditorBorder));//
        userTextField.setBackground(inverseTextEditor);
        userTextField.setForeground(textColor);
        userTextField.setCaretColor(Color.white);
        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(blackBackground);
        panel2.add(userLabel);
        panel2.add(userTextField);
        //password
        JLabel passwordLabel = new JLabel("PASSWORD:");
        passwordLabel.setForeground(textColor);
        JPasswordField passwordField = new JPasswordField(12);
        passwordField.setFont(new Font("verdana",Font.PLAIN,16));
        passwordField.setBorder(BorderFactory.createLineBorder(textEditorBorder));//
        passwordField.setBackground(inverseTextEditor);
        passwordField.setForeground(textColor);
        passwordField.setCaretColor(Color.white);
        JPanel panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(blackBackground);
        panel3.add(passwordLabel); panel3.add(passwordField);
        JPanel jPanel = new JPanel(new GridLayout(1,2,10,10));
        jPanel.setBackground(blackBackground);
        jPanel.add(panel2);jPanel.add(panel3);
        //test connection button
        JButton testButton = new JButton("TEST");
        testButton.setPreferredSize(new Dimension(80,40));
        testButton.setFont(new Font("verdana",Font.PLAIN,14));
        testButton.setBackground(inverseTextEditor);
        testButton.setForeground(textColor);
        testButton.setBorder(BorderFactory.createLineBorder(textEditor));
        JLabel feedBackLabel = new JLabel("FeedBack: ");
        feedBackLabel.setForeground(textColor);
        JPanel jPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jPanel1.setBackground(blackBackground);
        jPanel1.add(testButton);
        jPanel1.add(feedBackLabel);
        JPanel jPanel2 = new JPanel(new GridLayout(2,1,10,10));
        jPanel2.setBackground(blackBackground);
        jPanel2.add(jPanel1); jPanel2.add(new  JLabel());
        JPanel testConnPanel = new JPanel(new BorderLayout(10,10));
        testConnPanel.setBackground(blackBackground);
        testConnPanel.add(testConnLabel,BorderLayout.NORTH);
        testConnPanel.add(jPanel,BorderLayout.CENTER);
        testConnPanel.add(jPanel2,BorderLayout.SOUTH);
        JPanel panel4 =new JPanel(new BorderLayout(1,21));
        panel4.setBackground(blackBackground);
        panel4.add(topPanel,BorderLayout.NORTH);
        panel4.add(hostPanel,BorderLayout.CENTER);
        panel4.add(testConnPanel,BorderLayout.SOUTH);
        Object [] options = {"FINISH","NO","CANCEL"};
        //UIManager UI = new UIManager();
        UIManager.put("OptionPane.background",new ColorUIResource(45,48,53));
        UIManager.put("Panel.background",new ColorUIResource(45,48,53));
        UIManager.put("Button.background",inverseTextEditor);
        UIManager.put("Button.foreground",new ColorUIResource(255,255,255));
        UIManager.put("Button.border",BorderFactory.createLineBorder(new ColorUIResource(34,37,42)));
        UIManager.put("Button.font",new Font("verdana",Font.PLAIN,14));
        UIManager.put("Button.size",new Dimension(50,30));

        //setPreferredSize(new Dimension(80,40));


        int ans = JOptionPane.showOptionDialog(null,panel4,"Database Settings",JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

        if (ans==0){
            System.out.println("Change Implemented");
        }else if (ans==1){
            System.out.println("");
        }else{
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Login frame = new Login("DATABASE ");
        frame.pack();

        frame.setSize(1450,730);
        frame.setVisible(true);

    }
}
