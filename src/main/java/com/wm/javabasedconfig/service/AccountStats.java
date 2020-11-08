package com.wm.javabasedconfig.service;

import java.util.Arrays;
import org.springframework.stereotype.Component;

@Component
public class AccountStats {

  public int mean(int[] nums) {
    return Arrays.stream(nums).sum() / nums.length;
  }

  public int median(int[] nums) {
    int mid = nums.length / 2;
    if (nums.length % 2 == 0) {
      return (nums[mid - 1] + nums[mid]) / 2;
    } else {
      return nums[mid];
    }
  }

}
