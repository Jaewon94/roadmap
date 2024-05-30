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
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
//        return new FixDiscountPolicy();
    }
}