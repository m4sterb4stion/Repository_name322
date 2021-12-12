# -- coding: utf-8 --
y=int(input('число:'))

o=0
p=0

while y!=0:
    if y>o:
        p=p+1
    o=y
    y=int(input('число:'))
    
print(p-1)