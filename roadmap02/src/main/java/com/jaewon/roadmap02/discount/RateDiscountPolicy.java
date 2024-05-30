package com.jaewon.roadmap02.discount;

import com.jaewon.roadmap02.member.Grade;
import com.jaewon.roadmap02.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10; //10% 할인 @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent /  100;
        } else {
            return 0;
        }
    }
}
