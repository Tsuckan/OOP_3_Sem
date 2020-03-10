package com.mirea.lab;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TextEditor extends JFrame
{
    //--------------------------------------------------------
    /**
     * Конструктор класса
     */
    private JTextArea input = new JTextArea("");
    private TextEditor()
    {
        super("Текстовый редактор");
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        // Создание строки главного меню
        JMenuBar menuBar = new JMenuBar();
        // Добавление в главное меню выпадающих пунктов меню
        menuBar.add(textColor());
        menuBar.add(textFont());
        // Подключаем меню к интерфейсу приложения
        setJMenuBar(menuBar);
        Container container = getContentPane();
        container.setLayout(new GridLayout(1,1,2,2));
        container.add(input);
        // Открытие окна
        input.setBackground(Color.gray);
        setBounds(300, 300,500,500);
        setVisible(true);
    }
    //--------------------------------------------------------
    /**
     * Функция создания меню "Файл"
     * @return
     */
    private JMenu textColor()
    {
        // Создание выпадающего меню
        JMenu Color = new JMenu("Цвет");
        // Пункт меню "Открыть" с изображением
        JMenuItem color1 = new JMenuItem("Синий");
        // Пункт меню из команды с выходом из программы
        JMenuItem color2 = new JMenuItem("Красный");
        JMenuItem color3 = new JMenuItem("Черный");
        // Добавим в меню пункта open
        Color.add(color1);
        Color.addSeparator();
        Color.add(color2);
        Color.addSeparator();
        Color.add(color3);
        // Добавление разделителя
        class changeColor(int i)
        {
            if( i == 1) {
                input.setForeground(java.awt.Color.blue);
                System.out.println("Set color blue");
            }
            if( i == 2) {
            input.setForeground(java.awt.Color.blue);
            System.out.println("Set color blue");
            }
            if( i == 3) {
            input.setForeground(java.awt.Color.blue);
            System.out.println("Set color blue");
             }
        }
        color1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                changeColor(1);
                input.setForeground(java.awt.Color.blue);
                System.out.println ("Set color blue");
            }
        });

        color2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                input.setForeground(java.awt.Color.red);
                System.out.println ("Set color red");
            }
        });

        color3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                input.setForeground(java.awt.Color.black);
                System.out.println ("Set color black");
            }
        });
        return Color;
    }
    //--------------------------------------------------------
    // создадим забавное меню
    /**
     * Функция создания меню
     * @return
     */
    private JMenu textFont() //выбор шрифта
    {
        // Создание выпадающего меню
        JMenu Fonts = new JMenu("Шрифт");
        // Пункт меню "Открыть" с изображением
        JMenuItem font1 = new JMenuItem("Times New Roman");
        // Пункт меню из команды с выходом из программы
        JMenuItem font2 = new JMenuItem("MS Sans Serif");
        JMenuItem font3 = new JMenuItem("Courier New");
        // Добавим в меню пункта open
        Fonts.add(font1);
        Fonts.addSeparator();
        Fonts.add(font2);
        Fonts.addSeparator();
        Fonts.add(font3);
        // Добавление разделителя

        font1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                input.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                System.out.println ("Set Times New Roman");
            }
        });

        font2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                input.setFont(new Font("MS Sans Serif", Font.PLAIN, 15));
                System.out.println ("Set MS Sans Serif");
            }
        });

        font3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                input.setFont(new Font("Courier New", Font.PLAIN, 15));
                System.out.println ("Set Courier New");
            }
        });
        return Fonts;
    }

    public static void main(String[] args)
    {
        // Подключение украшений для окон
        JFrame.setDefaultLookAndFeelDecorated(true);
        new TextEditor();
    }
}