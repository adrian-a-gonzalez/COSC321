sentence = input("Enter a sentence: ")

for i in range(len(sentence)):
    if (sentence[i] != ' '):
        print ('\tbipush' + " '" + sentence[i] + "'")
    else:
        print ('\tldc_w SPACE')
    print('\tout')