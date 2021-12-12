#-- coding: utf-8 --

x=int(input('км:'))
y=int(input('км в день :'))

p=1
while x<y:
    x*=1.1
    p=p+1
print(p)