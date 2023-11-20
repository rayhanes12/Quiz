
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class log extends javax.swing.JFrame {

    private String username;
    private String password;

    public log() {
        initComponents();
    }

    private void initComponents() {
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        pack();
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
        username = usernameField.getText();
        password = new String(passwordField.getPassword());

        // Tambahkan logika verifikasi login di sini
        if ("username".equals(username) && "password".equals(password)) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal. Coba lagi.");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    if(validasiInput() == true){
        try {
              Connection con = connection.Go();
        Statement s = con.createStatement();
        String sql = "SELECT * FROM login WHERE(username='"+f_username.getText()+"') AND password='"+f_password.getText()+"'";
        
            ResultSet rs = s.executeQuery(sql);
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "Paswword Salah");
                f_password.requestFocus();
            }else{
                JOptionPane.showMessageDialog(null, "Login Sukses");
            }
        } catch (Exception e) {
        }
        }
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;

    private static class Connection {

        public Connection() {
        }

        private Statement createStatement() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class f_password {

        private static void requestFocus() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public f_password() {
        }
    }

    private static class f_username {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public f_username() {
        }
    }

    private static class ResultSet {

        public ResultSet() {
        }

        private boolean next() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class Statement {

        public Statement() {
        }

        private ResultSet executeQuery(String sql) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
