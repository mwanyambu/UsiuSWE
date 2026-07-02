#Problem:
#Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
#You may assume that each input would have exactly one solution, and you may not use the same element twice.
#Return the answer in any order.

#from doctest import Example
#Example 1:
# Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: nums[0] + nums[1] = 2 + 7 = 9 
#Example 2:
#Input: nums = [3,2,4], target = 6 Output: [1,2] 

#Constraints:
#2 ≤ nums.length ≤ 10⁴
#-10⁹ ≤ nums[i] ≤ 10⁹
#-10⁹ ≤ target ≤ 10⁹


def sum_elements(nums, target):
    indices = {}
    for i, num in enumerate(nums):
        j = target - num
        if j in indices:
            return [indices[j], i]
        indices[num] = i
    
    return []

if __name__ == "__main__":
    print(sum_elements([2, 7, 11, 15], 9)) 
    print(sum_elements([3, 2, 4], 6))     
    print(sum_elements([2, 7, 9, 3, 5], 16))       