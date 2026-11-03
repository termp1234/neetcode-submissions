#include <unordered_map>
using namespace std;

class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {

        unordered_map<int, int> dic;

        for(int i = 0; i < nums.size(); i++){
            if (dic.count(nums[i])){
                return true;
            } else{
                dic[nums[i]] = 1;
            }
        }

        return false;
    }
};