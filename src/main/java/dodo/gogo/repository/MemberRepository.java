package dodo.gogo.repository;

import dodo.gogo.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 저장

    Optional<Member> findById(Long id);

    Optional<Member> findByName(String name);

    List<Member> findAll();
}
