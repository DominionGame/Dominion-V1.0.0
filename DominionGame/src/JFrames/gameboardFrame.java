package JFrames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

public class gameboardFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gameboardFrame frame = new gameboardFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gameboardFrame() {
		setResizable(false);
		setMinimumSize(new Dimension(800, 550));
		setSize(new Dimension(800, 550));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAction1 = new JButton("Action1");
		btnAction1.setIcon(new ImageIcon("C:\\Users\\Brian\\Documents\\Dominion\\images klein\\alchemist.jpg"));
		btnAction1.setBounds(185, 91, 71, 69);
		contentPane.add(btnAction1);
		
		JButton btnAction2 = new JButton("Action2");
		btnAction2.setBounds(266, 91, 71, 69);
		contentPane.add(btnAction2);
		
		JButton btnAction3 = new JButton("Action3");
		btnAction3.setBounds(347, 91, 71, 69);
		contentPane.add(btnAction3);
		
		JButton btnAction4 = new JButton("Action4");
		btnAction4.setBounds(428, 91, 71, 69);
		contentPane.add(btnAction4);
		
		JButton btnAction5 = new JButton("Action5");
		btnAction5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAction5.setBounds(509, 91, 71, 69);
		contentPane.add(btnAction5);
		
		JButton btnAction10 = new JButton("Action10");
		btnAction10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAction10.setBounds(509, 171, 71, 69);
		contentPane.add(btnAction10);
		
		JButton btnAction9 = new JButton("Action9");
		btnAction9.setBounds(428, 171, 71, 69);
		contentPane.add(btnAction9);
		
		JButton btnAction8 = new JButton("Action8");
		btnAction8.setBounds(347, 171, 71, 69);
		contentPane.add(btnAction8);
		
		JButton btnAction7 = new JButton("Action7");
		btnAction7.setBounds(266, 171, 71, 69);
		contentPane.add(btnAction7);
		
		JButton btnAction6 = new JButton("Action6");
		btnAction6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAction6.setBounds(185, 171, 71, 69);
		contentPane.add(btnAction6);
		
		JButton btnEstate = new JButton("Estate");
		btnEstate.setBounds(104, 11, 71, 69);
		contentPane.add(btnEstate);
		
		JButton btnDuchy = new JButton("Duchy");
		btnDuchy.setBounds(185, 11, 71, 69);
		contentPane.add(btnDuchy);
		
		JButton btnProvince = new JButton("Province");
		btnProvince.setBounds(266, 11, 71, 69);
		contentPane.add(btnProvince);
		
		JButton btnCopper = new JButton("Copper");
		btnCopper.setBounds(428, 11, 71, 69);
		contentPane.add(btnCopper);
		
		JButton btnSilver = new JButton("silver");
		btnSilver.setBounds(509, 11, 71, 69);
		contentPane.add(btnSilver);
		
		JButton btnGold = new JButton("Gold");
		btnGold.setBounds(590, 11, 71, 69);
		contentPane.add(btnGold);
		
		JButton btnCurse = new JButton("Curse");
		btnCurse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCurse.setBounds(23, 11, 71, 69);
		contentPane.add(btnCurse);
		
		JLabel lblTrashPile = new JLabel("Trash Pile");
		lblTrashPile.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrashPile.setIcon(new ImageIcon("C:\\Users\\Brian\\Documents\\Dominion\\images klein\\trash.jpg"));
		lblTrashPile.setBackground(Color.ORANGE);
		lblTrashPile.setBounds(23, 171, 71, 69);
		contentPane.add(lblTrashPile);
		
		JLabel lblTrashPileText = new JLabel("Trash Pile");
		lblTrashPileText.setBounds(23, 146, 89, 14);
		contentPane.add(lblTrashPileText);
		
		JLabel lblDiscardPileText = new JLabel("Discard Pile");
		lblDiscardPileText.setHorizontalAlignment(SwingConstants.LEFT);
		lblDiscardPileText.setBounds(658, 307, 71, 14);
		contentPane.add(lblDiscardPileText);
		
		JLabel lblHand = new JLabel("Hand");
		lblHand.setBounds(347, 307, 46, 14);
		contentPane.add(lblHand);
		
		JButton btnDrawPile = new JButton("Draw Pile");
		btnDrawPile.setBounds(23, 332, 71, 69);
		contentPane.add(btnDrawPile);
		
		JLabel lblDrawPileText = new JLabel("Draw Pile");
		lblDrawPileText.setBounds(25, 307, 87, 14);
		contentPane.add(lblDrawPileText);
		
		
		Object[] items =
	        {
	            new ImageIcon("C:\\Users\\Brian\\Documents\\Dominion\\images klein\\back.jpg"),
	            new ImageIcon("C:\\Users\\Brian\\Documents\\Dominion\\images klein\\baron.jpg"),
	            new ImageIcon("C:\\Users\\Brian\\Documents\\Dominion\\images klein\\bazaar.jpg"),
	            new ImageIcon("C:\\Users\\Brian\\Documents\\Dominion\\images klein\\curse.jpg"),
	            new ImageIcon("C:\\Users\\Brian\\Documents\\Dominion\\images klein\\duchy.jpg"),
	            new ImageIcon("C:\\Users\\Brian\\Documents\\Dominion\\images klein\\estate.jpg"),
	            new ImageIcon("C:\\Users\\Brian\\Documents\\Dominion\\images klein\\duchy.jpg"),
	            new ImageIcon("C:\\Users\\Brian\\Documents\\Dominion\\images klein\\estate.jpg")
	        };
		
		JComboBox comboBox = new JComboBox(items);
		comboBox.setBounds(185, 330, 395, 20);
		comboBox.setMaximumRowCount(2);
		contentPane.add(comboBox);
		
		JLabel lblDiscardPile = new JLabel("Discard Pile");
		lblDiscardPile.setIcon(new ImageIcon("C:\\Users\\Brian\\Documents\\Dominion\\images klein\\back.jpg"));
		lblDiscardPile.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiscardPile.setBackground(Color.ORANGE);
		lblDiscardPile.setBounds(658, 332, 71, 69);
		contentPane.add(lblDiscardPile);
		
		JButton btnNextPhase = new JButton("Next Phase");
		btnNextPhase.setBounds(217, 456, 120, 23);
		contentPane.add(btnNextPhase);
		
		JLabel label = new JLabel("0");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(615, 425, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("0");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(615, 460, 46, 14);
		contentPane.add(label_1);
		
		JLabel lblCurrentPhase = new JLabel("Current Phase");
		lblCurrentPhase.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentPhase.setBounds(217, 431, 120, 14);
		contentPane.add(lblCurrentPhase);
		
		JLabel lblRemainingActions = new JLabel("Remaining Actions");
		lblRemainingActions.setBounds(671, 425, 113, 14);
		contentPane.add(lblRemainingActions);
		
		JLabel lblRemainingBuys = new JLabel("Remaining Buys");
		lblRemainingBuys.setBounds(671, 460, 113, 14);
		contentPane.add(lblRemainingBuys);
		
		JButton btnEndTurn = new JButton("End Turn");
		btnEndTurn.setBounds(428, 456, 120, 23);
		contentPane.add(btnEndTurn);
	}
}
