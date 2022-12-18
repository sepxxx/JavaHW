package project;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


import javax.swing.*;
import java.awt.*;

public class SwingProj {

    static class MyFrame extends JFrame {


        int al_width = (int)(1920);
        int al_height = (int)(1080);
        int site_width = (int)(1100);
        int up_ban_height = (int)(420*0.8);
        int up_ban_width = (int)(site_width*0.8);
        int menu_footer_height = (int)(up_ban_height*0.2);
        int dm_ban_comps_height = (int)((al_height - 2*menu_footer_height - up_ban_height)/2*0.8);
        JPanel all_comp = new JPanel();
        JPanel up_ban = new JPanel();
        JPanel dn_ban = new JPanel();
        JPanel dn_ban_1 = new JPanel();
        JPanel dn_ban_2 = new JPanel();
        JPanel menu = new JPanel();
        JLabel jl_g2 = new JLabel();
        JLabel jl_g3 = new JLabel();
        JLabel jl_g4 = new JLabel();


        JPanel up_ban_disc = new JPanel();
        JPanel dn_ban_disc = new JPanel();

        JPanel up_ban_prod = new JPanel();
        JPanel dn_ban_prod = new JPanel();
        JPanel up_ban_buy = new JPanel();
        JPanel dn_ban_buy = new JPanel();
        JPanel dn_ban_buy_1 = new JPanel();
        JPanel dn_ban_buy_2 = new JPanel();

        JPanel up_ban_rec = new JPanel();
        JPanel dn_ban_rec = new JPanel();
        JPanel dn_ban_rec_1 = new JPanel();
        JPanel dn_ban_rec_2 = new JPanel();
        JPanel dn_ban_rec_ds_1 = new JPanel();
        JLabel jl_r1 = new JLabel();

        JPanel dn_ban_rec_ds_2 = new JPanel();
        JLabel jl_r2 = new JLabel();
        JPanel dn_ban_rec_ds_3 = new JPanel();
        JLabel jl_r3 = new JLabel();
        JPanel dn_ban_rec_ds_4 = new JPanel();
        JLabel jl_r4 = new JLabel();
        JPanel dn_ban_rec_ds_5 = new JPanel();
        JLabel jl_r5 = new JLabel();
        JPanel dn_ban_rec_ds_6 = new JPanel();
        JLabel jl_r6 = new JLabel();
        JPanel dn_ban_rec_ds_7 = new JPanel();
        JLabel jl_r7 = new JLabel();
        JPanel dn_ban_rec_ds_8 = new JPanel();
        JLabel jl_r8 = new JLabel();
        JPanel up_ban_facts = new JPanel();
        JPanel dn_ban_facts = new JPanel();
        JPanel dn_ban_facts_1 = new JPanel();
        JPanel dn_ban_facts_1d = new JPanel();
        JPanel dn_ban_facts_2 = new JPanel();
        JPanel dn_ban_facts_2d = new JPanel();
        JPanel dn_ban_facts_3 = new JPanel();
        JPanel dn_ban_facts_3d = new JPanel();
        JPanel dn_ban_facts_4 = new JPanel();
        JPanel dn_ban_facts_4d = new JPanel();
        JLabel jl_f1 = new JLabel();
        JLabel jl_f2 = new JLabel();
        JLabel jl_f3 = new JLabel();
        JLabel jl_f4 = new JLabel();
        JLabel jl_f1d = new JLabel();
        JLabel jl_f2d = new JLabel();
        JLabel jl_f3d = new JLabel();
        JLabel jl_f4d = new JLabel();

