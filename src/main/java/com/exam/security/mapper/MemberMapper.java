package com.exam.security.mapper;

import com.exam.security.domain.MemberVO;

public interface MemberMapper {

    public MemberVO read(String userid);
}
