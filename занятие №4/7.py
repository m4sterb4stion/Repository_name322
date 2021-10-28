#-*- coding: utf-8 -*-
s = input("")
def x(s): 
    s = s[:s.find('h')] + s[s.rfind('h') + 1:]
    print(s)
x(s)