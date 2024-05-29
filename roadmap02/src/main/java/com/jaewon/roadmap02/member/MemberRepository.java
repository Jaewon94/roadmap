package com.jaewon.roadmap02.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
