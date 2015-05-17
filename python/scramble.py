#Hornyak Laszlo
testText = "The highway provides a route across several spurs of the Peninsular Ranges, linking the Los Angeles Basin with the Pomona Valley and San Gabriel Valley."

def scramble(text):

    """
    >>> scramble("highway")
    hawhgiy
    """
        
    words = text.split()

    newText = ""

    for word in words:
        first = word[0:1]
        last = word[len(word)-1]
        mark = ""
        
        if last == ',' or last == '.' or last == '!' or last == '?':
            mark = word[len(word)-1]
            last = word[len(word)-2]
            center = word[1:len(word)-2]
        else:
            center = word[1:len(word)-1]
        
        centerList = list(center)
        reversedCenter = ""
        for char in reversed(centerList):
            reversedCenter += char
        if len(word) > 1:
            newText += first+reversedCenter+last+mark+" "
        else:
            newText += word+mark+" "
    return newText[0:len(newText)-1]

print("Original text:")
print(testText)
print(" ")
print("Result:")
print(scramble(testText))
print(" ")
print("Unit test:")

if __name__ == "__main__":
    import doctest
    doctest.testmod()

raw_input()
