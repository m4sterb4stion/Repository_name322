# -*- coding: utf-8 -*-
N=int(input('число факториала n='))
result=1

for i in range(1, N+1):
    result=result*i
    
print(result)   