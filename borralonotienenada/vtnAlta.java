package VtnArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vtnAlta extends JFrame {

	public vtnAlta() {
	JFrame aviso = new JFrame();
	this.setLayout(new FlowLayout());
	this.setSize(300,200);
	this.setLocationRelativeTo(null); 
	Logica gestor = new Logica();
	
		JLabel lblISBN = new JLabel("ISBN : ");
		JLabel lblNOMBRE = new JLabel("NOMBRE : ");
		JLabel lblAUTOR = new JLabel("AUTOR : ");
		
		JTextField jtfISBN = new JTextField(6);
		JTextField jtfNOMBRE = new JTextField(6);
		JTextField jtfAUTOR = new JTextField(6);
				
		JButton btnAlta = new JButton("Registrar");
		
		
		this.add(lblISBN);
		this.add(jtfISBN);
		
		this.add(lblNOMBRE);
		this.add(jtfNOMBRE);
		
		this.add(lblAUTOR);
		this.add(jtfAUTOR);
		
		this.add(btnAlta);
		
		btnAlta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(gestor.guardarLibro(jtfISBN.getText(), jtfNOMBRE.getText(), jtfAUTOR.getText())) {
					JOptionPane.showMessageDialog(aviso, "GUARDADO!");
				}
				
			}
		});
	}
}