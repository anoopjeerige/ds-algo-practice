def i_factor(n):
    results = []
    for k in range(1, n+1):
        if n % k == 0:
            results.append(k)
    return results

def g_factor(n):
    for k in range(1, n+1):
        if n % k == 0:
            yield k

def gen_better_factor(n):
    k = 1
    while k * k < n:
        if n % k == 0:
            yield k
            yield n // k
        k += 1
    if k * k == n:
        yield k

def gen_fibonacci(n):
    i, a, b = 0, 0, 1
    while i < n:
        yield a
        a, b = b, a + b
        i += 1
