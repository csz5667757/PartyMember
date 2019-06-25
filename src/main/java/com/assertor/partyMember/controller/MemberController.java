package com.assertor.partyMember.controller;

import com.assertor.partyMember.entity.Member;
import com.assertor.partyMember.service.MemeberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemeberService memeberService;

    @RequestMapping("/insert")
    public int insert(@RequestBody Member member){
        return memeberService.insert(member);
    }

    @RequestMapping("/delete")
    public int delete(@RequestParam Integer Id){
        return memeberService.deleteById(Id);
    }

    @RequestMapping("/selectAll")
    public List<Member> selectALL(){
        return memeberService.selectAll();
    }

    @RequestMapping("/selectone")
    public Member selectById(@RequestParam("Id")Integer Id){
        return memeberService.selectone(Id);
    }

    @RequestMapping("/update")
    public int updateById(@RequestBody Member member){
        return memeberService.updateById(member);
    }
}
