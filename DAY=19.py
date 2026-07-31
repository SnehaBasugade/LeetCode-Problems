class Solution(object):
    def isMatch(self, s, p):
        def itachi(i1, i2):
            if i2 < 0:
                if i1 < 0:
                    return True
                return False
            if p[i2] == '*':
                if itachi(i1, i2 - 2):
                    return True
                if i1 >= 0:
                    prev = p[i2 - 1]
                    match = False
                    if prev == '.':
                        match = True
                    else:
                        if s[i1] == prev:
                            match = True
                    if match:
                        if itachi(i1 - 1, i2):
                            return True
                return False
            else:
                if i1 < 0:
                    return False
                matched = False
                if p[i2] == '.':
                    matched = True
                else:
                    if s[i1] == p[i2]:
                        matched = True
                if not matched:
                    return False
                return itachi(i1 - 1, i2 - 1)

        return itachi(len(s) - 1, len(p) - 1)