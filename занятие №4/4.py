#-*- coding: utf-8 -*-
s = input("")
def x(s):
    f = s[:s.find(' ')]
    sc = s[s.find(' ') + 1:]
    print(sc + ' ' + f)
x(s)