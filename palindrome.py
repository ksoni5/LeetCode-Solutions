def isPalindrome(x: int) -> bool:
        rev = 0
        if x > 0:
            rev = int(str(x)[::-1])
        print(rev)
        return rev==x

if __name__ == "__main__":
    x = 12121
    isPalindrome(x)
