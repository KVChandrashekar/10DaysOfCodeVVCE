import math
import os
import random
import re
import sys

def rotLeft(a, d):
    d = d%len(a)
    a = a[d:]+a[:d]
    return a

n,d = map(int,input().split())
a = list(map(int,input().split()))
print(*rotLeft(a, d))
