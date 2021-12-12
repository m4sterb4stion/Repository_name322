# -- coding: utf-8 --

y=input('ввод строки:')

if y.count('f')==1:print('-1')

elif y.count('f')<1:print('-2')

else:
    
    p=(y.find('f', y.find('f')+1))
    print(p)