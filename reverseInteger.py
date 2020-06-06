# Naive method: Take mod to get all digits, then reverse.
def reverse_naive(x: int):
    sign = 1 if x>=0 else -1
    temp, x = 0, abs(x)
    while x:
        temp = ((temp*10) + (x%10))
        x //= 10
    temp = temp * sign
    print(temp)
    return temp if temp >= -2**31-1 and temp <= 2**31 else 0

# Fast method: Using python str <=> int conversion.
def reverse_smart(x: int):
    if x>=0:
        reversed = int(str(x)[::-1])
    if x<0:
        reversed = -int(str(-x)[::-1])
    print(reversed)
    return reversed if reversed >= -2**31-1 and reversed <= 2**31 else 0


if __name__ == "__main__":
    x = -8876654
    reverse_naive(x)                    
    # OR
    reverse_smart(x)

# Note: Unlike java, python's // operation is floor div, thus -1//10 returns -1 instead of 0. Thus need to keep a sign flag.