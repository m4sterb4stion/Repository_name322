# -- coding: utf-8 --

y=input('введите строку с минимум двумя h:')

p=y.find('h')
o=y.rfind('h')

print(y[:p] + y[o+1:])
