def isPalindrome(x: int) -> bool:
    org = x
    # First reverse the number
    mod = 0
    while x > 0:
        mod = x%10 + mod * 10
        x = x//10
    print(f"Palindrome of {mod} is")
    if mod == org:
        return True
    else:
        return False

print(isPalindrome(121))