/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorderelatorios;

/**
 *
 * @author Vitor Peçanha
 */
public interface Ordenacao{
    boolean teste(Produto p1, Produto p2);
}

class Preco_Cresc implements Ordenacao{
    public boolean teste(Produto p1, Produto p2){
        return p1.getPreco() < p2.getPreco();
    }
}

class Estoque_Cresc implements Ordenacao{
    public boolean teste(Produto p1, Produto p2){
        return p1.getQtdEstoque() < p2.getQtdEstoque();
    }
}

class Descri_Cresc implements Ordenacao{
    public boolean teste(Produto p1, Produto p2){
        return p1.getDescricao().compareToIgnoreCase(p2.getDescricao()) < 0;
    }
}

class Preco_Decresc implements Ordenacao{
    public boolean teste(Produto p1, Produto p2){
        return p1.getPreco() > p2.getPreco();
    }
}

class Estoque_Decresc implements Ordenacao{
    public boolean teste(Produto p1, Produto p2){
        return p1.getQtdEstoque() > p2.getQtdEstoque();
    }
}

class Descri_Decresc implements Ordenacao{
    public boolean teste(Produto p1, Produto p2){
        return p1.getDescricao().compareToIgnoreCase(p2.getDescricao()) > 0;
    }
}