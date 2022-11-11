package com.kh.mybatis.member.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.member.model.vo.Member;

public class MemberDao {

	/*
	 * SqlSession 객체에서 제공하는 메소드를 통해
	 * sql문을 찾고 실행해서 결과까지 받아볼 수 있음
	 * 
	 * [ 표현법 
	 * sqlSession.sql문 종류에 맞는 메소드("mapper의namespace.해당쿼리의id", sql문을 완성시킬 데이터값);
	 * 
	 * -> INSERT 구문을 실행하고자 할 때: sqlSession.insert()
	 * -> UPDATE: sqlSession.update()
	 * -> DELETE: sqlSession.delete()
	 * -> 기존의 ? 대신에 해당 sql문에 전달된 객체로부터 값을 꺼낼 때
	 * 		#{필드명}을 이용
	 *    단일 변수 값으로 구멍을 메꿀 경우 #{매개변수명}
	 *    HashMap에 담긴 값으로 구멍을 메꿀 경우 #{키값}
	 *    
	 * 
	 * -> sql문이 완성된 상태라면 두번째 매개변수 생략 가능(아니면 생략 불가) 
	 */
	
	public int insertMember(SqlSession sqlSession, Member m) {
		return sqlSession.insert("memberMapper.insertMember",m); // m의 type이 Mapper 파일의 parameterType과 무조건 맞아야 함;
	}

	public Member loginMember(SqlSession sqlSession, Member m) {
		
		/*
		 * SELECT문을 실행할 수 있는 메소드
		 * -> 단일 행 조회 : selectOne();
		 * -> 여러 행 조회 : selectList();
		 */
		
		return sqlSession.selectOne("memberMapper.loginMember", m);
//		아무것도 없으면 null이 담겨있을 것
	}
	

}


