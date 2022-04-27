package developer.recruitment.repository;

import developer.recruitment.entities.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
class MemberRepositoryTest {

    @Autowired MemberRepository memberRepository;

    @Test
    @Transactional
    public void testMember() throws Exception {

        Member member = new Member();
        member.setNickname("kim");

        Long saveId = memberRepository.save(member);
        org.assertj.core.api.Assertions.assertThat("kim").isEqualTo(member.getNickname());


    }




}