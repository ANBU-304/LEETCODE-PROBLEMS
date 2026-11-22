class Solution(object):
    def checkString(self, s):
        """
        :type s: str
        :rtype: bool
        """
        # count=0
        # a=s[0]
        # for i in range(len(s)):
        #     if a!=s[i]:
        #         count+=1
        #         a=s[i]
        # if count<=1 or s[0]!='b' and s[-1]!=a:
        #     return True
        # return False
        for i in range(1,len(s)):
            if s[i-1]>s[i]:
                return False
        return True

        


        