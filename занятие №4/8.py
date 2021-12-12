# -- coding: utf-8 --

y=input('введите строку с минимум двумя h')

p=y[:y.find('h')]
o=y[int(y.find('h')):
    int(y.rfind('h') + 1)]

i=y[y.rfind('h') + 1:]
u=(p + o[::-1] + i)

print(u)