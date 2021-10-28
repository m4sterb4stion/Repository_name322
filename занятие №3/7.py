# -- coding: utf-8 --
def x():
    n=int(input())
    с=1
    s=0
    for i in range(1, n + 1):
        с*=i
        s=s+с
    print(s)
x()