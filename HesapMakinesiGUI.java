/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesapmakinesiguı;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sena Modanlı
 * 
 */

//Kullanıcıdan iki sayı alan, ve üzerinde bulunan butonlara tıklayarak
//4 işlem yapabileceğimiz basit bir hesap makinesi kodu 
//
//GUI ile

//İstanbul Üniversitesi Bilgisayar Mühendisliği Bölümü 3. dönem Nesneye Yönelik Programlama dersi final sorusu
//

public class HesapMakinesiGUI extends JFrame implements ActionListener{
    
    private JTextField txt1 = new JTextField(5);
    private JTextField txt2 = new JTextField(5);
    private JTextField sonuc = new JTextField(5);
    
    //İlk iki textfield kullanıcıdan sayı almak için
    //Diğer textfield sonuç için
       
    private  JLabel lbl1 = new JLabel("sayi giriniz ");
    private  JLabel lbl2 = new JLabel("sayi giriniz" );
    private  JLabel snc  = new JLabel("Sonucunuz: " );
    
         
    private  JButton bt1;
    private  JButton bt2 ;
    private  JButton bt3;
    private  JButton bt4 ;
    
    //Butonlar 4 işlem için kullanılacak
    
        
    public HesapMakinesiGUI()
    {
       super("HESAP MAKİNESİ");
       setLayout(new FlowLayout());
       setSize(350,200);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
       
       bt1 = new JButton("+");
       bt2 = new JButton("-");
       bt3 = new JButton("*");
       bt4 = new JButton("/");
        
       add(lbl1);
       add(txt1);
       add(lbl2);
       add(txt2);
        
       add(bt1);
       add(bt2);
       add(bt3);
       add(bt4);
        
       add(snc);
       add(sonuc);
        
      
        
       bt1.addActionListener(this);
       bt2.addActionListener(this);
       bt3.addActionListener(this);
       bt4.addActionListener(this);
       
       //Butonlara actionlistener özelliği ekledik
       //Yani butona tıkladığımızda bir sonuç alacağız
 
        
       setVisible(true);
    }
    
public void actionPerformed(ActionEvent e)
{
int sayi1 = Integer.parseInt(txt1.getText());
int sayi2 = Integer.parseInt(txt2.getText());

//getText() fonksiyonu ile textField' a yazılanları String formatında aldık.
//Integer.parseInt ile stringi integer formatına çevirdik.

String a = e.getActionCommand();

if(a.equals("+"))
{
    int x1=sayi1+sayi2;
    sonuc.setText(String.valueOf(x1));
}

if(a.equals("/"))
{
    double x2 = sayi1/sayi2;
    sonuc.setText(String.valueOf(x2));
}

if(a.equals("*"))
{
    int x3=sayi1*sayi2;
    sonuc.setText(String.valueOf(x3));
}

if(a.equals("-"))
{
    int x4=sayi1*sayi2;
    sonuc.setText(String.valueOf(x4));
}

//4 işlemi de tek fonksiyon kullanarak yapabiliriz.

}

    
    public static void main(String[] args) {
        
     HesapMakinesiGUI hesapm = new HesapMakinesiGUI();
     
    }
}
