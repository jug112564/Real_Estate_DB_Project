package Login;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JLabel idLabel;
	private JLabel pwLabel;
	private JLabel capitalLabel;
	private JLabel hopeCityLabel;
	private JLabel conditionLabel;
	private String[] ConditionString = {"월세","전세","매매"};
	private JTextField idTextField;
	private JTextField pwTextField;
	private JTextField capitalTextField;
	private JTextField hopeCityTextField;
	private JLabel CheckPwLabel;
	private JTextField checkPwTextField;
	
	public SignUp() {
		initialize();
	}

	// 프레임 초기화
	private void initialize() {
		frame = new JFrame("회원가입");
		frame.setBounds(100, 100, 500, 577);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("회원 가입");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(137, 25, 163, 40);
		titleLabel.setFont(new Font("맑은 고딕",Font.BOLD,22));
		frame.getContentPane().add(contentPane);
		frame.getContentPane().add(titleLabel);
		
		idLabel = new JLabel("아이디");
		idLabel.setBounds(45, 100, 50, 15);
		frame.getContentPane().add(idLabel);
		
		pwLabel = new JLabel("비밀번호");
		pwLabel.setBounds(45, 165, 50, 15);
		frame.getContentPane().add(pwLabel);
		
		capitalLabel = new JLabel("자본금");
		capitalLabel.setBounds(45, 285, 50, 15);
		frame.getContentPane().add(capitalLabel);
		
		hopeCityLabel = new JLabel("희망도시");
		hopeCityLabel.setBounds(45, 345, 50, 15);
		frame.getContentPane().add(hopeCityLabel);
		
		conditionLabel = new JLabel("계약조건");
		conditionLabel.setBounds(45, 405, 50, 15);
		frame.getContentPane().add(conditionLabel);
		
		JComboBox conditionComboBox = new JComboBox(ConditionString);
		conditionComboBox.setBounds(45, 425, 323, 23);
		frame.getContentPane().add(conditionComboBox);
		
		idTextField = new JTextField();
		idTextField.setBounds(45, 125, 323, 21);
		frame.getContentPane().add(idTextField);
		idTextField.setColumns(10);
		
		pwTextField = new JTextField();
		pwTextField.setColumns(10);
		pwTextField.setBounds(45, 185, 323, 21);
		frame.getContentPane().add(pwTextField);
		
		capitalTextField = new JTextField();
		capitalTextField.setColumns(10);
		capitalTextField.setBounds(45, 305, 323, 21);
		frame.getContentPane().add(capitalTextField);
		
		hopeCityTextField = new JTextField();
		hopeCityTextField.setColumns(10);
		hopeCityTextField.setBounds(45, 365, 323, 21);
		frame.getContentPane().add(hopeCityTextField);
		
		CheckPwLabel = new JLabel("비밀번호 재확인");
		CheckPwLabel.setBounds(45, 225, 125, 15);
		frame.getContentPane().add(CheckPwLabel);
		
		checkPwTextField = new JTextField();
		checkPwTextField.setColumns(10);
		checkPwTextField.setBounds(45, 245, 323, 21);
		frame.getContentPane().add(checkPwTextField);
		
		JButton IdCheckButton = new JButton("중복 확인");
		IdCheckButton.setBounds(383, 124, 91, 23);
		frame.getContentPane().add(IdCheckButton);
		
		JButton SignUpButton = new JButton("가입하기");
		SignUpButton.setBounds(45, 475, 323, 40);
		frame.getContentPane().add(SignUpButton);
		
		
	}
}
