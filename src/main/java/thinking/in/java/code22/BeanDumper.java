package thinking.in.java.code22;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BeanDumper extends JFrame {

	private JTextField query = new JTextField(20);
	private JTextArea results = new JTextArea();
	public void print(String s) { results.append(s + "\n"); }
	public void dump(Class<?> bean) {
		results.append("");
		BeanInfo bi = null;
		try {
			bi = Introspector.getBeanInfo(bean, Object.class);	
		} catch(IntrospectionException ex) {
			System.out.println("Couldn't introspect " + bean.getName());
			return ;
		}
		for (PropertyDescriptor d : bi.getPropertyDescriptors()) {
			Class<?> p = d.getPropertyType();
			if(p == null) continue;
			System.out.println("Property type:\n " + getName() + " Property type:\n " + d.getName());
			Method readMethod = d.getReadMethod();
			if(readMethod != null) {
				System.out.println("Read method:\n " + readMethod);
			}
			Method writeMethod = d.getWriteMethod();
			if(writeMethod != null) {
				System.out.println("Write method:\n " + writeMethod);
			}
			System.out.println("=============================");
		}
		System.out.println("Public methods:");
		for (MethodDescriptor m : bi.getMethodDescriptors()) {
			System.out.println(m.getMethod().toString());
		}
		System.out.println("=============================");
		System.out.println("Event support:");
		for (EventSetDescriptor e : bi.getEventSetDescriptors()) {
			System.out.println("Listener type:\n " + e.getListenerType().getName());
			for (Method lm : e.getListenerMethods()) {
				System.out.println("Listener method:\n " + lm.getName());
			}
			for (MethodDescriptor lmd : e.getListenerMethodDescriptors()) {
				System.out.println("Method descriptor:\n " + lmd.getMethod());
			}
			Method addListener = e.getAddListenerMethod();
			System.out.println("Add Listener Method:\n " + addListener);
			Method removeListener = e.getRemoveListenerMethod();
			System.out.println("Remove Listener Method:\n " + removeListener);
			System.out.println("================================");
		}
	}
	class Dumper implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String name = query.getText();
			Class<?> c = null;
			try {
				c = Class.forName(name);
			} catch(ClassNotFoundException ex) {
				results.setText("Couldn't find " + name);
				return ;
			}
			dump(c);
		}
	}
	public BeanDumper() {
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(new JLabel("Qualified bean name:"));
		p.add(query);
		add(BorderLayout.NORTH, p);
		add(new JScrollPane(results));
		Dumper dmpr = new Dumper();
		query.addActionListener(dmpr);
		query.setText("thinking.in.java.code22.Frog");
		dmpr.actionPerformed(new ActionEvent(dmpr, 0, ""));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new BeanDumper(), 600, 500);
	}

}
