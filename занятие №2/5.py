# -*- coding: utf-8 -*-

a=int(input())
b=int(input())
c=int(input())
if (a<c) and (a<b):
    print(a)
elif (c<a) and (c<b):
    print(c)
else:
    print(b)