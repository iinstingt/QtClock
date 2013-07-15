/********************************************************************************
 ** Form generated from reading ui file 'clock.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.1
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Form implements com.trolltech.qt.QUiForm<QWidget>
{
    public QVBoxLayout verticalLayout;
    public QLCDNumber lcdNumber;

    public Ui_Form() { super(); }

    public void setupUi(QWidget Form)
    {
        Form.setObjectName("Form");
        Form.resize(new QSize(520, 300).expandedTo(Form.minimumSizeHint()));
        verticalLayout = new QVBoxLayout(Form);
        verticalLayout.setObjectName("verticalLayout");
        lcdNumber = new QLCDNumber(Form);
        lcdNumber.setObjectName("lcdNumber");

        verticalLayout.addWidget(lcdNumber);

        retranslateUi(Form);

        Form.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Часы", "Часы", null));
    } // retranslateUi

}

