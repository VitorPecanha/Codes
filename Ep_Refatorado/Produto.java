/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorderelatorios;

import java.text.NumberFormat;

/**
 *
 * @author Vitor Peçanha
 */
public interface Produto {

    public void setQtdEstoque(int qtdEstoque);
    public void setPreco(double preco);

    public int getId();
    public String getDescricao();
    public String getCategoria();
    public int getQtdEstoque();
    public double getPreco();

    public String formataParaImpressao();
}

abstract class Filtro implements Produto {

    protected Produto produto;
    protected static final String SEPARADOR = ", ";
    
    public void setQtdEstoque(int qtdEstoque) {
        produto.setQtdEstoque(qtdEstoque);
    }

    public void setPreco(double preco) {
        produto.setPreco(preco);
    }

    public int getId() {
        return produto.getId();
    }

    public String getDescricao() {
        return produto.getDescricao();
    }

    public String getCategoria() {
        return produto.getCategoria();
    }

    public int getQtdEstoque() {
        return produto.getQtdEstoque();
    }

    public double getPreco() {
        return produto.getPreco();
    }

    public String formataParaImpressao() {
        return produto.formataParaImpressao();
    }

}

class Negrito extends Filtro {

    public Negrito(Produto p) {
        produto = p;
    }
    
    public String formataParaImpressao() {

        return "<span style=\"font-weight:bold\">" + super.formataParaImpressao() + "</span>";
    }
}

class Italico extends Filtro{
    
    public Italico(Produto p){
        produto = p;
    }
    
    public String formataParaImpressao() {

        return "<span style=\"font-style:italic\">" + super.formataParaImpressao() + "</span>";
    }
}

class Red extends Filtro{
    public Red(Produto p){
        produto = p;
    }
    
    public String formataParaImpressao(){
        
        return "<font color=\"red\">" + super.formataParaImpressao() + "</font>";
    }
}

class Green extends Filtro{
    public Green(Produto p){
        produto = p;
    }
    
    public String formataParaImpressao(){
        
        return "<font color=\"green\">" + super.formataParaImpressao() + "</font>";
    }
}

class Blue extends Filtro{
    public Blue(Produto p){
        produto = p;
    }
    
    public String formataParaImpressao(){
        
        return "<font color=\"blue\">" + super.formataParaImpressao() + "</font>";
    }
}