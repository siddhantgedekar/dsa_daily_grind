def mix(a, b):
    return a[0]+b[0]+a[len(a)//2]+b[len(b)//2]+a[-1]+b[-1]

s1 = "America"
s2 = "Japan"
print(mix(s1, s2))