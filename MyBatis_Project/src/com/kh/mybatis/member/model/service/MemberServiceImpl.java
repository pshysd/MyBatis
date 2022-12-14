package com.kh.mybatis.member.model.service;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.common.template.Template;
import com.kh.mybatis.member.model.dao.MemberDao;
import com.kh.mybatis.member.model.vo.Member;

public class MemberServiceImpl implements MemberService {

	@Override
	public int insertMember(Member m) {

		SqlSession sqlSession = Template.getSqlSession();

		int result = new MemberDao().insertMember(sqlSession, m);
		
//		트랜잭션 처리 
		
		if(result > 0 ) { // 성공
			sqlSession.commit();
		}
		
//		고민해볼 것: 이 시점에서 result == 0 이라면 아무것도 insert가 되지 않은 것
//					  현재 MEMBER 테이블의 내용물에는 변화가 없다.
		
//		단일 프로세스: 한 트랜잭션의 쿼리문이 한 개일 경우에는 실패 시 롤백을 굳이 안해도 됨
//		-> 단, 한 트랜잭션의 쿼리문이 여러 개일 경우에는 반드시 롤백 처리 구문을 작성해야 함
		
		sqlSession.close();
		
		return result;
	}

	@Override
	public Member loginMember(Member m) {
		
		SqlSession sqlSession = Template.getSqlSession();
		
		Member loginUser = new MemberDao().loginMember(sqlSession, m);
		
		sqlSession.close();
		
		return loginUser;
	}

	@Override
	public int updateMember(Member m) {
		return 0;
	}

	@Override
	public int deleteMember(Member m) {
		return 0;
	}

	@Override
	public int idCheck(String checkId) {
		return 0;
	}
}
