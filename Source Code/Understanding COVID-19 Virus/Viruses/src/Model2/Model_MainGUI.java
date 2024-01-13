package Model2;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model2.Cell.Cell;
import Model2.Cell.Cellular_organelle;
import Model2.Virus.Acid_Nucleic;
import Model2.Virus.Viral_Envelope;
import Model2.Virus.Virus;
import javax.swing.JTextArea;

public class Model_MainGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Cell cell;
	private Virus virus;
	private JTextArea text = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					Model_MainGUI frame = new Model_MainGUI();
//					frame.setVisible(true);
					//Virus v, Cell c
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Model_MainGUI(Virus v, Cell c) {
		this.cell=c; this.virus=v;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		text.setRows(25);
		text.setColumns(50);
		contentPane.add(text);				
	      				
		infection();
		
	}
	
	public void infection() {
		if(!virus.reach(cell)) { JOptionPane.showMessageDialog(null, "Tế bào không phù hợp"); return;}
		
		cell.adde(virus.entry_signal());
		
		updateView();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		ArrayList<Biological_Element > tmp = new ArrayList<>();
		
		for(Biological_Element be: cell.getElements()) {
			
			if(be instanceof Acid_Nucleic) {
				for(int i =0;i<2;i++) {
			   tmp.add(cell.synthesize_Acid_Nucleic((Acid_Nucleic)be));
			   
				}
			}
			else if(be instanceof Protein_molecule) {
				//JOptionPane.showMessageDialog(null, be.putString());
				for(int i =0;i<2;i++) {
					   tmp.add(cell. synthesize_Protein((Protein_molecule)be));
						}
				
					}
		}
		JOptionPane.showMessageDialog(null, cell.putString());
		cell.adde(tmp);
		//for(Biological_Element be: cell.getElements()) {JOptionPane.showMessageDialog(null, be.putString());}
		//updateView();
				
	}
	
	public void updateView() {
		
		text.setText(cell.putString());
		//JOptionPane.showMessageDialog(null, "Bước tiếp theo trong quá trình lây nhiễm");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