        JButton b_glav = new JButton();
        JButton b_disc = new JButton();
        JButton b_prod = new JButton();
        JButton b_buy = new JButton();
        JButton b_recipe = new JButton();
        JButton b_facts = new JButton();
        public MyFrame() throws IOException {
            setTitle("OREO COMPANY");
            setSize(al_width, al_height);
            setDefaultCloseOperation( EXIT_ON_CLOSE );

            //СТРАНИЦА ГЛАВНАЯ
            menu.setBackground(new Color(9,171,228));
            menu.setLayout(new FlowLayout());
            menu.setSize(site_width, menu_footer_height);
            add_img_to_panel("src/project/imgs/logo.png",123,50,menu);
            menu.add(new JLabel("                                 "));
            add_btn_to_panel("  ГЛАВНАЯ ", menu, b_glav);
            add_btn_to_panel("  АКЦИИ ", menu,b_disc);
            add_btn_to_panel("  ПРОДУКТ ", menu, b_prod);
            add_btn_to_panel("  ГДЕ КУПИТЬ ", menu, b_buy);
            add_btn_to_panel("  РЕЦЕПТЫ ", menu, b_recipe);
            add_btn_to_panel("  ФАКТЫ ", menu, b_facts);
            menu.add(new JLabel("                         "));
            add_img_to_panel("src/project/imgs/vk.png",30,30,menu);
            menu.add(new JLabel("    "));
            add_img_to_panel("src/project/imgs/main-banner.jpg",site_width, up_ban_height, up_ban);
            dn_ban.setLayout(new GridLayout(2, 1, 0, 0));
            dn_ban_1.setLayout(new FlowLayout());
            dn_ban_2.setLayout(new FlowLayout());
            add_img_to_panel("src/project/imgs/banner-bg-2.jpg",site_width/2,dm_ban_comps_height, dn_ban_1);
            add_img_to_panel("src/project/imgs/banner-1-bg.jpg",site_width/2,dm_ban_comps_height, dn_ban_1, jl_g2);
            add_img_to_panel("src/project/imgs/banner-bg-3.jpg",site_width/4,dm_ban_comps_height, dn_ban_2, jl_g3);
            add_img_to_panel("src/project/imgs/banner-bg-4.jpg",site_width/2,dm_ban_comps_height, dn_ban_2, jl_g4);
            add_img_to_panel("src/project/imgs/banner-bg-5.jpg",site_width/4,dm_ban_comps_height, dn_ban_2);
            jl_g2.addMouseListener(ma);
            jl_g3.addMouseListener(ma);
            jl_g4.addMouseListener(ma);
            dn_ban.add(dn_ban_1);
            dn_ban.add(dn_ban_2);
            //СТРАНИЦА С АКЦИЯМИ
            add_img_to_panel("src/project/imgs/hero.png",site_width, up_ban_height, up_ban_disc);
            dn_ban_disc.setLayout(new FlowLayout());
            add_img_to_panel("src/project/imgs/cashback-1.png",site_width/3, up_ban_height, dn_ban_disc);
            add_img_to_panel("src/project/imgs/cashback-2.png",site_width/3, up_ban_height, dn_ban_disc);
            add_img_to_panel("src/project/imgs/cashback-3.png",site_width/3, up_ban_height, dn_ban_disc);
            //СТРАНИЦА С ПРОДУКТАМИ
            dn_ban_prod.setLayout(new GridLayout(2,4,17,17));
            int width_for_prods = (int)(site_width*0.95);
            int height_for_prods = (int)(up_ban_height * 0.7);
            add_img_to_panel("src/project/imgs/prod-bg.gif", site_width, up_ban_height, up_ban_prod);
            add_img_to_panel("src/project/imgs/p1.jpg", width_for_prods/4, height_for_prods, dn_ban_prod);
            add_img_to_panel("src/project/imgs/p2.jpg", width_for_prods/4, height_for_prods, dn_ban_prod);
            add_img_to_panel("src/project/imgs/p3.jpg", width_for_prods/4, height_for_prods, dn_ban_prod);
            add_img_to_panel("src/project/imgs/p4.jpg", width_for_prods/4, height_for_prods, dn_ban_prod);
            add_img_to_panel("src/project/imgs/p5.jpg", width_for_prods/4, height_for_prods, dn_ban_prod);
            add_img_to_panel("src/project/imgs/p6.jpg", width_for_prods/4, height_for_prods, dn_ban_prod);
            add_img_to_panel("src/project/imgs/p7.jpg", width_for_prods/4, height_for_prods, dn_ban_prod);
            add_img_to_panel("src/project/imgs/p8.jpg", width_for_prods/4, height_for_prods, dn_ban_prod);
            //СТРАНИЦА ГДЕ КУПИТЬ
            dn_ban_buy.setLayout(new GridLayout(2,1,0,0));
            dn_ban_buy_1.setLayout(new FlowLayout(0,20,20));
            dn_ban_buy_2.setLayout(new FlowLayout(0,20,20));
            int width_for_buy = (int)(site_width*0.95);
            int height_for_buy = (int)(up_ban_height * 0.7);
            add_img_to_panel("src/project/imgs/buy-main.jpg", site_width, up_ban_height, up_ban_buy);
            add_img_to_panel("src/project/imgs/b1.jpg", width_for_buy/4, height_for_buy, dn_ban_buy_1);
            add_img_to_panel("src/project/imgs/b2.jpg", width_for_buy/4, height_for_buy, dn_ban_buy_1);
            add_img_to_panel("src/project/imgs/b3.jpg", width_for_buy/4, height_for_buy, dn_ban_buy_1);
            add_img_to_panel("src/project/imgs/b4.jpg", width_for_buy/4, height_for_buy, dn_ban_buy_1);
            add_img_to_panel("src/project/imgs/b5.jpg", width_for_buy/4, height_for_buy, dn_ban_buy_2);
            add_img_to_panel("src/project/imgs/b6.jpg", width_for_buy/4, height_for_buy, dn_ban_buy_2);
            add_img_to_panel("src/project/imgs/b7.jpg", width_for_buy/4, height_for_buy, dn_ban_buy_2);
            add_img_to_panel("src/project/imgs/b8.jpg", width_for_buy/4, height_for_buy, dn_ban_buy_2);
            dn_ban_buy.add(dn_ban_buy_1);
            dn_ban_buy.add(dn_ban_buy_2);
            //СТРАНИЦА РЕЦЕПТЫ
            add_img_to_panel("src/project/imgs/main-banner.jpg",site_width, up_ban_height, up_ban_rec);
            dn_ban_rec.setLayout(new GridLayout(2,1,0,0));
            dn_ban_rec_1.setLayout(new FlowLayout(0,20,20));
            dn_ban_rec_2.setLayout(new FlowLayout(0,20,20));
            int width_for_rec = (int)(site_width*0.95);
            int height_for_rec = (int)(up_ban_height * 0.7);
            add_img_to_panel("src/project/imgs/r1.jpg", width_for_rec/4, height_for_rec, dn_ban_rec_1, jl_r1);
            add_img_to_panel("src/project/imgs/rd1.jpg", site_width, height_for_rec, dn_ban_rec_ds_1);
            add_img_to_panel("src/project/imgs/r2.jpg", width_for_rec/4, height_for_rec, dn_ban_rec_1, jl_r2);
            add_img_to_panel("src/project/imgs/rd2.jpg", site_width, height_for_rec, dn_ban_rec_ds_2);
            add_img_to_panel("src/project/imgs/r3.jpg", width_for_rec/4, height_for_rec, dn_ban_rec_1, jl_r3);
            add_img_to_panel("src/project/imgs/rd3.jpg", site_width, height_for_rec, dn_ban_rec_ds_3);
            add_img_to_panel("src/project/imgs/r4.jpg", width_for_rec/4, height_for_rec, dn_ban_rec_1, jl_r4);
            add_img_to_panel("src/project/imgs/rd4.jpg", site_width, height_for_rec, dn_ban_rec_ds_4);
            add_img_to_panel("src/project/imgs/r5.jpg", width_for_rec/4, height_for_rec, dn_ban_rec_2, jl_r5);
            add_img_to_panel("src/project/imgs/rd5.jpg", site_width, height_for_rec, dn_ban_rec_ds_5);
            add_img_to_panel("src/project/imgs/r6.jpg", width_for_rec/4, height_for_rec, dn_ban_rec_2, jl_r6);
            add_img_to_panel("src/project/imgs/rd6.jpg", site_width, height_for_rec, dn_ban_rec_ds_6);
            add_img_to_panel("src/project/imgs/r7.jpg", width_for_rec/4, height_for_rec, dn_ban_rec_2, jl_r7);
            add_img_to_panel("src/project/imgs/rd7.jpg", site_width, height_for_rec, dn_ban_rec_ds_7);
            add_img_to_panel("src/project/imgs/r8.jpg", width_for_rec/4, height_for_rec, dn_ban_rec_2, jl_r8);
            add_img_to_panel("src/project/imgs/rd8.jpg", site_width, height_for_rec, dn_ban_rec_ds_8);
            jl_r1.addMouseListener(ma);
            jl_r2.addMouseListener(ma);
            jl_r3.addMouseListener(ma);
            jl_r4.addMouseListener(ma);
            jl_r5.addMouseListener(ma);
            jl_r6.addMouseListener(ma);
            jl_r7.addMouseListener(ma);
            jl_r8.addMouseListener(ma);
            dn_ban_rec.add(dn_ban_rec_1);
            dn_ban_rec.add(dn_ban_rec_2);

            //СТРАНИЦА С ФАКТАМИ
            add_img_to_panel("src/project/imgs/main-facts.png",site_width, up_ban_height, up_ban_facts);
            dn_ban_facts.setLayout(new GridLayout(2, 2, 0, 0));
            add_img_to_panel("src/project/imgs/f1.png",site_width/2,dm_ban_comps_height, dn_ban_facts_1,jl_f1);
            add_img_to_panel("src/project/imgs/f1d.png",site_width/2,dm_ban_comps_height, dn_ban_facts_1d,jl_f1d);
            add_img_to_panel("src/project/imgs/f2.png",site_width/2,dm_ban_comps_height, dn_ban_facts_2,jl_f2);
            add_img_to_panel("src/project/imgs/f2d.png",site_width/2,dm_ban_comps_height, dn_ban_facts_2d,jl_f2d);
            add_img_to_panel("src/project/imgs/f3.png",site_width/2,dm_ban_comps_height, dn_ban_facts_3, jl_f3);
            add_img_to_panel("src/project/imgs/f3d.png",site_width/2,dm_ban_comps_height, dn_ban_facts_3d, jl_f3d);
            add_img_to_panel("src/project/imgs/f4.png",site_width/2,dm_ban_comps_height, dn_ban_facts_4, jl_f4);
            add_img_to_panel("src/project/imgs/f4d.png",site_width/2,dm_ban_comps_height, dn_ban_facts_4d, jl_f4d);
            jl_f1.addMouseListener(ma);
            jl_f2.addMouseListener(ma);
            jl_f3.addMouseListener(ma);
            jl_f4.addMouseListener(ma);
            jl_f1d.addMouseListener(ma);
            jl_f2d.addMouseListener(ma);
            jl_f3d.addMouseListener(ma);
            jl_f4d.addMouseListener(ma);
            dn_ban_facts.add(dn_ban_facts_1);
            dn_ban_facts.add(dn_ban_facts_2);
            dn_ban_facts.add(dn_ban_facts_3);
            dn_ban_facts.add(dn_ban_facts_4);

            //размещаем все в общей панели а саму панель во фрейм
            all_comp.add(menu);
            all_comp.add(up_ban);
            all_comp.add(dn_ban);
            getContentPane().add(all_comp);
            setVisible(true);
        }

