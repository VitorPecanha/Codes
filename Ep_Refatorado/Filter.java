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
public interface Filter {

    boolean compara(Object argFiltro, Produto p);
}

class Todos implements Filter {

    public boolean compara(Object argFiltro, Produto p) {
        return true;
    }
}

class Menor_Igual implements Filter {

    public boolean compara(Object argFiltro, Produto p){
        if (p.getQtdEstoque() <= (Integer) argFiltro) {
            return true;
        }
        return false;
    }
}

class Cat_Igual implements Filter {

    public boolean compara(Object argFiltro, Produto p){
        if (p.getCategoria().equalsIgnoreCase((String) argFiltro)) {
            return true;
        }
        return false;
    }
}

class Substring implements Filter{
    
    public boolean compara(Object argFiltro, Produto p){
        if (p.getDescricao().contains((String) argFiltro)){
            return true;
        }
        return false;
    }
}

