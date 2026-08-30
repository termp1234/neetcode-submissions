class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        gap = len(s1)
        s1 = ''.join(sorted(s1))
        print(s1)

        for i in range(len(s2) - gap + 1):
            cur_string = s2[i : i + gap]
            cur_string = ''.join(sorted(cur_string))
            print(cur_string)
            if s1 == cur_string:
                return True
        
        return False