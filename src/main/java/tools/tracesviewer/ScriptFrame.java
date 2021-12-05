/*
 * ScriptFrame.java
 *
 * Created on April 30, 2002, 11:50 AM
 */
package tools.tracesviewer;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author deruelle
 * @version
 */
public class ScriptFrame extends Dialog {

	public TextArea infoTextArea;
	public Container container;
	public Button ok;

	/** Creates new ScriptFrame */
	public ScriptFrame() {
		super(new Frame(), " Auxiliary information ", false);
		initComponents();
	}

	public void initComponents() {

		setLayout(new BorderLayout());
		setBackground(Color.lightGray);
		setSize(512, 384);

		/**********************************************************************/

		infoTextArea = new TextArea();
		infoTextArea.setEditable(false);
		infoTextArea.setBackground(Color.white);
		add(infoTextArea, BorderLayout.CENTER);

		ok = new Button("  Ok  ");
		ok.setBackground(Color.lightGray);
		ok.setForeground(Color.black);
		add(ok, BorderLayout.SOUTH);
		ok.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				dispose();
			}
		});

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);

				dispose();

			}
		});

		setVisible(false);
	}

	public void setText(String host, String text) {
		setTitle("Auxiliary information for " + host);
		infoTextArea.setText(text);
	}

}
