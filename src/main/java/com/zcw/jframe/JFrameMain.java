package com.zcw.jframe;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName : JFrameMain
 * @Description :
 * @Author : Zhaocunwei
 * @Date: 2020-08-24 09:07
 */
public class JFrameMain {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
            JFrame jframe = new JFrame("Welcome");
            jframe.setSize(500,500);
            jframe.setResizable(false);
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe.setVisible(true);
        });

    }
}
