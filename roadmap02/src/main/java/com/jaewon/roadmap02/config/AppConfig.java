package com.jaewon.roadmap02.config;

import com.jaewon.roadmap02.discount.DiscountPolicy;
import com.jaewon.roadmap02.discount.RateDiscountPolicy;
import com.jaewon.roadmap02.member.MemberRepository;
import com.jaewon.roadmap02.member.MemberService;
import com.jaewon.roadmap02.member.MemberServiceImpl;
import com.jaewon.roadmap02.member.MemoryMemberRepository;
import com.jaewon.roadmap02.order.OrderService;
import com.jaewon.roadmap02.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        //1번
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        //1번
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        //2번? 3번?
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
//        return new FixDiscountPolicy();
    }
}