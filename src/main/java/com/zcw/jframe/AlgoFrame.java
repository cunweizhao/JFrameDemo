package com.zcw.jframe;


import javax.swing.*;
import java.awt.*;

/**
 * @ClassName : AlgoFrame
 * @Description :  创建属于自己的第一个JFanme子类
 * @Author : Zhaocunwei
 * @Date: 2020-08-24 09:49
 */
public class AlgoFrame extends JFrame {

    private int canvasWidth;
    private int canvasHeight;

    public AlgoFrame(String title,int canvasWidth, int canvasHeight){
        super(title);

        this.canvasHeight = canvasHeight;
        this.canvasWidth = canvasWidth;

        AlgoCanvas canvas = new AlgoCanvas();
        setContentPane(canvas);
        pack();

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public AlgoFrame(String title){
        this(title,1024,768);
    }

    public int getCanvasWidth(){
        return canvasWidth;
    }
    public int getCanvasHeight(){
        return canvasHeight;
    }

    /**
     * 内部画布类
     */
    private class AlgoCanvas extends JPanel{

        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawOval(50,50,300,300);
        }

        @Override
        public Dimension getPreferredSize(){
            return new Dimension(canvasWidth,canvasHeight);
        }
    }
}
