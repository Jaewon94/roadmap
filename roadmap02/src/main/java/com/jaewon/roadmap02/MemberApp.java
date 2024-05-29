package com.jaewon.roadmap02;

import com.jaewon.roadmap02.member.Grade;
import com.jaewon.roadmap02.member.Member;
import com.jaewon.roadmap02.member.MemberService;
import com.jaewon.roadmap02.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
