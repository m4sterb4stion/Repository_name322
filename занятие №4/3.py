#-*- coding: utf-8 -*-
s = input("")
def x(s):
    a = (s[len(s) // 2:] + s[:len(s) // 2])
    print(a)
x(s)