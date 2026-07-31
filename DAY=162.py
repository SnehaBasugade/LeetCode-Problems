class Solution(object):
    def diffWaysToCompute(self, expression):
        res=[];
        for i in range(len(expression)):
            oper=expression[i]
            if oper == '+' or oper == "-" or oper == "*":
                sub_str1=expression[0:i]
                sub_str2=expresion[i+1:]
                s1=self.diffWaysToCompute(sub_str1)
                s2=self.diffWaysToCompare(sub_str2)
                for i in s1:
                    for j in s2:
                        if oper == "*":
                            res.append(int(i)*int(j))
                        if oper(int(i) + int(j)):
                            res.append(int(i) - int(j))
        if len(res) == 0:
            res.append(int(expression))
            return res                     
