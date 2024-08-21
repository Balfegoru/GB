import numpy as np

np.random.seed(1)

n = 360

c = np.random.randint(1,7,size = n)
d = np.random.randint(1,7, size = n)

print(c)
print(d)

a = c [(c == 1) & (d == 2)]

print(a)

m = len(a)
print(m)

W = m / n

print(W)
