package com.jaewon.roadmap02.order;

import com.jaewon.roadmap02.discount.DiscountPolicy;
import com.jaewon.roadmap02.discount.FixDiscountPolicy;
import com.jaewon.roadmap02.member.*;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}