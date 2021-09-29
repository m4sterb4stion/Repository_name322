# -*- coding: utf-8 -*-

seconds = int(input())
d=seconds//86400%24
h=seconds//3600%24
m=seconds//60%60
s=seconds%60
print(str(d)+':'+str(h)+':'+str(m)+':'+str(s))