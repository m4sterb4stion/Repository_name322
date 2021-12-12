# -*- coding: utf-8 -*-
n=int(input('количество слогаемых факториалов n='))
res=1
finalres=0


for i in range(1, n+1):
        res = res*i
        finalres=finalres+res
print(finalres)