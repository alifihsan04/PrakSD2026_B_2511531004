package Pekan7_2511531004;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;   
import javax.swing.JLabel;    
import javax.swing.JTextArea;  
import javax.swing.JTextField; 
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingUtilities;

public class InsertionSortGUI_2511531004 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int [] array_1004;
	private JLabel[] labelArray_1004;
	private JButton stepButton_1004, resetButton_1004, setButton_1004;
	private JTextField inputField_1004;
	private JPanel panelArray_1004;
	private JTextArea stepArea_1004;
	private JPanel contentPane;
	
	private int i_1004 = 1,j_1004;
	private boolean sorting_1004 = false;
	private int stepCount_1004;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public InsertionSortGUI_2511531004() {
		setTitle("Insertion Sort Langkah per Langkah");
	    setSize(750, 400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    setLayout(new BorderLayout());

	    JPanel inputPanel_1004 = new JPanel(new FlowLayout());
	    inputField_1004 = new JTextField(30);
	    setButton_1004 = new JButton("Set Array");
	    inputPanel_1004.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
	    inputPanel_1004.add(inputField_1004);
	    inputPanel_1004.add(setButton_1004);

	    panelArray_1004 = new JPanel();
	    panelArray_1004.setLayout(new FlowLayout());

	    JPanel controlPanel_1004 = new JPanel();
	    stepButton_1004 = new JButton("Langkah Selanjutnya");
	    resetButton_1004 = new JButton("Reset");
	    stepButton_1004.setEnabled(false);
	    controlPanel_1004.add(stepButton_1004);
	    controlPanel_1004.add(resetButton_1004);
	    
	    stepArea_1004 = new JTextArea(8, 60);
	    stepArea_1004.setEditable(false);
	    stepArea_1004.setFont(new Font("Monospaced", Font.PLAIN, 14));
	    JScrollPane scrollPane_1004 = new JScrollPane(stepArea_1004);

	    add(inputPanel_1004, BorderLayout.NORTH); 	 
	    add(panelArray_1004, BorderLayout.CENTER);
	    add(controlPanel_1004, BorderLayout.SOUTH);
	    add(scrollPane_1004, BorderLayout.EAST);

	    // Event Set Array
	    setButton_1004.addActionListener(e_1004 -> setArrayFromInput_1004());

	    // Event Langkah Selanjutnya
	    stepButton_1004.addActionListener(e_1004 -> performStep_1004());

	    // Event Reset
	    resetButton_1004.addActionListener(e_1004 -> reset_1004());

	}
	
	private void setArrayFromInput_1004() {
	    String text_1004 = inputField_1004.getText().trim();
	    if (text_1004.isEmpty()) return;
	    String[] parts_1004 = text_1004.split(",");
	    array_1004 = new int[parts_1004.length];
	    try {
	        for (int k_1004 = 0; k_1004 < parts_1004.length; k_1004++) {
	            array_1004[k_1004] = Integer.parseInt(parts_1004[k_1004].trim());
	        }
	    } catch (NumberFormatException e_1004) {
	        JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan \n"
	                + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
	        return;
	    }
	    i_1004= 1;
	    stepCount_1004 = 1;
	    sorting_1004 = true;
	    stepButton_1004.setEnabled(true);
	    stepArea_1004.setText("");
	    panelArray_1004.removeAll();
	    labelArray_1004 = new JLabel[array_1004.length];
	    for (int k_1004 = 0; k_1004 < array_1004.length; k_1004++) {
	        labelArray_1004[k_1004] = new JLabel(String.valueOf(array_1004[k_1004]));
	        labelArray_1004[k_1004].setFont(new Font("Arial", Font.BOLD, 24));
	        labelArray_1004[k_1004].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        labelArray_1004[k_1004].setPreferredSize(new Dimension(50, 50));
	        labelArray_1004[k_1004].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_1004.add(labelArray_1004[k_1004]);
	    }
	    panelArray_1004.revalidate();
	    panelArray_1004.repaint();
	}
	
	private void performStep_1004() {
	    if (i_1004 < array_1004.length && sorting_1004) {
	        int key_1004 = array_1004[i_1004];
	        int j_1004 = i_1004 - 1;

	        StringBuilder stepLog_1004 = new StringBuilder();
	        stepLog_1004.append("Langkah ").append(stepCount_1004)
	                .append(": Memasukkan ").append(key_1004).append("\n");

	        while (j_1004 >= 0 && array_1004[j_1004] > key_1004) {
	            array_1004[j_1004 + 1] = array_1004[j_1004];
	            j_1004--;
	        }
	        array_1004[j_1004 + 1] = key_1004;

	        updateLabels_1004();
	        stepLog_1004.append("Hasil: ").append(arrayToString_1004(array_1004)).append("\n\n");
	        stepArea_1004.append(stepLog_1004.toString());

	        i_1004++;
	        stepCount_1004++;

	        if (i_1004 == array_1004.length) {
	            sorting_1004 = false;
	            stepButton_1004.setEnabled(false);
	            JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        }
	    }
	}
	
	private void updateLabels_1004() {
	    for (int k_1004 = 0; k_1004 < array_1004.length; k_1004++) {
	        labelArray_1004[k_1004].setText(String.valueOf(array_1004[k_1004]));
	    }
	}

	private void reset_1004() {
	    inputField_1004.setText("");
	    panelArray_1004.removeAll();
	    panelArray_1004.revalidate();
	    panelArray_1004.repaint();
	    stepArea_1004.setText("");
	    stepButton_1004.setEnabled(false);
	    sorting_1004 = false;
	    i_1004 = 1;
	    stepCount_1004= 1;
	}

	private String arrayToString_1004 (int[] arr_1004) {
	    StringBuilder sb_1004 = new StringBuilder();
	    for (int k_1004 = 0; k_1004 < arr_1004.length; k_1004++) {
	        sb_1004.append(arr_1004[k_1004]);
	        if (k_1004 < arr_1004.length - 1) sb_1004.append(", ");
	    }
	    return sb_1004.toString();
	}

	public static void main(String[] args) {
	    SwingUtilities.invokeLater(() -> {
	        InsertionSortGUI_2511531004 gui_1004 = new InsertionSortGUI_2511531004();
	        gui_1004.setVisible(true);
	    });
	}
	
	
	

}