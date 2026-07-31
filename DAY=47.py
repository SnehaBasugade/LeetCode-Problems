class Solution:
    def fullJustify(self, words, maxWidth):
        temp_string = words[0] # temporary sentance
        temp = [] # temporary array not justified
        for i in range(1, len(words)) :
            if len(words[i]) + len(temp_string) + 1 > maxWidth : # maxWidth exceeded
                temp.append(temp_string)
                temp_string = words[i] # new sentance
                continue
            temp_string = temp_string + " " + words[i]
        if temp_string :
            temp.append(temp_string)

        finalRes = []

        for i in range(len(temp)) :
            t = temp[i]
            if len(t) == maxWidth : # perfect fit
                finalRes.append(t)
                continue

            ws = t.split()
            numSpaces = maxWidth - sum(len(w) for w in ws) # spaces to be added

            if i == len(temp) - 1 : # last sentance left-justified
                t += " " * (numSpaces - len(ws) + 1)
                finalRes.append(t)
                break

            if len(ws) == 1 :
                ws[0] += " " * numSpaces
            else :
                space_btw_words = numSpaces // (len(ws)-1)
                extra_spaces = numSpaces % (len(ws)-1)

                for i in range(len(ws) - 1) :
                    ws[i] += " " * (space_btw_words + (1 if i < extra_spaces else 0))

            finalRes.append("".join(ws))
        return finalRes
          