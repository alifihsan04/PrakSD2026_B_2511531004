package Pekan8_2511531004;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BubleSortGUI_2511531004 extends JFrame {

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
	public BubleSortGUI_2511531004() {
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
	    
	    private void performStep_1004() {
	        if (!sorting_1004 || j_1004 >= array_1004.length - 1) {
	            sorting_1004 = false;
	            stepButton_1004.setEnabled(false);
	            JOptionPane.showMessageDialog(this, "Sorting selesai!");
	            return;
	        }
	        resetHighlights_1004();
	        StringBuilder stepLog = new StringBuilder();
	        labelArray_1004[j_1004].setBackground(Color.CYAN);
	        labelArray_1004[j_1004 + 1].setBackground(Color.CYAN);
	        if (array_1004[j_1004] > array_1004[j_1004 + 1]) {
	            // Swap
	            int temp = array_1004[j_1004];
	            array_1004[j_1004] = array_1004[j_1004 + 1];
	            array_1004[j_1004 + 1] = temp;
	            labelArray_1004[j_1004].setBackground(Color.RED);
	            labelArray_1004[j_1004 + 1].setBackground(Color.RED);
	            stepLog.append("Langkah ").append(stepCount_1004).append(": Menukar elemen ke-")
	                   .append(j_1004).append(" (").append(array_1004[j_1004 + 1]).append(") dengan ke-")
	                   .append(j_1004 + 1).append(" (").append(array_1004[j_1004]).append(")\n");
	        } else {
	            stepLog.append("Langkah ").append(stepCount_1004).append(": Tidak ada pertukaran antara ke-")
	                   .append(j_1004).append(" dan ke-").append(j_1004 + 1).append("\n");
	        }
	        stepLog.append("Hasil: ").append(arrayToString_1004(array_1004)).append("\n\n");
	        stepArea_1004.append(stepLog.toString());
	        updateLabels_1004();
	        j_1004++;
	        if (j_1004 >= array_1004.length - i_1004 - 1) {
	            j_1004 = 0;
	            i_1004++;
	        }
	        stepCount_1004++;
	        if (i_1004 >= array_1004.length - 1) {
	            sorting_1004 = false;
	            stepButton_1004.setEnabled(false);
	            JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        }
	    }
	    
	    private void updateLabels_1004() {
	    	for (int k = 0; k < array_1004.length; k++) {
	    		labelArray_1004[k].setText(String.valueOf(array_1004[k]));
	    		
	    	}
	    }
	    private void resetHighlights_1004() {
	    	for (JLabel label: labelArray_1004) {
	    		label.setBackground(Color.white);
	    	}
	    }
	    
	    private void reset_1004 () {
	    	inputField_1004.setText("");
	    	panelArray_1004.removeAll();
	    	panelArray_1004.revalidate();
	    	panelArray_1004.repaint();
	    	stepArea_1004.setText("");
	    	stepButton_1004.setEnabled(false);
	    	sorting_1004 = false;
	    	i_1004 = 0;
	    	j_1004 = 0;
	    	stepCount_1004 = 1;
	 
	    }
	    
	    private String arrayToString_1004(int[] arr_1004) {
	    	StringBuilder sb = new StringBuilder();
	    	for (int k = 0; k < arr_1004.length; k++) {
	    		sb.append(arr_1004[k]);
	    		if (k < arr_1004.length - 1) sb.append(", ");
	    	}
	    	return sb.toString();
	    }


	    private void setArrayFromInput_1004() {
	        String text = inputField_1004.getText().trim();
	        if (text.isEmpty()) return;
	        String[] parts = text.split(",");
	        array_1004 = new int[parts.length];
	        try {
	            for (int k = 0; k < parts.length; k++) {
	                array_1004[k] = Integer.parseInt(parts[k].trim());
	            }
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(this, "Masukkan hanya angka "
	                + "yang dipisahkan koma", "Error", JOptionPane.ERROR_MESSAGE);
	            return;
	        }
	        i_1004 = 0;
	        j_1004 = 0;
	        stepCount_1004 = 1;
	        sorting_1004 = true;
	        stepButton_1004.setEnabled(true);
	        stepArea_1004.setText("");
	        panelArray_1004.removeAll();
	        labelArray_1004 = new JLabel[array_1004.length];
	        for (int k = 0; k < array_1004.length; k++) {
	            labelArray_1004[k] = new JLabel(String.valueOf(array_1004[k]));
	            labelArray_1004[k].setFont(new Font("Arial", Font.BOLD, 24));
	            labelArray_1004[k].setOpaque(true);
	            labelArray_1004[k].setBackground(Color.WHITE);
	            labelArray_1004[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	            labelArray_1004[k].setPreferredSize(new Dimension(50, 50));
	            labelArray_1004[k].setHorizontalAlignment(SwingConstants.CENTER);
	            panelArray_1004.add(labelArray_1004[k]);
	        }
	        panelArray_1004.revalidate();
	        panelArray_1004.repaint();
	        
	        
	        
	    

	}
	    
	    
	    public static void main(String [] args) {
	    	SwingUtilities.invokeLater (() -> {
	    	BubleSortGUI_2511531004 gui_1004 = new BubleSortGUI_2511531004() ;
	    	gui_1004.setVisible(true);
	    	
	    	});

	}
	    
}
