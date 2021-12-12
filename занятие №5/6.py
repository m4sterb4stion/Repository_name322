# -- coding: utf-8 --
y=int(input('число:'))

p=0
o=0

while y!=0:
    
    p=p+1
    o=o+y
    y=int(input('число:'))
    
print(o/p)