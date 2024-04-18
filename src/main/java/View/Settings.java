/*
 * Created by JFormDesigner on Thu Apr 18 18:35:26 CST 2024
 */

package View;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import com.intellij.uiDesigner.core.*;

/**
 * @author 84977
 */
public class Settings extends JPanel {
    public Settings() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        label1 = new JLabel();

        //======== this ========
        setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), 5, -1));

        //---- label1 ----
        label1.setText("<html> <head>  <meta charset=\"utf-8\">  <title>\u83dc\u9e1f\u6559\u7a0b(runoob.com)</title>  </head> <body>  <p> \u8fd9\u662f\u4e00\u4e2a\u7535\u5b50\u90ae\u4ef6\u94fe\u63a5\uff1a <a href=\"mailto:someone@example.com?Subject=Hello%20again\" target=\"_top\"> \u53d1\u9001\u90ae\u4ef6</a> </p>  <p> <b>\u6ce8\u610f:</b> \u5355\u8bcd\u4e4b\u95f4\u7a7a\u683c\u4f7f\u7528 %20 \u4ee3\u66ff\uff0c\u4ee5\u786e\u4fdd\u6d4f\u89c8\u5668\u53ef\u4ee5\u6b63\u5e38\u663e\u793a\u6587\u672c\u3002 </p>  </body> </html>");
        label1.setVerticalAlignment(SwingConstants.TOP);
        add(label1, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
