package com.p1casso.member.feign;


import com.p1casso.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public interface MemberFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
