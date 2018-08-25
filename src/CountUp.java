import java.awt.EventQueue;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CountUp {
	static int count = 0;
	public static void main(String[] args){

		//イベントディスパッチスレッドでSwingの描画処理を行う
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				ActionButton actBtn = new ActionButton();
				actBtn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				actBtn.setVisible(true);
			}
		});
	}
}

//serialの警告を抑止
@SuppressWarnings("serial")
class ActionButton extends JFrame implements ActionListener {
	Integer count = 0;
	public ActionButton(){

		//ウインドウを設定
		setTitle("課題");
		setSize(400, 300);
		setLocationRelativeTo(null);

    	//初期設定：カウント0回を表示するラベルの作成
        Label label = new Label("0 回");
        label.setBounds(180,100,100,100);
		add(label);

		//カウントアップボタンを押下した際の動作を設定
		JButton counter_button = new JButton("カウントアップ");
		counter_button.addActionListener(e -> {
			count++;
			String str = count.toString();
			label.setText(str + " 回");
		});

		//リセットボタンを押下した際の動作を設定
		JButton reset_button = new JButton("リセット");
		reset_button.addActionListener(e -> {
			count = 0;
			String str = count.toString();
        	label.setText(str + " 回");
		});

		//カウントアップボタンとリセットボタンを配置
		JPanel buttonPanel;
		buttonPanel = new JPanel();
		buttonPanel.add(counter_button);
		buttonPanel.add(reset_button);
		add(buttonPanel);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

	}
}