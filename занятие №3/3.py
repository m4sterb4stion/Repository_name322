# -*- coding: utf-8 -*-
print ("задайте значения для A и B, так чтобы A > B")

A=int(input('A='))
B=int(input('B='))

if A > B:
  for i in range(A, B - 1, -1):
    if i%2!=0:
      print(i)