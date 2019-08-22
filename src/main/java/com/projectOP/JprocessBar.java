package com.projectOP;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;
import javax.swing.filechooser.*;
import javax.swing.filechooser.FileFilter;

public class JprocessBar extends JFrame{

    private JProgressBar progressBar = new JProgressBar();
    private JButton button = new JButton("升级");
    private JLabel label = new JLabel();
    private Box box = Box.createVerticalBox();
    private Box box1 = Box.createHorizontalBox();
    private Box box2 = Box.createHorizontalBox();
    private Box box3 = Box.createHorizontalBox();

    public JprocessBar() {
        setTitle("选项卡面板");
        setBounds(400, 400, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label.setText("系统升级");
        label.setLocation(SwingConstants.CENTER, getDefaultCloseOperation());
        progressBar.setIndeterminate(false);//设置进度条的样式为不确定的进度条样式（进度条来回滚动），false为确定的进度条样式（即进度条从头到尾显示）
        progressBar.setStringPainted(true);//设置进度条显示提示信息
        progressBar.setString("系统等待升级");//设置提示信息
        //给按钮添加事件监听器，点击按钮开始升级
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                new Progress(progressBar, button).start();// 利用线程模拟一个在线升级任务
            }
        });

        box1.add(label);
        box2.add(progressBar);
        box3.add(button);
        box.add(box1);
        box.add(box2);
        box.add(box3);
        add(box);
        setVisible(true);
    }

    class Progress extends Thread{
        private int[] num = {1,10,20,30,40,50,60,70,80,90,100};
        private JProgressBar bar;
        private JButton button;
        public Progress(JProgressBar progressBar, JButton button) {
            this.bar = progressBar;
            this.button = button;
        }
        public void run() {
            bar.setStringPainted(true);
            bar.setIndeterminate(false);//采用确定的进度条样式

            for(int i = 0; i < num.length; i++) {

                try {
                    bar.setValue(num[i]);
                    Thread.sleep(100);

                }catch(Exception e) {
                    e.printStackTrace();
                }
            }

            bar.setString("系统升级结束");
            //给按钮添加事件监听器，升级结束后退出系统
            button.setText("升级结束");
            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    System.exit(0);
                }
            });

        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JprocessBar test = new JprocessBar();
    }
}