        public void add_img_to_panel(String pathname, int width, int height, JPanel panel) throws IOException {
            BufferedImage bufferedImage = ImageIO.read(new File(pathname));
            Image image = bufferedImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            JLabel jl = new JLabel(new ImageIcon(image));
            //jl.addMouseListener(ML);
            panel.add(jl);
        }
        public void add_img_to_panel(String pathname, int width, int height, JPanel panel, JLabel jl) throws IOException {
            BufferedImage bufferedImage = ImageIO.read(new File(pathname));
            Image image = bufferedImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            jl.setIcon(new ImageIcon(image));
            //JLabel jl = new JLabel(new ImageIcon(image));
            panel.add(jl);
        }
        public void add_btn_to_panel(String txt,  JPanel panel,  JButton b) {
            b.setText(txt);
            b.setBorderPainted(false);
            b.setFocusPainted(false);
            b.setContentAreaFilled(false);
            b.setFont(new Font("Roboto", Font.BOLD, 15));
            b.setForeground(Color.WHITE);
            b.addActionListener(new CustomActionListener());
            panel.add(b);
        }

        void change_page(JPanel p1, JPanel p2) {
            all_comp.removeAll();
            all_comp.add(menu);
            all_comp.add(p1);
            all_comp.add(p2);
            all_comp.revalidate();
            all_comp.repaint();
        }
        class CustomActionListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b_glav) {
                    change_page(up_ban, dn_ban);
                }else if (e.getSource() == b_disc) {
                    change_page(up_ban_disc, dn_ban_disc);
                } else if (e.getSource() == b_prod) {
                    change_page(up_ban_prod, dn_ban_prod);
                } else if (e.getSource() == b_buy) {
                    change_page(up_ban_buy, dn_ban_buy);
                }else if (e.getSource() == b_recipe) {
                    change_page(up_ban_rec, dn_ban_rec);
                }else if (e.getSource() == b_facts) {
                    change_page(up_ban_facts, dn_ban_facts);
                }
            }

        }
        public void change_fact(JPanel p1, JPanel p2, JPanel p3, JPanel p4) {
            dn_ban_facts.removeAll();
            dn_ban_facts.add(p1);
            dn_ban_facts.add(p2);
            dn_ban_facts.add(p3);
            dn_ban_facts.add(p4);
            dn_ban_facts.revalidate();
            dn_ban_facts.repaint();
        }


        int act = 0; // отслеживает статус открытия - закрытия для всех
        int last_act = 0; // когда открыть рецепт, другие открывать и закрывать нельзя
        void open_rec(JPanel p1, JPanel p2, int plast_act, int pact){
            dn_ban_rec.remove(p1);
            dn_ban_rec.add(p2);
            all_comp.revalidate();
            all_comp.repaint();
            act = pact;
            last_act = plast_act;
        }
        void close_rec(JPanel p1, JPanel p2, int plast_act, int pact){
            dn_ban_rec.remove(p1);
            dn_ban_rec.add(p2);
            all_comp.removeAll();
            all_comp.add(menu);
            all_comp.add(up_ban_rec);
            all_comp.add(dn_ban_rec);
            all_comp.revalidate();
            all_comp.repaint();
            act = plast_act;
            last_act = pact;
        }
        MouseAdapter ma = new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == jl_r1 && (last_act == 0 || last_act == 1)) {
                    if (act == 0)
                        open_rec(dn_ban_rec_2, dn_ban_rec_ds_1, 1, 1);
                    else
                        close_rec(dn_ban_rec_ds_1, dn_ban_rec_2, 0, 0);
                } else if (e.getSource() == jl_r2&& (last_act == 0 || last_act == 2)) {
                    if (act == 0)
                        open_rec(dn_ban_rec_2, dn_ban_rec_ds_2, 2, 1);
                    else
                        open_rec(dn_ban_rec_ds_2, dn_ban_rec_2, 0, 0);
                } else if (e.getSource() == jl_r3&& (last_act == 0 || last_act == 3)) {
                    if (act == 0)
                        open_rec(dn_ban_rec_2, dn_ban_rec_ds_3, 3, 1);
                    else
                        open_rec(dn_ban_rec_ds_3, dn_ban_rec_2, 0, 0);
                } else if (e.getSource() == jl_r4&& (last_act == 0 || last_act == 4)) {
                    if (act == 0)
                        open_rec(dn_ban_rec_2, dn_ban_rec_ds_4, 4, 1);
                    else
                        open_rec(dn_ban_rec_ds_4, dn_ban_rec_2, 0, 0);
                } else if (e.getSource() == jl_r5&& (last_act == 0 || last_act == 5)) {
                    if (act == 0)
                        open_rec(dn_ban_rec_1, dn_ban_rec_ds_5, 5, 1);
                    else
                        open_rec(dn_ban_rec_ds_5, dn_ban_rec_1, 0, 0);
                } else if (e.getSource() == jl_r6&& (last_act == 0 || last_act == 6)) {
                    if (act == 0)
                        open_rec(dn_ban_rec_1, dn_ban_rec_ds_6, 6, 1);
                    else
                        open_rec(dn_ban_rec_ds_6, dn_ban_rec_1, 0, 0);
                } else if (e.getSource() == jl_r7&& (last_act == 0 || last_act == 7)) {
                    if (act == 0)
                        open_rec(dn_ban_rec_1, dn_ban_rec_ds_7, 7, 1);
                    else
                        open_rec(dn_ban_rec_ds_7, dn_ban_rec_1, 0, 0);
                } else if (e.getSource() == jl_r8&& (last_act == 0 || last_act == 8)) {
                    if (act == 0)
                        open_rec(dn_ban_rec_1, dn_ban_rec_ds_8, 8, 1);
                    else
                        open_rec(dn_ban_rec_ds_8, dn_ban_rec_1, 0, 0);
                } else if (e.getSource() == jl_f1) {
                    change_fact(dn_ban_facts_1d, dn_ban_facts_2, dn_ban_facts_3, dn_ban_facts_4);
                } else if (e.getSource() == jl_f1d) {
                    change_fact(dn_ban_facts_1, dn_ban_facts_2, dn_ban_facts_3, dn_ban_facts_4);
                } else if (e.getSource() == jl_f2) {
                    change_fact(dn_ban_facts_1, dn_ban_facts_2d, dn_ban_facts_3, dn_ban_facts_4);
                } else if (e.getSource() == jl_f2d) {
                    change_fact(dn_ban_facts_1, dn_ban_facts_2, dn_ban_facts_3, dn_ban_facts_4);
                } else if (e.getSource() == jl_f3) {
                    change_fact(dn_ban_facts_1, dn_ban_facts_2, dn_ban_facts_3d, dn_ban_facts_4);
                } else if (e.getSource() == jl_f3d) {
                    change_fact(dn_ban_facts_1, dn_ban_facts_2, dn_ban_facts_3, dn_ban_facts_4);
                } else if (e.getSource() == jl_f4) {
                    change_fact(dn_ban_facts_1, dn_ban_facts_2, dn_ban_facts_3, dn_ban_facts_4d);
                } else if (e.getSource() == jl_f4d) {
                    change_fact(dn_ban_facts_1, dn_ban_facts_2, dn_ban_facts_3, dn_ban_facts_4);
                }  else if (e.getSource() == jl_g2) {
                    change_page(up_ban_prod, dn_ban_prod);
                } else if (e.getSource() == jl_g3) {
                    change_page(up_ban_facts, dn_ban_facts);
                } else if (e.getSource() == jl_g4) {
                    change_page(up_ban_buy, dn_ban_buy);
                }
            }};
    }

    public static void main(String[] args) throws IOException {
        MyFrame mf = new MyFrame();
    }
}