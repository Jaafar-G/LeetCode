def isMatch(s: str, p: str):
    if p == ".*":
        return True
    if s == p:
        return True
    if p.__contains__("*"):
        starIndex = p.index("*")
        print(p[:starIndex])
        if s[:starIndex] == p[:starIndex]:
            if s[(len(s)-starIndex):] == (p[:starIndex] * (len(s)-starIndex)):
                return True

    if p.__contains__("."):
         for c in p(range):
             if c == ".":
                 s = s[p.index(c)+1:] 
                 p.replace(".", "")
                 print(s)
                 print(p)

             else:
                 s += c
            
             print(s)
             print(p)
             p.replace(".", "")
             return s == p


    return False

print(isMatch(s="aa.aaa..a..", p =".............."))
