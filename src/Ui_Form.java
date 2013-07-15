/********************************************************************************
 ** Form generated from reading ui file 'clock.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.gui.QPalette.ColorGroup;
import com.trolltech.qt.gui.QPalette.ColorRole;

public class Ui_Form implements com.trolltech.qt.QUiForm<QWidget>
{
    public QVBoxLayout verticalLayout;
    public QLCDNumber lcdNumber;

    public Ui_Form() { super(); }

    public void setupUi(QWidget Form)
    {
    	QPalette paliteLcd = new QPalette();
		QPalette paliteForm = new QPalette();
		
		paliteLcd.setColor(ColorGroup.All, ColorRole.WindowText, QColor.red);
		paliteLcd.setColor(ColorGroup.All, ColorRole.Light, QColor.black);
		paliteLcd.setColor(ColorGroup.All, ColorRole.Dark, QColor.black);
		paliteForm.setColor(ColorGroup.All, ColorRole.Window, QColor.black);
		
		Form.setObjectName("Form");
        Form.resize(new QSize(520, 300).expandedTo(Form.minimumSizeHint()));
        Form.setPalette(paliteForm);
        
        verticalLayout = new QVBoxLayout(Form);
        verticalLayout.setObjectName("verticalLayout");
        
        lcdNumber = new QLCDNumber(Form);
        lcdNumber.setObjectName("lcdNumber");
        lcdNumber.setNumDigits(5);
		lcdNumber.setLineWidth(0);
		lcdNumber.setPalette(paliteLcd);

        verticalLayout.addWidget(lcdNumber);

        retranslateUi(Form);

        Form.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Часы", "Часы", null));
    } // retranslateUi

}

