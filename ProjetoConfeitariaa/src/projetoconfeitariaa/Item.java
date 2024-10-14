/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoconfeitariaa;


public class Item {
    
private String sabor;
private int quantidade;
private int valor;
private int contValor;

    Item() {
        
    }

    public Item(String sabor, int quantidade, int valor) {
        this.sabor = sabor;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getContValor() {
        return contValor;
    }

    public void setContValor(int contValor) {
        this.contValor = contValor;
    }

    public Item(String sabor, int quantidade) {
        this.sabor = sabor;
        this.quantidade = quantidade;
        
        
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

   

    public int CalculaItem(){
        int subtotal = 0;
        switch (contValor) {
           
            case 1: subtotal = 65; break;
            case 2: subtotal = 80; break;
            case 3: subtotal = 95; break;
            case 4: subtotal = 70; break;
            default:
                throw new AssertionError();
        
       
        }
         return valor = subtotal * this.getQuantidade();
    }
}
