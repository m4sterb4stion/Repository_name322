# -- coding: utf-8 --
def x():
    n = int(input(''))
    a = 0
    b = 1
    s = 1
    c = 0
    for i in range(2, n+1):
        s += c
        c = a + b
        a, b = b, c
    print(s)
x()