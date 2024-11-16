/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;

import javax.swing.JOptionPane;

public class JavaApplication24 {

   public static void main(String[] args) {
        String priceInput = JOptionPane.showInputDialog("Enter the price of the product:");
        double price = Double.parseDouble(priceInput);

        double salesTax = price * 0.06;
        double totalPrice = price + salesTax;

        JOptionPane.showMessageDialog(null, "The total price of the product is: RM " + totalPrice);
    }
}