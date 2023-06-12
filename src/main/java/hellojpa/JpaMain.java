package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        // 로딩 시점에 단 하나만 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        // DB Connection 코드 작성 시작

        // 트랜잭션 마다 생성
        EntityManager em = emf.createEntityManager();
        Member member = new Member();
        member.setId(3L);
        member.setName("HelloC");
        insert(em, member);

        em = emf.createEntityManager();
        delete(em, 1L);

        em = emf.createEntityManager();
        update(em, 2L, "newName");

        em = emf.createEntityManager();
        findCondition(em);

        // DB Connection 코드 작성 종료
        emf.close();
    }

    private static List<Member> findCondition(EntityManager em){
        List<Member> result = em.createQuery("SELECT m from Member as m", Member.class).getResultList();

        result.stream().forEach(member -> System.out.println(member.getName()));

        return result;
    }

    private static void update(EntityManager em, Long id, String newName) {
        // 트랜잭션 시작
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member findMember = em.find(Member.class, id);
            findMember.setName(newName);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
    }

    private static void delete(EntityManager em, Long id) {
        // 트랜잭션 시작
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            Member deleteMember = em.find(Member.class, id);
            em.remove(deleteMember);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
    }

    public static void insert(EntityManager em, Member member){
        // 트랜잭션 시작
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            em.persist(member);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
    }
}
