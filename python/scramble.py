#Hornyak Laszlo

def scramble(text):

    """
    >>> scramble("The highway provides a route across several spurs of the Peninsular Ranges, linking the Los Angeles Basin with the Pomona Valley and San Gabriel Valley.")
    'The hawhgiy pedivors a rtuoe asorcs sarevel srups of the Palusniner Regnas, lniknig the Los Aelegns Bisan wtih the Pnomoa Vellay and San Geirbal Vellay.'
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

if __name__ == "__main__":
    import doctest
    doctest.testmod()
