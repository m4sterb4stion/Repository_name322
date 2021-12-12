# -- coding: utf-8 --

y=input('ввод двух слов:')

p=int(y.find(' '))+1
o=int(len(y))

print(str(y[p:o])+str(' ')+str(y[:p]))
