# -*- coding: utf-8 -*-
"""from functools import reduce

def soma(x, y):
    return x + y

def media(lista, tam):
    media = reduce(soma, lista)
    return media / tam

meu jeito de fazer a media"""
#vai calcular a média, moda e mediana

"""usando uma biblioteca padrão do python:
from statistics import * (* quer dizer que vai importar tudo)
mean(lista) -> média
median(lista) -> mediana
mode(lista) -> moda
"""
def media(lista):
    media = sum(lista)/float(len(lista))
    return media

def mediana(lista):
    lista_ordenada = sorted(lista)
    tam = len(lista_ordenada)

    if tam % 2 == 0:
        mediana = (lista_ordenada[int(tam/2)] + lista_ordenada[int(tam/2)-1])/2
    else:
        mediana = lista_ordenada[int(tam/2)]

    return mediana

def moda(lista):
    lista_dic = {}
    for l in lista:
        if l not in lista_dic:
            lista_dic[l] = 1
        else:
            lista_dic[l] += 1

    maior_repeticao = max(lista_dic.values())
    for i in lista_dic:
        if lista_dic[i] == maior_repeticao:
            return i