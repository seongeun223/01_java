package com.ohgiraffers.section02.uses;

public class MemberFinder {
    public Member[] findAllMembers() {

        Member[] foundMembersFromRepository = MemberRepository.findAllMembers();
        // Member Repository의 필드로 있는 10 크기의 Member[]
        return MemberRepository.findAllMembers() ;
    }
}
