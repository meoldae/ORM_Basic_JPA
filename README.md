# ORM_Basic_JPA
Inflern 자바 ORM 표준 JPA 프로그래밍
---  

### 0x01. JPA 시작하기
- 프로젝트 생성 및 기초 실습   
  - EntityManagerFactory는 하나만, EntityManager는 사용할때마다 생성 및 삭제 필요
  - JPA에서 데이터 변경은 Transaction 안에서 실행
  - JPQL : 엔티티 객체를 조회하는 객체지향 쿼리로 개발자가 작성한 JPQL은 SQL로 변환   
 
  ```commit``` : [02f6ff7](https://github.com/meoldae/ORM_Basic_JPA/commit/02f6ff788c59f123300ff2783dc138bbcf403ad8)
### 0x05. 연관관계 매핑 기초
  - 기존의 경우 객체를 직접 참조하는게 아니라 외래키를 가지고 한번 더 조회했어야 함 -> 번거로움 
  - ```@ManyToOne, @JoinColumn```등의 어노테이션을 사용해 연관관계 매핑
  - 양방향 연관관계도 쓸 수 있지만 단방향 연관관계로도 이미 연관관계 매핑은 충분
  - 연관관계의 주인은 외래키를 가지고 있는 테이블
  
  ```commit``` : [b8ec0d4](https://github.com/meoldae/ORM_Basic_JPA/commit/b8ec0d4e98c41e1f5ebf8a2122e480490da4ba83)

### 0x06. 다양한 연관관계 매핑    
  - 일대다, 다대일, 일대일, 다대다 등 다양한 연관관계 매핑

  ```commit``` : [45bb96f](https://github.com/meoldae/ORM_Basic_JPA/commit/45bb96f1893ad90f6e7749ac1cf7c0d9e2f16bb5)

### 0x07. 고급 매핑
  - 상속관계 매핑
  - 공통 속성 상속 (```@MappedSuperclass```)
  
  ```commit``` : [d7dfe2e](https://github.com/meoldae/ORM_Basic_JPA/commit/d7dfe2e56bb28af52a4f27293c4248dc50c51b8e)
  
### 0x08. 프록시와 연관관계 정리
  - ```getReference()```
  - ```FetchType.LAZY``` 를 통해 프록시 객체를 사용하고 실제로 사용하는 시점에 초기화
  - ```@ManyToOne, @OneToOne``` : 기본이 즉시로딩
  - CASCADE : 연관된 엔티티도 함께 영속상태로 만들고 싶을 때 ( 연관관계가 두 개 이상이면 사용 금지 )
  - orphanRemoval : 부모 엔티티와 연관관계가 끊어진 고아 객체를 자동으로 삭제 ( 이 역시 연관관계 하나일때만 사용 )
  
  ```commit``` : [eb28f3a](https://github.com/meoldae/ORM_Basic_JPA/commit/eb28f3a2d7b3c19ea99248b97da0a4d6e342ec08)
