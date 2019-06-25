package com.assertor.partyMember.service;

import com.assertor.partyMember.dao.MemberMapper;
import com.assertor.partyMember.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemeberService {

    @Autowired
    private MemberMapper memberMapper;

    public int insert(Member member){
        return memberMapper.insert(member);
    }

    public int deleteById(Integer Id){
        return memberMapper.deleteByPrimaryKey(Id);
    }

    public List<Member> selectAll(){
        return memberMapper.selectAll();
    }

    public Member selectone(Integer Id){
        return memberMapper.selectByPrimaryKey(Id);
    }

    public int updateById(Member member){
        return memberMapper.updateByPrimaryKey(member);
    }
}
