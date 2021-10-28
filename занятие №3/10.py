# -- coding: utf-8 --
def x():
    N = int(input(''))
    K = int(input(''))
    a = 0
    b = 1
    s = 0
    if K < 3:
        s += 1
    for i in range(2, N):
        num = a + b
        a, b = b, num
        if i >= (K-1):
            s += num
    print(s)
x()