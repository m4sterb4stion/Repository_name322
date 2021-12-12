# -- coding: utf-8 --
y=input('ввод строки:')

p=y.find('f')
o=y.rfind('f')

if p!=o:
    
    print('первая f:',p)
    print('последняя f:',o)
    
elif p==o:
    
    if o==o==-1:
        
        print('f не найдено')
    else:
        
        print('единственная f:',p)