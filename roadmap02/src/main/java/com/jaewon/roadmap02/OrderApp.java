package com.jaewon.roadmap02;

import com.jaewon.roadmap02.member.Grade;
import com.jaewon.roadmap02.member.Member;
import com.jaewon.roadmap02.member.MemberService;
import com.jaewon.roadmap02.member.MemberServiceImpl;
import com.jaewon.roadmap02.order.Order;
import com.jaewon.roadmap02.order.OrderService;
import com.jaewon.roadmap02.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
    }
}
