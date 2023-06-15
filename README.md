# ORM_Basic_JPA
Inflern 자바 ORM 표준 JPA 프로그래밍
---  

## 0x01. JPA 시작하기
- 프로젝트 생성 및 기초 실습   
  - EntityManagerFactory는 하나만, EntityManager는 사용할때마다 생성 및 삭제 필요
  - JPA에서 데이터 변경은 Transaction 안에서 실행
  - JPQL : 엔티티 객체를 조회하는 객체지향 쿼리로 개발자가 작성한 JPQL은 SQL로 변환   
 
  ```commit``` : [02f6ff7](https://github.com/meoldae/ORM_Basic_JPA/commit/02f6ff788c59f123300ff2783dc138bbcf403ad8)
- 연관관계
  - 기존의 경우 객체를 직접 참조하는게 아니라 외래키를 가지고 한번 더 조회했어야 함 -> 번거로움 
  - ```@ManyToOne, @JoinColumn```등의 어노테이션을 사용해 연관관계 매핑
  - 양방향 연관관계도 쓸 수 있지만 단방향 연관관계로도 이미 연관관계 매핑은 충분
  - 연관관계의 주인은 외래키를 가지고 있는 테이블
  
  ```commit``` : [b8ec0d4](https://github.com/meoldae/ORM_Basic_JPA/commit/b8ec0d4e98c41e1f5ebf8a2122e480490da4ba83)
