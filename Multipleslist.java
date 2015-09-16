import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;


public class Multipleslist extends JFrame {
	
	
	JList source ;
	JList empty;
	JButton move;
	
	private static String[] items = {"Apple" , "mango" , "bananan" , "grape"};
	public Multipleslist(){
		super("Multiple selection list");
		setLayout(new FlowLayout());
		
		source = new JList(items);
		source.setVisibleRowCount(2);
		source.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(source));
		empty = new JList();
		move = new JButton("Move");
		move.addActionListener(new ActionListener()
		{

			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				empty.setListData(source.getSelectedValues());
				empty.setVisibleRowCount(3);
				empty.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			}
			
			
			
		});
		
		add(move);
		add(new JScrollPane(empty));
	}

}
