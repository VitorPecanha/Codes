# -*- coding: utf-8 -*-
# tem que ter um arquivo principal
import aleatorio as a
import media as m
#colocar "as ..." gera um apelido para o arquivo, para não ter que usar nomes muito grandes

lista = a.geraListaInteiro(10)
media = m.media(lista)
mediana = m.mediana(lista)
moda = m.moda(lista)

print("Minha lista: ", lista)
print("A média é: ", media)
print("A mediana é: ", mediana)
print("A moda é: ", moda)