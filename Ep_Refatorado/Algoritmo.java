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
public interface Algoritmo {

    void ordena(Produto[] p, int ini, int fim, Ordenacao ord);
}

class QuickSort implements Algoritmo {

    public int particiona(Produto[] p, int ini, int fim, Ordenacao ord){
        Produto x = p[ini];
        int i = ini + 1;
        int j = fim;
        while(i <= j){
            if(ord.teste(p[i], x)){
                i++;
            }
            else if(ord.teste(x, p[i])){
                j--;
            }
            else{
                Produto troca = p[i];
                p[i] = p[j];
                p[j] = troca;
                i++;
                j--;
            }
        }
        p[ini] = p[j];
        p[j] = x;
        return j;
    }
    
    public void ordena(Produto[] p, int ini, int fim, Ordenacao ord) {
        if (ini < fim) {

            int q = particiona(p, ini, fim, ord);

            ordena(p, ini, q, ord);
            ordena(p, q + 1, fim, ord);
        }
    }
}

class InsertionSort implements Algoritmo{
    public void ordena(Produto[] p, int ini, int fim, Ordenacao ord){
        for(int i = ini; i <= fim; i++){
            Produto x = p[i];
            int j = (i - 1);
            
            while(j >= ini){
                if(ord.teste(x, p[j])){
                    p[j+1] = p[j];
                    j--;
                }
                else break;
            }
            p[j + 1] = x;
        }
    }
}
