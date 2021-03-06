import com.trolltech.qt.core.QByteArray;
import com.trolltech.qt.core.QEasingCurve;
import com.trolltech.qt.core.QPropertyAnimation;
import com.trolltech.qt.core.QRect;
import com.trolltech.qt.core.QTime;
import com.trolltech.qt.core.QTimer;
import com.trolltech.qt.core.Qt;
import com.trolltech.qt.gui.QAction;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QKeySequence;
import com.trolltech.qt.gui.QWidget;


public class Clock extends QWidget {
	Ui_Form ui = new Ui_Form(); //�� �����
	QTimer timer = new QTimer();
	
	
	
	public Clock() {
		ui.setupUi(this);
		timer.timeout.connect(this, "dislpayTime()");
		timer.start(1000);
		dislpayTime();
		onScreenSwitch();
		anim(1000);
		QAction actionScreenMode = new QAction(this);
		QAction actionExit = new QAction(this);
		
		actionScreenMode.setShortcut(QKeySequence.fromString("CTRL+F"));
		actionScreenMode.triggered.connect(this, "onScreenSwitch()");
		ui.lcdNumber.addAction(actionScreenMode);
		
		actionExit.setShortcut(QKeySequence.fromString("Escape"));
		actionExit.triggered.connect(QApplication.instance(), "quit()");
		this.addAction(actionExit);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QApplication.initialize(args); //������������� ���� ������������ (:
		
		Clock clock = new Clock();
		clock.show();
		
		QApplication.exec(); //����� ��� �����, ���!!
	}
		
	public void anim(int time) {
		QPropertyAnimation an = new QPropertyAnimation(ui.lcdNumber, new QByteArray("geometry"));
		QEasingCurve easing = new QEasingCurve();
		easing.setType(QEasingCurve.Type.Linear);
		QRect rectStart = new QRect(this.width() /2 , this.height() / 2, 0, 0);
		QRect rectStop = new QRect(0, 0, this.width() , this.height());
		an.setDuration(time);
		an.setEasingCurve(easing);
		an.setStartValue(rectStart);
		an.setEndValue(rectStop);
		an.start();
	}
	
	public void dislpayTime() {
		String time;
		
		if(QTime.currentTime().hour() <= 9)
			time = "0" + QTime.currentTime().hour() + ":";
		else
			time = QTime.currentTime().hour() + ":";
		
		if(QTime.currentTime().minute() <= 9)
			time += "0" + QTime.currentTime().minute();
		else
			time += QTime.currentTime().minute() + "";
		
		ui.lcdNumber.display(time);
	}
	
	public void onScreenSwitch() {
		if(isFullScreen()) {
			setWindowState(Qt.WindowState.WindowNoState);
		} else {
			setWindowState(Qt.WindowState.WindowFullScreen);
		}
	}
}
