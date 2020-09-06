package br.com.isaccanedo.quebracabeca;

//Quebra-cabeça
//Autor: Isac Canedo de Almeida

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuebraCabeca extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton butAr[] = new JButton[9];
	Border bored = BorderFactory.createEtchedBorder(1);
	private int j = 0;
	private int x[] = new int[8];
	private boolean b = true;
	private JButton bVar;

	public QuebraCabeca() {
	setLayout(new GridLayout(3, 3));
	//Titulo da janela
	this.setTitle("Quebra-cabeça - Isac Canedo de Almeida");
	this.setLocation(362, 234);

	while (b) {
	rand();
	}
	for (int i = 0; i < 8; i++) {
	butAr[i] = new JButton();
	butAr[i].setText("" + x[i]);
	butAr[i].setSize(50, 50);
	butAr[i].setBorder(bored);
	//butAr[i].setBackground(Color.GREEN);
	butAr[i].setBackground(new Color(200, 200, 200));
	butAr[i].setFont(new Font("Ariel", Font.BOLD, 28));
	butAr[i].addActionListener(this);
	add(butAr[i]);
	}
	//the empty cell
	butAr[8] = new JButton();
	butAr[8].setText("");
	butAr[8].setSize(50, 50);
	butAr[8].setBorder(bored);
	//butAr[8].setBackground(Color.WHITE);
	//butAr[8].setBackground(new Color(50, 115, 115));
	butAr[8].setBackground(new Color(200, 200, 200));
	butAr[8].setFont(new Font("Ariel", Font.BOLD, 28));
	butAr[8].addActionListener(this);
	add(butAr[8]);
	bVar = butAr[8];

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300, 300);
	//Tamanho fixo do programa, sem alteção
	setResizable(false);
	//Deixa o programa no meio da tela, centralizado
	setLocationRelativeTo(null);
	setVisible(true);
	}

	public final void rand() {
	if (j > 7) {
	b = false;
	return;
	}

	int randomNum = 1 + (int) (Math.random() * 8);
	if (search(randomNum)) {
	x[j] = randomNum;
	j++;
	return;
	} else {

	return;
	}
	}

	public boolean search(int y) {
	for (int i = 0; i < 7; i++) {
	if (x[i] == y)
	return false;
	}
	return true;
	}

	public boolean check() {
	for (int i = 0; i < 8; i++) {
	if (butAr[i].getText().equals("")
	|| Integer.parseInt(butAr[i].getText()) != i + 1) {
	return false;
	}
	}
	return true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	if (e.getSource() == butAr[0]) {
	if (butAr[1].getText().equals("") || butAr[3].getText().equals("")) {
	bVar.setText(butAr[0].getText());
	butAr[0].setText("");
	bVar = butAr[0];
	if (check()) {
	JOptionPane.showMessageDialog(null,
	"PARABÉNS\nVOCÊ CONSEGUIU!!!", "ISAC CANEDO DE ALMEIDA",
	JOptionPane.INFORMATION_MESSAGE);

	}
	} else {
	Toolkit.getDefaultToolkit().beep();
	JOptionPane.showMessageDialog(null, "Você deve clicar na célula que contém\no número para ser deslocado!",
	"ISAC CANEDO DE ALMEIDA", JOptionPane.ERROR_MESSAGE);
	}

	} else if (e.getSource() == butAr[1]) {

	if (butAr[0].getText().equals("") || butAr[4].getText().equals("")
	|| butAr[2].getText().equals("")) {
	bVar.setText(butAr[1].getText());
	butAr[1].setText("");
	bVar = butAr[1];
	if (check()) {
	JOptionPane.showMessageDialog(null,
	"PARABÉNS\nVOCÊ CONSEGUIU!!!", "ISAC CANEDO DE ALMEIDA",
	JOptionPane.INFORMATION_MESSAGE);

	}
	} else {
	Toolkit.getDefaultToolkit().beep();
	JOptionPane.showMessageDialog(null, "Você deve clicar na célula que contém\no número para ser deslocado!",
	"ISAC CANEDO DE ALMEIDA", JOptionPane.ERROR_MESSAGE);
	}

	} else if (e.getSource() == butAr[2]) {

	if (butAr[1].getText().equals("") || butAr[5].getText().equals("")) {
	bVar.setText(butAr[2].getText());
	butAr[2].setText("");
	bVar = butAr[2];
	if (check()) {
	JOptionPane.showMessageDialog(null,
	"PARABÉNS\nVOCÊ CONSEGUIU!!!", "ISAC CANEDO DE ALMEIDA",
	JOptionPane.INFORMATION_MESSAGE);

	}
	} else {
	Toolkit.getDefaultToolkit().beep();
	JOptionPane.showMessageDialog(null, "Você deve clicar na célula que contém\no número para ser deslocado!",
	"ISAC CANEDO DE ALMEIDA", JOptionPane.ERROR_MESSAGE);
	}

	} else if (e.getSource() == butAr[3]) {

	if (butAr[0].getText().equals("") || butAr[4].getText().equals("")
	|| butAr[6].getText().equals("")) {
	bVar.setText(butAr[3].getText());
	butAr[3].setText("");
	bVar = butAr[3];
	if (check()) {
	JOptionPane.showMessageDialog(null,
	"PARABÉNS\nVOCÊ CONSEGUIU!!!", "ISAC CANEDO DE ALMEIDA",
	JOptionPane.INFORMATION_MESSAGE);

	}
	} else {
	Toolkit.getDefaultToolkit().beep();
	JOptionPane.showMessageDialog(null, "Você deve clicar na célula que contém\no número para ser deslocado!",
	"ISAC CANEDO DE ALMEIDA", JOptionPane.ERROR_MESSAGE);
	}
	} else if (e.getSource() == butAr[4]) {

	if (butAr[1].getText().equals("") || butAr[3].getText().equals("")
	|| butAr[7].getText().equals("")
	|| butAr[5].getText().equals("")) {
	bVar.setText(butAr[4].getText());
	butAr[4].setText("");
	bVar = butAr[4];
	if (check()) {
	JOptionPane.showMessageDialog(null,
	"PARABÉNS\nVOCÊ CONSEGUIU!!!", "ISAC CANEDO DE ALMEIDA",
	JOptionPane.INFORMATION_MESSAGE);

	}
	} else {
	Toolkit.getDefaultToolkit().beep();
	JOptionPane.showMessageDialog(null, "Você deve clicar na célula que contém\no número para ser deslocado!",
	"ISAC CANEDO DE ALMEIDA", JOptionPane.ERROR_MESSAGE);
	}
	} else if (e.getSource() == butAr[5]) {

	if (butAr[2].getText().equals("") || butAr[4].getText().equals("")
	|| butAr[8].getText().equals("")) {
	bVar.setText(butAr[5].getText());
	butAr[5].setText("");
	bVar = butAr[5];
	if (check()) {
	JOptionPane.showMessageDialog(null,
	"PARABÉNS\nVOCÊ CONSEGUIU!!!", "ISAC CANEDO DE ALMEIDA",
	JOptionPane.INFORMATION_MESSAGE);

	}
	} else {
	Toolkit.getDefaultToolkit().beep();
	JOptionPane.showMessageDialog(null, "Você deve clicar na célula que contém\no número para ser deslocado!",
	"ISAC CANEDO DE ALMEIDA", JOptionPane.ERROR_MESSAGE);
	}

	} else if (e.getSource() == butAr[6]) {

	if (butAr[3].getText().equals("") || butAr[7].getText().equals("")) {
	bVar.setText(butAr[6].getText());
	butAr[6].setText("");
	bVar = butAr[6];
	if (check()) {
	JOptionPane.showMessageDialog(null,
	"PARABÉNS\nVOCÊ CONSEGUIU!!!", "ISAC CANEDO DE ALMEIDA",
	JOptionPane.INFORMATION_MESSAGE);

	}
	} else {
	Toolkit.getDefaultToolkit().beep();
	JOptionPane.showMessageDialog(null, "Você deve clicar na célula que contém\no número para ser deslocado!",
	"ISAC CANEDO DE ALMEIDA", JOptionPane.ERROR_MESSAGE);
	}

	} else if (e.getSource() == butAr[7]) {

	if (butAr[6].getText().equals("") || butAr[4].getText().equals("")
	|| butAr[8].getText().equals("")) {
	bVar.setText(butAr[7].getText());
	butAr[7].setText("");
	bVar = butAr[7];
	if (check()) {
	JOptionPane.showMessageDialog(null,
	"PARABÉNS\nVOCÊ CONSEGUIU!!!", "ISAC CANEDO DE ALMEIDA",
	JOptionPane.INFORMATION_MESSAGE);

	}
	} else {
	Toolkit.getDefaultToolkit().beep();
	JOptionPane.showMessageDialog(null, "Você deve clicar na célula que contém\no número para ser deslocado!",
	"ISAC CANEDO DE ALMEIDA", JOptionPane.ERROR_MESSAGE);
	}

	} else if (e.getSource() == butAr[8]) {

	if (butAr[5].getText().equals("") || butAr[7].getText().equals("")) {
	bVar.setText(butAr[8].getText());
	butAr[8].setText("");
	bVar = butAr[8];
	if (check()) {
	JOptionPane.showMessageDialog(null,
	"PARABÉNS\nVOCÊ CONSEGUIU!!!", "ISAC CANEDO DE ALMEIDA",
	JOptionPane.INFORMATION_MESSAGE);
	}
	} else {
	Toolkit.getDefaultToolkit().beep();
	JOptionPane.showMessageDialog(null, "Você deve clicar na célula que contém\no número para ser deslocado!",
	"ISAC CANEDO DE ALMEIDA", JOptionPane.ERROR_MESSAGE);
	}

	}

	}

	@SuppressWarnings("unused")
	public static void main(String args[]) {
	QuebraCabeca main = new QuebraCabeca();
	}
	}

