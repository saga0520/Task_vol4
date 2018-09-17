import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CountUp extends Frame{
	static int count = 0;
	static JLabel label;

	public static void main(String[] args){

		//ウィンドウの設定
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);

		//カウントボタンを押下した際の動作を設定
		JButton counter_button = new JButton("カウントアップ");
		counter_button.addActionListener(e -> {
			count++;
			label.setText(count + " 回");
		});

		//リセットボタンを押下した際の動作を設定
		JButton reset_button = new JButton("リセット");
		reset_button.addActionListener(e -> {
			label.setText("0 回");
		});

		//ボタン押下カウンターを配置
		label = new JLabel("0 回");
		label.setHorizontalAlignment(JLabel.CENTER);

		//カウントアップボタン、リセットボタンを配置
		JPanel buttonPanel;
		buttonPanel = new JPanel();
		buttonPanel.add(counter_button);
		buttonPanel.add(reset_button);

		Container Container = frame.getContentPane();
		Container.add(buttonPanel, BorderLayout.NORTH);
		Container.add(label);

		//可視化
		frame.setVisible(true);
	}
}