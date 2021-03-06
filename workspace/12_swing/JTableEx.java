import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

class JTableModel extends AbstractTableModel{
	Object[][] data = {{"Nari", "����ġ", new Integer(1234), "����ģ��"},
						{"One", "������", new Integer(1111), "������"},
						{"Two", "������", new Integer(2222), "�Ϳ�����"},
						{"Three", "�ƶ�ġ", new Integer(3333), "���Ƹ�ģ��"}};
	String[] name = {"���̵�", "�̸�", "��й�ȣ", "����"};

	public int getColumnCount(){
		return name.length;
	}
	public int getRowCount(){
		return data.length;
	}
	public Object getValueAt(int r, int c){
		return data[r][c];
	}
	public boolean isCellEditable(int r, int c){
		return (c!=0) ? true : false;
	}
	public String getColumnName(int c){
		return name[c];
	}
	public void setValueAt(Object obj, int r, int c){
		data[r][c] = obj;
	}
}
public class JTableEx extends JFrame{
	JTable table;
	JTableModel model;

	public JTableEx(){
		model = new JTableModel();
		table = new JTable(model);

		add(new JScrollPane(table));

		setBounds(400, 400 , 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args){
		new JTableEx();
	}
}
