/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.mvc.model;

import java.awt.HeadlessException;

/**
 *
 * @author TOSHIBA
 */
public class ItemModel extends javax.swing.JFrame {

   private String Itemcode;
    private String description;
    private String  packsize;
    private Double unitprice;
  
    private Integer qoh;

    public ItemModel(String Itemcode, String description, String packsize, Double unitprice, Integer qoh) throws HeadlessException {
        this.Itemcode = Itemcode;
        this.description = description;
        this.packsize = packsize;
        this.unitprice = unitprice;
        this.qoh = qoh;
    }
    
    
    
   
    public ItemModel() {
        
    }

    @Override
    public String toString() {
        return "ItemModel{" + "Itemcode=" + Itemcode + ", description=" + description + ", packsize=" + packsize + ", unitprice=" + unitprice + ", qoh=" + qoh + '}';
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @return the Itemcode
     */
    public String getItemcode() {
        return Itemcode;
    }

    /**
     * @param Itemcode the Itemcode to set
     */
    public void setItemcode(String Itemcode) {
        this.Itemcode = Itemcode;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the packsize
     */
    public String getPacksize() {
        return packsize;
    }

    /**
     * @param packsize the packsize to set
     */
    public void setPacksize(String packsize) {
        this.packsize = packsize;
    }

    /**
     * @return the unitprice
     */
    public Double getUnitprice() {
        return unitprice;
    }

    /**
     * @param unitprice the unitprice to set
     */
    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    /**
     * @return the qoh
     */
    public Integer getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(Integer qoh) {
        this.qoh = qoh;
    }

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
