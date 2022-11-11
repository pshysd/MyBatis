package com.kh.mybatis.member.model.service;

import com.kh.mybatis.member.model.vo.Member;

// 인터페이스: 상수 필드(public static final) + 추상 메소드(public abstract)
public interface MemberService {

	// 회원가입
	/* public abstract */ int insertMember(Member m);
	
	// 로그인
	/* public abstract */ Member loginMember(Member m);
	
	// 회원정보 수정
	/* public abstract */ int updateMember(Member m);
	
	// 회원삭제
	/* public abstract */ int deleteMember(Member m);
	
	// 아이디 중복체크
	/* public abstract */ int idCheck(String checkId);

//	보통 설계 단계에서 다음과 같이 인터페이스로 추상 메소드만 설계해두고
//	실제 개발 단계에서 해당 인터페이스를 구현하는 구현체 클래스를 만들어서
//	메소드를 완성시켜서 개발한다.
}
