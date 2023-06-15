package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "MEMBER") // 테이블 이름 다를 때
public class Member {

    @Id
    private Long id;

    @Column(name = "name") // 컬럼 이름 다를 때
    private String name;


}
