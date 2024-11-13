import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tugas3 extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private Color pastelPink = new Color(253, 222, 238);
    private Color darkPink = new Color(249, 140, 182);
    private Color white = Color.WHITE;

    public tugas3() {
        setTitle("Hi, welcome! <3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400); 
        setLocationRelativeTo(null);

        // Setup CardLayout
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Membuat panel login dan register
        mainPanel.add(createLoginPanel(), "login");
        mainPanel.add(createRegisterPanel(), "register");

        add(mainPanel);
    }

    private JPanel createLoginPanel() {
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new BorderLayout(10, 10));
        loginPanel.setBackground(pastelPink);

        // Judul
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(pastelPink);
        JLabel titleLabel = new JLabel("LOGIN");
        titleLabel.setFont(new Font("Poppins", Font.BOLD, 25)); // Font lucu
        titleLabel.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
        titlePanel.add(titleLabel);

        // Panel untuk form menggunakan GridBagLayout
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(pastelPink);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Komponen-komponen form
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);

        // Styling komponen
        emailField.setPreferredSize(new Dimension(200, 30));
        passwordField.setPreferredSize(new Dimension(200, 30));

        // Menambahkan komponen ke form panel
        gbc.gridx = 0; gbc.gridy = 0;
        formPanel.add(emailLabel, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        formPanel.add(emailField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        formPanel.add(passwordLabel, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        formPanel.add(passwordField, gbc);

        // Panel untuk button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5)); // Mengurangi jarak
        buttonPanel.setBackground(pastelPink);

        JButton submitButton = new JButton("Submit");
        JButton toRegisterButton = new JButton("Register");

        // Button
        submitButton.setBackground(darkPink);
        submitButton.setForeground(white);
        toRegisterButton.setBackground(darkPink);
        toRegisterButton.setForeground(white);

        // Menambahkan action listener
        submitButton.addActionListener(e -> {
            // Implementasi login di sini
            JOptionPane.showMessageDialog(this, "Well done, you're logged in.");
        });

        toRegisterButton.addActionListener(e -> {
            cardLayout.show(mainPanel, "register");
        });

        buttonPanel.add(submitButton);
        buttonPanel.add(toRegisterButton);

        // Menambahkan semua panel ke login panel
        loginPanel.add(titlePanel, BorderLayout.NORTH);
        loginPanel.add(formPanel, BorderLayout.CENTER);
        loginPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Menurunkan judul dan menaikkan tombol
        titlePanel.setPreferredSize(new Dimension(0, 50)); // Menurunkan judul
        buttonPanel.setPreferredSize(new Dimension(0, 40)); // Menaikkan tombol

        return loginPanel;
    }

    private JPanel createRegisterPanel() {
        JPanel registerPanel = new JPanel();
        registerPanel.setLayout(new BorderLayout(10, 10));
        registerPanel.setBackground(pastelPink);

        // Panel untuk judul
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(pastelPink);
        JLabel titleLabel = new JLabel("REGISTER");
        titleLabel.setFont(new Font("Poppins", Font.BOLD, 25));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0)); // Menambahkan ruang di atas
        titlePanel.add(titleLabel);

        // Panel untuk form menggunakan GridBagLayout
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(pastelPink);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Komponen-komponen form
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);

        // Styling komponen
        nameField.setPreferredSize(new Dimension(200, 30));
        emailField.setPreferredSize(new Dimension(200, 30));
        passwordField.setPreferredSize(new Dimension(200, 30));

        // Menambahkan komponen ke form panel
        gbc.gridx = 0; gbc.gridy = 0;
        formPanel.add(nameLabel, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        formPanel.add(nameField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        formPanel.add(emailLabel, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        formPanel.add(emailField, gbc);

        gbc.gridx = 0; gbc.gridy = 4;
        formPanel.add(passwordLabel, gbc);

        gbc.gridx = 0; gbc.gridy = 5;
        formPanel.add(passwordField, gbc);

        // Panel untuk button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5)); // Mengurangi jarak
        buttonPanel.setBackground(pastelPink);

        JButton submitButton = new JButton("Submit");
        JButton toLoginButton = new JButton("Login");

        // Styling button
        submitButton.setBackground(darkPink);
        submitButton.setForeground(white);
        toLoginButton.setBackground(darkPink);
        toLoginButton.setForeground(white);

        // Menambahkan action listener
        submitButton.addActionListener(e -> {
            // Implementasi register di sini
            JOptionPane.showMessageDialog(this, "Well done, you're registered.");
        });

        toLoginButton.addActionListener(e -> {
            cardLayout.show(mainPanel, "login");
        });

        buttonPanel.add(submitButton);
        buttonPanel.add(toLoginButton);

        // Menambahkan semua panel ke register panel
        registerPanel.add(titlePanel, BorderLayout.NORTH);
        registerPanel.add(formPanel, BorderLayout.CENTER);
        registerPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Menurunkan judul dan menaikkan tombol
        titlePanel.setPreferredSize(new Dimension(0, 50)); // Menurunkan judul
        buttonPanel.setPreferredSize(new Dimension(0, 40)); // Menaikkan tombol

        return registerPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new tugas3().setVisible(true);
        });
    }
}