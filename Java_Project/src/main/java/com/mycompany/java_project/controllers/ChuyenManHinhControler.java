/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_project.controllers;

import com.mycompany.java_project.models.DanhMucBean;
import form_Project.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class ChuyenManHinhControler {
    private JPanel root;
    private String kinSelected = "";
    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhControler(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
//    public void setView(JPanel jpnItem, JLabel jlbItem){
//        kinSelected = "NhanVien";
//        jpnItem.setBackground(new Color(96,100,191));
//        jlbItem.setBackground(new Color(96,100,191));
//        root.removeAll();
//        root.setLayout(new BorderLayout());
//        root.add(new pnNhanVien());
//        root.validate();
//        root.repaint();
//    }
    
    public void setEvent(List<DanhMucBean> listItem){
        this.listItem = listItem;
        for(DanhMucBean item : listItem){
            item.getJlb().addMouseListener( new LabelEvent(item.getKind(), item.getJpn(),item.getJlb()));
        }
    }
    class LabelEvent implements MouseListener{
        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        
        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind){
                case "NhanVien":
                    node = new pnNhanVien();
                    break;
                case "SanPham":
                    node = new pnSanPham();
                    break;
                case "HoaDon":
                    node = new pnHoaDon();
                    break;
                case "GioiThieu":
                    node = new pnGioiThieu();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackgroud(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kinSelected = kind;
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));

        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));

        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kinSelected.equalsIgnoreCase(kind)){
                jpnItem.setBackground(new Color(76,175,80));
                jlbItem.setBackground(new Color(76,175,80));
            }
        }
        private void setChangeBackgroud(String kind){
            for (DanhMucBean item : listItem) {
                if (item.getKind().equalsIgnoreCase(kind)){
                    item.getJlb().setBackground(new Color(96,100,191));
                    item.getJpn().setBackground(new Color(96,100,191));
                }else{
                    item.getJlb().setBackground(new Color(76,175,80));
                    item.getJpn().setBackground(new Color(76,175,80));                    
                }
            }
        }
        
    }
}
