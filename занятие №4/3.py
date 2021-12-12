# -- coding: utf-8 --

y=input('ввод строки:')

p=int(len(y))
o=int(len(y))//2+1

print(str(y[o:p])+str(y[:o]))
