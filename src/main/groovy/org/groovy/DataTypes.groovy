package org.groovy

Integer a = 10
println(a)
println a.class

def b = 10.25f
println b
println b.class

s = 'Hello'
println s

name="Aakash"
s="Hello ${name}"
println s

s = '''
All the power is within you.
You can do anything and everything
'''
println(s)

emailPattern = /([\w\.\-]+)@([\w\-]+)((\.(\w){2,3})+)/
print "test@gmail.com"==~emailPattern
println(emailPattern.class)


